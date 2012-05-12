/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.bitethebet.model.UserAccount;

/**
 *
 * @author mrowkam
 */
@Controller
public class BiteBetDashboardController {

    @RequestMapping(value = "/index")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("user", new UserAccount());
        mav.addObject("userToRegister", new UserAccount());
        return mav;
    }
}
