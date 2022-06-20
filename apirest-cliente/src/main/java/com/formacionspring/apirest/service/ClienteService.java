package com.formacionspring.apirest.service;

import java.util.List;

import com.formacionspring.apirest.entity.Cliente;

public interface ClienteService {
	
	//Metodo para mostar todos los clientes//
	public List<Cliente> mostrarTodos();
	
	//Metodo para mostrar un cliente por id//
	public Cliente mostrarPorId(Long id);
	
	//Metodo para para guardar un cliente//
	public Cliente guardar(Cliente cliente);
	
	//Metodo para borrar un cliente//
	public void borar(Long id);

}
