package br.com.jrodrigues.dao;

import java.util.List;

import br.com.jrodrigues.dao.generic.IGenericDAO;
import br.com.jrodrigues.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
