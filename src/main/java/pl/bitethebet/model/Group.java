/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.model;

/**
 *
 * @author mrowkam
 */
public enum Group {

    A("groupA"), B("groupB"), C("groupC"), D("groupD"),
    QUARTER("quarter"), SEMI("semi"), FINAL("final");
 
    private String name;

    Group(String name) {
        this.name = name;
    }

    public String getName() {
        return "groups." + name;
    }
}
