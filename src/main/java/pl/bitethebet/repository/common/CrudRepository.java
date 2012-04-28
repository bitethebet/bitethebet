/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.repository.common;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.jdo.*;


/**
 *
 * @author Toma
 */
public class CrudRepository<T> {

    private PersistenceManagerFactory pmfInstance = PMF.get();
    protected Class parametrizetType;

    public CrudRepository() {
        setParametrizetType();
    }
    /**
     * gains the Class from T
     */
    private void setParametrizetType() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        parametrizetType = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }

   

    public Collection<T> getAll() {
        PersistenceManager pm = pmfInstance.getPersistenceManager();
        try {

            List<T> entities = new ArrayList<T>();

            Extent<T> extent = pm.getExtent(parametrizetType, false);
            for (T entity : extent) {
                entities.add(entity);
            }
            extent.closeAll();

            return entities;
        } finally {
            pm.close();
        }
    }

    public void create(T entity) {
        PersistenceManager pm = pmfInstance.getPersistenceManager();
        try {
            pm.makePersistent(entity);
        } finally {
            pm.close();
        }
    }

    public void deleteById(Long id) {
        PersistenceManager pm = pmfInstance.getPersistenceManager();
        try {
            pm.deletePersistent(pm.getObjectById(parametrizetType, id));
        } finally {
            pm.close();
        }
    }
}
