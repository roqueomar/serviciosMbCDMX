package com.gvr.cdmx.servicio.mb.scheduler.util;

import java.util.HashMap;
import java.util.Map;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.gvr.cdmx.servicio.mb.scheduler.conf.ConexionFirebase;
import com.gvr.cdmx.servicio.mb.scheduler.entity.MetroBus;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class CRUDFirebase {
	
	private static Firestore db=null;
	
	public CRUDFirebase(){
		ConexionFirebase conexionFirebase= new ConexionFirebase();
		db=conexionFirebase.iniciarFirebase();	
	}
	
	public boolean addFirebase(MetroBus metroBus){
		boolean key=false;
		
		Map<String, Object> docData=new HashMap<>();

		docData.put("date_updated",metroBus.getDateUpdated());
		docData.put("vehicle_id",metroBus.getVehicleId());
		docData.put("vehicle_label",metroBus.getVehicleLabel());
		docData.put("vehicle_current_status",metroBus.getVehicleCurrentStatus());
		docData.put("position_latitude",metroBus.getPositionLatitude());
		docData.put("position_longitude",metroBus.getPositionLongitude());
		docData.put("geographic_point",metroBus.getGeographicPoint());
		docData.put("position_speed",metroBus.getPositionLatitude());
		docData.put("position_odometer",metroBus.getPositionOdometer());
		docData.put("trip_schedule_relationship",metroBus.getTripScheduleRelationship());
		docData.put("trip_id",metroBus.getTripId());
		docData.put("trip_start_date",metroBus.getTripStartDate());
		docData.put("trip_route_id",metroBus.getTripRouteId());
			
		ApiFuture<WriteResult> future = db.collection("mbcdmx").document(UUID.randomUUID().toString()).set(docData);
			
		try {
			System.out.println("Actualización: "+future.get().getUpdateTime());
			key=true;
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}	
			
		return key;
	}
}
