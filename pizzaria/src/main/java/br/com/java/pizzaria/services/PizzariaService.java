package br.com.java.pizzaria.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.java.pizzaria.models.PizzariaModel;

@Service
public class PizzariaService {

	private Map<Integer, PizzariaModel> sabores = new HashMap<Integer, PizzariaModel>();
	{
		{
			sabores.put(1, new PizzariaModel("Brócolis c/ bacon", "Fina", "Recheada c/ catupiry", 35.00));
			sabores.put(2, new PizzariaModel("Frango c/ catupiry", "Grossa", "Recheada c/ cheddar", 20.00));
			sabores.put(3, new PizzariaModel("Calabresa c/ cebola", "Grossa", "Recheada c/ catupiry", 19.99));
			sabores.put(4, new PizzariaModel("Romeu e Julieta", "Fina", "Recheada c/ chocolate", 50.00));
			sabores.put(5, new PizzariaModel("Chocolate c/ morango", "Fina", "Recheada c/ chocolate branco", 55.00));

		}
	};

	public Collection<PizzariaModel> saboresDisponiveis() {
		return this.sabores.values();
	}
	public void listaSabores(PizzariaModel pizzariaModel) {
		sabores.put(sabores.size()+1, pizzariaModel);
	}
}