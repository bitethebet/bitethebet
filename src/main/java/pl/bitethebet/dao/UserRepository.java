/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import org.springframework.stereotype.Repository;
import pl.bitethebet.model.User;

@Repository
public class UserRepository {
    
	PersistenceManagerFactory pmfInstance = JDOHelper.getPersistenceManagerFactory("transactions-optional");

	public Collection<User> getAll() {
		PersistenceManager pm = pmfInstance.getPersistenceManager();
		try {
			List<User> messages = new ArrayList<User>();
		    Extent<User> extent = pm.getExtent(User.class, false);
		    for (User user : extent) {
		        messages.add(user);
		    }
		    extent.closeAll();
			
		    return messages;
		} finally {
			pm.close();
		}
	}

	public void create(User user) {
		PersistenceManager pm = pmfInstance.getPersistenceManager();
		try {
		    pm.makePersistent(user);
		} finally {
			pm.close();
		}
	}
}
