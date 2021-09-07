package com.gvr.cdmx.servicio.mb.scheduler.service;

import java.util.List;

public interface GenericServiceAPI<I,O> {
	String save(I entity,String id) throws Exception;
	String save(I entity) throws Exception;	
	O get(String id) throws Exception;
	List<O> getAll() throws Exception;
}
