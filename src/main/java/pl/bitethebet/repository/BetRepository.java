/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.repository;

import org.springframework.stereotype.Repository;
import pl.bitethebet.model.Bet;
import pl.bitethebet.repository.common.CrudRepository;

/**
 *
 * @author mrowkam
 */
@Repository
public class BetRepository extends CrudRepository<Bet> {

}
