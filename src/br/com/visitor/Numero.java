package br.com.visitor;

public class Numero implements Expressao {

	public Numero(int numero) {
		super();
		this.numero = numero;
	}

	int numero;
	
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.VisitaNumero(this);
		
	}

	@Override
	public int avalia() {
		
		return numero;
	}

}
