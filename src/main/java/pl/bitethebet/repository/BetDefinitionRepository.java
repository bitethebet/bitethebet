/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.bitethebet.model.BetDefinition;
import pl.bitethebet.model.Player;
import pl.bitethebet.repository.common.CrudRepository;

/**
 *
 * @author Toma
 */
@Repository
public class BetDefinitionRepository extends CrudRepository<BetDefinition> {

    @Autowired
    PlayerRepository countryRepository;

    @Override
    public void create(BetDefinition entity) {
        fetchChildren(entity);
        super.create(entity);
    }

    private void fetchChildren(BetDefinition entity) {
        for (Player player : entity.getPlayers()) {
            Player fetchedPlayer = countryRepository.findByName(player.getName());
            player = fetchedPlayer;
        }

    }
}
