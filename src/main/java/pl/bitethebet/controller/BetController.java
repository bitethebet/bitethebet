/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import pl.bitethebet.model.Bet;
import pl.bitethebet.model.BetDefinition;
import pl.bitethebet.model.Player;
import pl.bitethebet.model.UserAccount;
import pl.bitethebet.repository.BetDefinitionRepository;
import pl.bitethebet.repository.BetRepository;

/**
 *
 * @author mrowkam
 */
@Controller
@SessionAttributes(value = {"bet"})
public class BetController {

    @Autowired
    private BetDefinitionRepository betDefinitionRepository;
    @Autowired
    private BetRepository betRepository;

    @RequestMapping(value = "/secure/user/bitebet")
    public ModelAndView showBet() {
        ModelAndView mav = new ModelAndView("bitebet");
        List<BetDefinition> bets = (List<BetDefinition>) betDefinitionRepository.getAll();
        BetDefinition mainDefinition = bets.get(0); //TODO: wyciaganie beta ze wzgledu na date
        Bet bet = new Bet();
        bet.setMainDefinitionId(mainDefinition.getKey());
        List<Player> pl = new ArrayList<Player>();
        pl.add(new Player(mainDefinition.getPlayers().get(0).getName()));
        pl.add(new Player(mainDefinition.getPlayers().get(1).getName()));
        BetDefinition betDefinition = new BetDefinition(pl);
        UserAccount userAccount = (UserAccount) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        bet.setUserId(userAccount.getId());
        bet.setDefinition(betDefinition);
        mav.addObject("bet", bet);
        return mav;
    }

    @RequestMapping(value = "/secure/user/bitethebet", method = RequestMethod.POST)
    public String biteBet(@ModelAttribute("bet") Bet bet, BindingResult result) {
        betRepository.create(bet);
        return "redirect:bitebet.html";
    }
}
