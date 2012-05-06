/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.bitethebet.model.UserAccount;
import pl.bitethebet.repository.UserAccountRepository;

/**
 *
 * @author mrowkam
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserAccountRepository userAccountRepository;


    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        UserAccount userAccount = userAccountRepository.findByUsername(string);
        if (userAccount == null) {
            throw new UsernameNotFoundException("Username not found exception");
        }
        return userAccount;

    }
    public UserAccountRepository getUserAccountRepository() {
        return userAccountRepository;
    }

    public void setUserAccountRepository(UserAccountRepository userRepository) {
        this.userAccountRepository = userRepository;
    }
}
