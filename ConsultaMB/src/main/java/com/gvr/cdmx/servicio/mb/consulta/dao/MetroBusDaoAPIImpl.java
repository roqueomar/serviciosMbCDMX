package com.gvr.cdmx.servicio.mb.consulta.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.gvr.cdmx.servicio.mb.consulta.dto.MetroBusDTO;
import com.gvr.cdmx.servicio.mb.consulta.entity.MetroBus;

@Service
public class MetroBusDaoAPIImpl extends GenericCrudDaoAPIImpl<MetroBus,MetroBusDTO> implements MetroBusDaoAPI{
	
	@Autowired
	private Firestore firestore;
	
	@Override
	public CollectionReference getCollection() {
		return firestore.collection("mbcdmx");
	}

}
