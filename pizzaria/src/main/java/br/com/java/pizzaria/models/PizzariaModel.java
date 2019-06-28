package br.com.java.pizzaria.models;

public class PizzariaModel {
	private String sabor;
	private String massa;
	private String tipoDeBorda;
	private double valor;
	
	public PizzariaModel() {
		
	}
	public PizzariaModel(String sabor, String massa, String tipoDeBorda, double valor) {
		super();
		this.sabor = sabor;
		this.massa = massa;
		this.tipoDeBorda = tipoDeBorda;
		this.valor = valor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getTipoDeBorda() {
		return tipoDeBorda;
	}

	public void setTipoDeBorda(String tipoDeBorda) {
		this.tipoDeBorda = tipoDeBorda;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("Sabor:" + this.sabor);
		modelo.append("Tipo de massa:" + this.massa);
		modelo.append("Tipo de borda:" + this.tipoDeBorda);
		modelo.append("Valor:" + this.valor);
		
		return modelo.toString();
	}
}
