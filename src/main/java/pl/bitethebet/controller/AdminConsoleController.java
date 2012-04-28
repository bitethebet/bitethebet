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
import pl.bitethebet.repository.CountryRepository;
import pl.bitethebet.model.Country;

/**
 *
 * @author Toma
 */
@Controller
public class AdminConsoleController {
    @Autowired
    CountryRepository countryRepository;
    
    @RequestMapping(value="/secure/admin/console")
    public ModelAndView showConsole(){
        ModelAndView mav = new ModelAndView("console");
        mav.addObject("countries", countryRepository.getAll());
        mav.addObject("command", new Country());
        return mav;
    }
    
    @RequestMapping(value="/secure/admin/addCountry", method= RequestMethod.POST)
    public String addCountry(@ModelAttribute("country") Country country, BindingResult result){
        countryRepository.create(country);
        return "redirect:/secure/admin/console.html";
    }
}
