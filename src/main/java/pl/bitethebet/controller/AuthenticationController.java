/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.bitethebet.model.AuthorityRole;
import pl.bitethebet.model.UserAccount;
import pl.bitethebet.repository.UserAccountRepository;

@Controller
public class AuthenticationController {
    
    @Autowired
    private UserAccountRepository userAccountRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private SaltSource saltSource;
    
    @RequestMapping(value = "/login")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("command", new UserAccount());        
        return mav;
    }
    
    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") UserAccount user, BindingResult result) {
        user.setAuthorityRole(AuthorityRole.ROLE_USER);
        user.setPassword(passwordEncoder.encodePassword(user.getPassword(), saltSource.getSalt(user)));
        userAccountRepository.create(user);
        return "redirect:index.html";
    }
    
    @RequestMapping(value = "/register")
    public ModelAndView register() {
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("command", new UserAccount());
        return mav;
    }
}
