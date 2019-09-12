package com.charlison.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.charlison.cursomc.domain.Cliente;
import com.charlison.cursomc.services.ClienteServices;

@RestController
@RequestMapping(value = "/clientes")

public class ClienteRessouces {

	@Autowired
	private ClienteServices service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
