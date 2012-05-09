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
import pl.bitethebet.repository.PlayerRepository;
import pl.bitethebet.model.Player;

/**
 *
 * @author Toma
 */
@Controller
public class AdminCountryController {
    @Autowired
    PlayerRepository countryRepository;
    
    @RequestMapping(value="/secure/admin/console")
    public ModelAndView showCountries(){
        ModelAndView mav = new ModelAndView("console");
        mav.addObject("countries", countryRepository.getAll());
        mav.addObject("command", new Player());
        return mav;
    }
    
    @RequestMapping(value="/secure/admin/addCountry", method= RequestMethod.POST)
    public String addCountry(@ModelAttribute("country") Player country, BindingResult result){
        countryRepository.create(country);
        return "redirect:/secure/admin/console.html";
    }
}
