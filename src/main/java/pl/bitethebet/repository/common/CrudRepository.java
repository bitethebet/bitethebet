/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.repository.common;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;

/**
 *
 * @author Toma
 */
public class CrudRepository<T> {

    protected PersistenceManagerFactory pmfInstance = PMF.get();
    private Class parametrizetType;

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
            Query query = pm.newQuery(parametrizetType);
            List<T> queryEntityResults = (List<T>) query.execute();
            queryEntityResults.size();
            return queryEntityResults;
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

    public T getById(Long id) {
        PersistenceManager pm = pmfInstance.getPersistenceManager();
        try {

            return (T) pm.getObjectById(parametrizetType, id);
        } finally {
            pm.close();
        }
    }

    public Collection<T> findBySingleParamQuery(String queryFilter) {
        PersistenceManager pm = pmfInstance.getPersistenceManager();
        try {
            List<T> queryEntityResults;
            Query query = pm.newQuery(parametrizetType);
            query.setFilter(queryFilter);
            queryEntityResults = (List<T>) query.execute();
            queryEntityResults.size();
            return queryEntityResults;

        } finally {
            pm.close();
        }
    }

    public T findSingleResultBySingleParamQuery(String queryFilter) {
        PersistenceManager pm = pmfInstance.getPersistenceManager();
        try {
            List<T> queryEntityResults;
            Query query = pm.newQuery(parametrizetType);
            query.setFilter(queryFilter);
            queryEntityResults = (List<T>) query.execute();
            queryEntityResults.size();
            if (!queryEntityResults.isEmpty()) {
                return pm.detachCopy(queryEntityResults.get(0));
            }
            return null;

        } finally {
            pm.close();
        }
    }

    public Collection<T> findByQuery(List<String> queryFilters, Class type) {
        PersistenceManager pm = pmfInstance.getPersistenceManager();
        try {
            List<T> queryEntityResults;
            Query query = pm.newQuery(parametrizetType);
            for (String queryFilter : queryFilters) {
                query.setFilter(queryFilter);
            }
            queryEntityResults = (List<T>) query.execute();
            queryEntityResults.size();
            return queryEntityResults;

        } finally {
            pm.close();
        }
    }
}
