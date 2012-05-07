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
        String queryParam = prepareQueryFilter(UserAccountQueryParams.USERNAME, username);
        List<UserAccount> us = (List<UserAccount>) findBySingleParamQuery(queryParam);
        return us.get(0);
    }

    private String prepareQueryFilter(UserAccountQueryParams userAccountQueryParams, String queryValue) {
        String quatation = "'";
        return userAccountQueryParams.getValue() + quatation + queryValue + quatation;
    }

    private enum UserAccountQueryParams {

        USERNAME("username == ");
        private String value;

        UserAccountQueryParams(String val) {
            this.value = val;
        }

        public String getValue() {
            return value;
        }
    }
}
