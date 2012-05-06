/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.bitethebet.repository.UserAccountRepository;

/**
 *
 * @author Toma
 */
@Controller
public class AdminUserAccountController {
    
    @Autowired
    UserAccountRepository userAccountRepository;
    
    @RequestMapping(value="/secure/admin/users")
    public ModelAndView showUserAccounts() {
        ModelAndView mav = new ModelAndView("users");
        return mav;
    }
}
