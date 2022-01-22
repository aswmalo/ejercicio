/**
 * 
 */
package com.fj.ramirez.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.dao.DataAccessException;

/**
 * @author framirez21
 *
 */
public interface GenericDao <T, PK extends Serializable> {

	
	
	/**
	 * Obtiene la entidad correspondiente en base a 
	 * su id y al id de la sede institucion propietaria de
	 * la informacion
	 * @param entity
	 * @param pk
	 * @return
	 * @throws Exception
	 */
	T findById(Class<T> entity, PK pk) throws DataAccessException;
	
	/**
	 * Obtiene el listado de entidadades solicitadas.
	 * @param entity
	 * @return
	 * @throws Exception En caso de error.
	 */
    List<T> findAll(Class<T> entity) throws DataAccessException;
  
    /**
     * Guarda o actualiza una entidad.
     * @param entity entidad a ser guardada o actualizada.
     * @param idOpeSedeInstitucion
     * @throws Exception En caso de error.
     */
    void saveOrUpdate(T entity) throws DataAccessException;
    
    /**
     * Periste una colecion de entidades.
     * @param collection Colleciona ser perisistida.
     * @param idOpeSedeInstitucion
     * @throws Exception En caso de error.
     */
    void saveAll(Collection<T> collection) throws DataAccessException;
 
    /**
     * Borra una entidad.
     * @param entity entidad a ser borrada.
     * @param idOpeSedeInstitucion
     * @throws Exception En caso de error.
     */
    void delete(T entity) throws DataAccessException;
    
    /**
     * 
     * @param entity
     * @return
     * @throws Exception
     */
    List<T> findAllByFechaBajaIsNull(Class<T> entity) throws DataAccessException;
    
    /**
     * Realiza el salvado de la entidad.
     * @param entity Entidad a persistir.
     * @param idOpeSedeInstitucion
     */
    void save(T entity) throws DataAccessException;
    
    /**
     * Realiza la actualizacion de la entidad.
     * @param entity Entidad a actualizar.
     * @param idOpeSedeInstitucion
     * @throws Exception
     */
    void update(T entity) throws DataAccessException;
}
