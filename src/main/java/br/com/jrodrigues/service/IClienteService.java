package br.com.jrodrigues.service;

import java.util.List;

import br.com.jrodrigues.domain.Cliente;
import br.com.jrodrigues.exception.DAOException;
import br.com.jrodrigues.service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}