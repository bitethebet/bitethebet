/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.model;

import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 *
 * @author Toma
 */
@PersistenceCapable
public class BetDefinition {
    
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
    @Persistent
    private Date date;
    @Persistent
    private Country playerOne;
    @Persistent
    private Country playerTwo;
    @Persistent
    private Integer playerOneScore;
    @Persistent
    private Integer playerTwoScore;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
     * @return the playerOne
     */
    public Country getPlayerOne() {
        return playerOne;
    }

    /**
     * @param playerOne the playerOne to set
     */
    public void setPlayerOne(Country playerOne) {
        this.playerOne = playerOne;
    }

    /**
     * @return the playerTwo
     */
    public Country getPlayerTwo() {
        return playerTwo;
    }

    /**
     * @param playerTwo the playerTwo to set
     */
    public void setPlayerTwo(Country playerTwo) {
        this.playerTwo = playerTwo;
    }

    /**
     * @return the playerOneScore
     */
    public Integer getPlayerOneScore() {
        return playerOneScore;
    }

    /**
     * @param playerOneScore the playerOneScore to set
     */
    public void setPlayerOneScore(Integer playerOneScore) {
        this.playerOneScore = playerOneScore;
    }

    /**
     * @return the playerTwoScore
     */
    public Integer getPlayerTwoScore() {
        return playerTwoScore;
    }

    /**
     * @param playerTwoScore the playerTwoScore to set
     */
    public void setPlayerTwoScore(Integer playerTwoScore) {
        this.playerTwoScore = playerTwoScore;
    }
    
}
