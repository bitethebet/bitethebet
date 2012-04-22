/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserDashboardController {

    @RequestMapping(value = "/secure/user/dashboard")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("dashboard");
        return mav;
    }
}
