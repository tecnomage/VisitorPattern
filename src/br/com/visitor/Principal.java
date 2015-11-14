package br.com.visitor;

public class Principal {

	public static void main(String[] args) {
		Expressao esq= new Soma(new Numero(3),new Numero(4));
		Expressao dir= new Subtracao(new Numero(3), new Numero(5));
		Expressao soma = new Soma(esq,dir); 
		
		Visitor visitor = new ImpressoraVisitor();
        soma.aceita(visitor);

	}

}
