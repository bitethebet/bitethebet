/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.controller;

import com.google.appengine.api.datastore.Key;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
        mav.addObject("command", new BetDefinition(Arrays.asList(new Player(),new Player())));//command
        return mav;
    }

    @RequestMapping(value = "/secure/admin/addBetDefinition")
    public String addBetDefinition(@ModelAttribute BetDefinition betDefinition, BindingResult result) {
        betDefinitionRepository.create(betDefinition);
        return "redirect:/secure/admin/betDefinitions.html";
    }
  

}
