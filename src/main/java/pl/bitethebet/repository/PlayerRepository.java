/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.repository;

import org.springframework.stereotype.Repository;
import pl.bitethebet.model.Player;
import pl.bitethebet.repository.common.CrudRepository;

/**
 *
 * @author Toma
 */
@Repository
public class PlayerRepository extends CrudRepository<Player> {
  public Player findByName(String name){
        return findBySingleParamQuery2("name == '"+name+"'");        
    }
     
}
