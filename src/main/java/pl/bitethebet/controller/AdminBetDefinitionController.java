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
public class AdminBetDefinitionController {
    
    @RequestMapping(value="/secure/admin/betDefinitions")
    public ModelAndView showBetDefinitions() {
        return new ModelAndView("betDefinitions");
    }
}
