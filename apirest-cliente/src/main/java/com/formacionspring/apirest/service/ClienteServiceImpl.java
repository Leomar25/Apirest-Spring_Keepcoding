package com.formacionspring.apirest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.formacionspring.apirest.entity.Cliente;
import com.formacionspring.apirest.repository.ClienteDao;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired    //Esta anotaacion permite la inyeccion de dependencia//
	private ClienteDao clienteDao;
	
	
	@Override	
	@Transactional(readOnly = true)
	public List<Cliente> mostrarTodos() {     //Cast, permite la reafirmacion de una variable al que se le va a dar un valor determinado//
		return (List<Cliente>) clienteDao.findAll();
	}


	@Override
	@Transactional(readOnly = true)
	public Cliente mostrarPorId(Long id) {
		return clienteDao.findById(id).orElse(null);
	}


	@Override
	@Transactional		
	public Cliente guardar(Cliente cliente) {
		return clienteDao.save(cliente);
	}


	@Override
	@Transactional
	public void borar(Long id) {
		clienteDao.deleteById(id);;
		
	}
	
	

}
