package com.gvr.cdmx.servicio.mb.scheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.gvr.cdmx.servicio.mb.scheduler.dto.MetroBusDTO;
import com.gvr.cdmx.servicio.mb.scheduler.entity.MetroBus;

@Service
public class MetroBusServiceAPIImpl extends GenericServiceAPIImpl<MetroBus,MetroBusDTO> implements MetroBusServiceAPI{
	
	@Autowired
	private Firestore firestore;
	
	@Override
	public CollectionReference getCollection() {
		return firestore.collection("mbcdmx");
	}

}
