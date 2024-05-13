package br.com.jrodrigues.service;

import java.util.List;

import br.com.jrodrigues.domain.Produto;
import br.com.jrodrigues.service.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
