package br.com.main;

import br.com.controller.ImpostoController;
import br.com.model.Pis;
import br.com.view.TelaPis;

public class TesteCalculo {
	
	public static void main(String[] args) {
		Pis model = new Pis();
		TelaPis tela = new TelaPis();
		
		model.addObserver(tela);
		
		ImpostoController controller = new ImpostoController(model,tela);
		
		tela.addController(controller);
	}

}
