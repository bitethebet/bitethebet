/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.bitethebet.model.UserAccount;
import pl.bitethebet.repository.UserAccountRepository;

/**
 *
 * @author mrowkam
 */
public class UserAccountDetailsService implements UserDetailsService {

   // @Autowired
    UserAccountRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        UserAccount userAccount = userRepository.findByUsername(string);
        return userAccount;

    }
}
