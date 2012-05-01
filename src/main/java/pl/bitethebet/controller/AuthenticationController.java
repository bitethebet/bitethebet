/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/login")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("login");
        UserAccount user = new UserAccount();
        mav.addObject("command", new UserAccount());       
        return mav;
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") UserAccount user, BindingResult result) {
        user.setAuthorityRole(AuthorityRole.ROLE_USER);
        userAccountRepository.create(user);
        return "redirect:login.html";
    }

    @RequestMapping(value = "/register")
    public ModelAndView register() {
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("command", new UserAccount());
        return mav;
    }
}
