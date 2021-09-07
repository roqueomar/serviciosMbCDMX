package com.gvr.cdmx.servicio.mb.scheduler.service;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

@SuppressWarnings("unchecked")
public abstract class GenericServiceAPIImpl<I,O> implements GenericServiceAPI<I,O>{

	private Class<O> clazz;
	

	GenericServiceAPIImpl(){
		this.clazz=((Class<O>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1]);
	}
	
	@Override
	public String save(Object entity, String id) throws Exception {
		
 		return null;
	}

	@Override
	public String save(I entity) throws Exception {
		return getCollection().add(entity).get().getId();
 		//return null;
	}

	@Override
	public O get(String id) throws Exception {
 		return null;
	}

	@Override
	public List<O> getAll() throws Exception {
		List<O> result = new ArrayList<O>();
		ApiFuture<QuerySnapshot> query = getCollection().get();
		List<QueryDocumentSnapshot> documents = query.get().getDocuments();
		for (QueryDocumentSnapshot doc : documents) {
			O object = doc.toObject(clazz);
			PropertyUtils.setProperty(object, "id", doc.getId());
			result.add(object);
		}
		return result;
	}
	
	public abstract CollectionReference getCollection();

}
