package com.gvr.cdmx.servicio.mb.scheduler.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.gvr.cdmx.servicio.mb.scheduler.entity.GeneralResponseMB;
import com.gvr.cdmx.servicio.mb.scheduler.entity.MetroBus;

@Component
public class MBDaoImpl implements MBDao {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<MetroBus> mbDisponible() {
		ResponseEntity<GeneralResponseMB> response =
				  restTemplate.getForEntity(
				  "https://datos.cdmx.gob.mx/api/3/action/datastore_search?resource_id=ad360a0e-b42f-482c-af12-1fd72140032e&limit=208",
				  GeneralResponseMB.class);				
		return Arrays.asList(response.getBody().getResult().getRecords());
	}


}
