/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import pl.bitethebet.model.UserAccount;
import pl.bitethebet.repository.common.CrudRepository;

/**
 *
 * @author mrowkam
 */
@Repository
public class UserAccountRepository extends CrudRepository<UserAccount> {

    public UserAccount findByUsername(String username) {
        UserAccount userAccount = findSingleResultBySingleParamQuery("username == " + "'"+username+"'");
        return userAccount;
    }
}
