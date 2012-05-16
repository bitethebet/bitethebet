/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.model;

import com.google.appengine.api.datastore.Key;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 *
 * @author Toma
 */

@PersistenceCapable(detachable="true")
public class Player {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
    @Persistent
    private String name;
    
    @Persistent
    private Integer score;
   
    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the key
     */
    public Key getKey() {
        
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * @return the score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(Integer score) {
        this.score = score;
    }
    
}
