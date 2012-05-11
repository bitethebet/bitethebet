/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.model;

import java.util.List;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 *
 * @author Toma
 */
@PersistenceCapable(detachable = "true")
public class Bet {
    
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
    @Persistent
    private BetDefinition definition; //mozliwe ze trzeba bedzie zmienic klucz w betDefinition na key bo tutaj jest jako child
    @Persistent
    private Long mainDefinitionId;

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
    public Long getMainDefinitionId() {
        return mainDefinitionId;
    }

    /**
     * @param mainDefinitionId the mainDefinitionId to set
     */
    public void setMainDefinitionId(Long mainDefinitionId) {
        this.mainDefinitionId = mainDefinitionId;
    }
    
    
    
    
}
