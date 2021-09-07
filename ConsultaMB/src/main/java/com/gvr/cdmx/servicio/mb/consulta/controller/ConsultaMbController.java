package com.gvr.cdmx.servicio.mb.consulta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gvr.cdmx.servicio.mb.consulta.dto.MetroBusDTO;
import com.gvr.cdmx.servicio.mb.consulta.service.MBService;

@RestController
@RequestMapping(value = "/mb/api/v1/")
public class ConsultaMbController {
	
	@Autowired
	MBService mbService;
	
	@GetMapping(value="/all")
	public List<MetroBusDTO> getAll(){
		return mbService.consUnidDisp();
	}
	
	
}
