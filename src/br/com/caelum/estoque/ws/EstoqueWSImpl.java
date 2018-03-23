package br.com.caelum.estoque.ws;

import java.util.Arrays;

import javax.jws.WebService;

@WebService(endpointInterface="br.com.caelum.estoque.ws.EstoqueWS",
serviceName="EstoqueWS",
portName="EstoqueWSPort")
public class EstoqueWSImpl implements EstoqueWS {

	@Override
	public Itens todosOsItens(Filtros filtros) {
		System.out.println("Chamando todos os itens");
		Itens listaItens = new Itens();
		listaItens.itens = Arrays.asList(geraItem());
		return listaItens;
	}

	@Override
	public CadastrarItemResponse cadastrarItem(CadastrarItem parameters, TokenUsuario tokenUsuario)
			throws AutorizacaoException {
		System.out.println("Chamando cadastrarItem");
		CadastrarItemResponse resposta = new CadastrarItemResponse();
		resposta.setItem(geraItem());
		return resposta;
	}
	
	private Item geraItem() {
		Item item = new Item();
		item.codigo = "MEA";
		item.nome = "MEAN";
		item.quantidade = 5;
		item.tipo = "Livro";
		return item;
	}	
}