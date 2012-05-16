/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.model;

import com.google.appengine.api.datastore.Key;
import javax.jdo.annotations.*;

/**
 *
 * @author Toma
 */
@PersistenceCapable(detachable = "true")
public class Bet {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
    @Persistent(defaultFetchGroup="true")
    private BetDefinition definition;
    @Persistent
    private Key mainDefinitionId;
    @Persistent
    private Long userId;

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
     * @return the definition
     */
    public BetDefinition getDefinition() {
        return definition;
    }

    /**
     * @param definition the definition to set
     */
    public void setDefinition(BetDefinition definition) {
        this.definition = definition;
    }

    /**
     * @return the mainDefinitionId
     */
    public Key getMainDefinitionId() {
        return mainDefinitionId;
    }

    /**
     * @param mainDefinitionId the mainDefinitionId to set
     */
    public void setMainDefinitionId(Key mainDefinitionId) {
        this.mainDefinitionId = mainDefinitionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
