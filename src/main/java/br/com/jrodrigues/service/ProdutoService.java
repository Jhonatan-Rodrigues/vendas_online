package br.com.jrodrigues.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.jrodrigues.dao.IProdutoDAO;
import br.com.jrodrigues.domain.Produto;
import br.com.jrodrigues.service.generic.GenericService;

@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
