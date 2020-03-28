package br.com.model;

import java.util.Observable;

import br.com.config.ConfigSingleton;

// Observable usa o padrao de projeto Observer
public class Pis extends Observable implements Imposto {
	
	private float aliquota;
	
	private float valorPis;
	
	public Pis() {
		aliquota = Float.parseFloat(
		ConfigSingleton.getInstance().getProperty("aliquota"));
	}

	@Override
	public void calcularImposto(float valor) {
		setChanged();
		valorPis = valor * aliquota;
		notifyObservers(getValorPis());
	}
	
	public float getValorPis() {
		return valorPis;
		
	}

}
