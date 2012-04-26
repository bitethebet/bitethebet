/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.bitethebet.dao.UserRepository;
import pl.bitethebet.model.AuthorityRole;
import pl.bitethebet.model.User;

@Controller
public class AuthenticationController {

    @Autowired
    private UserRepository ur;

    @RequestMapping(value = "/login")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("login");
        //TODO: log login results        
        return mav;
    }

    @RequestMapping(value = "/register")
    public ModelAndView register() {
        ModelAndView mav = new ModelAndView("register");
        return mav;
    }
      
}
