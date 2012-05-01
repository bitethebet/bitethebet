/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.model;

import org.springframework.security.core.GrantedAuthority;

public enum AuthorityRole implements GrantedAuthority {

    USER, ADMIN;

    @Override
    public String getAuthority() {
        return toString();
    }
}
