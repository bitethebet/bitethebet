/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.security;

import org.springframework.context.annotation.DependsOn;
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
public class UserAccountDetailsService implements UserDetailsService {

   // @Autowired
    private UserAccountRepository userAccountRepository;

    public UserAccountRepository getUserAccountRepository() {
        return userAccountRepository;
    }

    public void setUserAccountRepository(UserAccountRepository userRepository) {
        this.userAccountRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        UserAccount userAccount = userAccountRepository.findByUsername(string);
        return userAccount;

    }
}
