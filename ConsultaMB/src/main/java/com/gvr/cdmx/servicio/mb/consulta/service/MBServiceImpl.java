package com.gvr.cdmx.servicio.mb.consulta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gvr.cdmx.servicio.mb.consulta.dao.MetroBusDaoAPI;
import com.gvr.cdmx.servicio.mb.consulta.dto.MetroBusDTO;

@Service
public class MBServiceImpl implements MBService {
	
	@Autowired
	MetroBusDaoAPI mbDao;

	@Override
	public List<MetroBusDTO> consUnidDisp() {
		try {
			mbDao.getAll().stream().limit(5).forEach(mb -> {
				System.out.println("MB: " + mb.getVehicleLabel());
			});
			return mbDao.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
