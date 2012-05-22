/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.model;

/**
 *
 * @author mrowkam
 */
public enum BetCategory {

    A("groupA"), B("groupB"), C("groupC"), D("groupD"),
    QUARTER("quarter"), SEMI("semi"), FINAL("final");
 
    private String name;

    BetCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return "categories." + name;
    }
}
