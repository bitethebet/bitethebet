/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Toma
 */
@Controller
public class AdminConsoleController {
    @RequestMapping(value="/secure/admin/console")
    public ModelAndView showConsole(){
        return new ModelAndView("console");
    }
}
