/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pl.bitethebet.model.*;
import pl.bitethebet.repository.BetDefinitionRepository;
import pl.bitethebet.repository.PlayerRepository;

/**
 *
 * @author Toma
 */
@Controller
public class AdminBetDefinitionController {

    @Autowired
    BetDefinitionRepository betDefinitionRepository;
    @Autowired
    PlayerRepository countryRepository;

    @RequestMapping(value = "/secure/admin/betDefinitions")
    public ModelAndView showBetDefinitions() {
        ModelAndView mav = new ModelAndView("betDefinitions");
        mav.addObject("players", countryRepository.getAll());
        mav.addObject("betDefinitions", betDefinitionRepository.getAll());
        mav.addObject("command", new BetDefinition(Arrays.asList(new Player(), new Player())));
        mav.addObject("groups", Group.values());
        return mav;
    }

    @RequestMapping(value = "/secure/admin/addBetDefinition")
    public String addBetDefinition(@ModelAttribute BetDefinition betDefinition, BindingResult result) {
        if (!result.hasErrors()){
            betDefinitionRepository.create(betDefinition);result.hasErrors();
        }
        return "redirect:/secure/admin/betDefinitions.html";
    }
}
