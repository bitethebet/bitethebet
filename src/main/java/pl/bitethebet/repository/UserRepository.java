/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.repository;

import pl.bitethebet.repository.common.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.bitethebet.model.User;

@Repository
public class UserRepository extends CrudRepository<User> {
    

}
