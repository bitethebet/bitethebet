/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.model;

import com.google.appengine.api.datastore.Key;
import java.util.Date;
import java.util.List;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Toma
 */
@PersistenceCapable(detachable = "true")
public class BetDefinition {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
    @DateTimeFormat
    @Persistent   
    @NotNull
    private Date date;
    @Persistent
    private BetCategory betCategory;
    @Persistent(defaultFetchGroup = "true")
    private List<Player> players;

    public BetDefinition(List<Player> _palyers) {
        players = _palyers;
    }

    /**
     * @return the id
     */
    public Key getKey() {
        return key;
    }

    /**
     * @param id the id to set
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the players
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public BetCategory getBetCategory() {
        return betCategory;
    }

    public void setBetCategory(BetCategory betCategory) {
        this.betCategory = betCategory;
    }
}
