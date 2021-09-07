package com.gvr.cdmx.servicio.mb.scheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.gvr.cdmx.servicio.mb.scheduler.dao.MBDao;


@Service
public class MBServiceImpl implements MBService{
//	private final CRUDFirebase crudFirebase=new CRUDFirebase();
	@Autowired
	MBDao mbDao;
	
	@Autowired
	private MetroBusServiceAPI mBServiceAPI;
	
	@Override
	@Scheduled(fixedRate = 3600000)	// Almacenamiento histórico de datos por hr del servicio MB de la CDMX
	public void almacenarUnidades() { 
		mbDao.mbDisponible().stream().limit(5).forEach(mb->
			{
				try {//crudFirebase.addFirebase(mb);
					System.out.println("MB: "+mb.getVehicleLabel());
					mBServiceAPI.save(mb);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		);
		
	}

}
