/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.repository.common;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

/**
 * Singleton wrapper class for PersistenceManagerFactory see
 * https://developers.google.com/appengine/docs/java/datastore/jdo/overview#Getting_a_PersistenceManager_Instance
 *
 * @author Toma
 */
final class PMF {

    private static final PersistenceManagerFactory pmfInstance =
            JDOHelper.getPersistenceManagerFactory("transactions-optional");

    private PMF() {
    }

    public static PersistenceManagerFactory get() {
        return pmfInstance;
    }
}