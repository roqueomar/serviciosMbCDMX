package com.gvr.cdmx.servicio.mb.consulta.dao;

import java.util.List;

public interface GenericCrudDaoAPI<I,O> {
	String save(I entity,String id) throws Exception;
	String save(I entity) throws Exception;	
	O get(String id) throws Exception;
	List<O> getAll() throws Exception;
}
