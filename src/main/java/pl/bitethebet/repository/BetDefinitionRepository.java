/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.repository;

import org.springframework.stereotype.Repository;
import pl.bitethebet.model.BetDefinition;
import pl.bitethebet.repository.common.CrudRepository;

/**
 *
 * @author Toma
 */
@Repository
public class BetDefinitionRepository extends CrudRepository<BetDefinition> {
    
}
