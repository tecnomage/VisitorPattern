package br.com.visitor;

public interface Expressao {
	
	public int avalia();
	public void aceita(Visitor visitor);


}
