package br.com.jrodrigues.dao;

import java.util.List;

import br.com.jrodrigues.dao.generic.IGenericDAO;
import br.com.jrodrigues.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
