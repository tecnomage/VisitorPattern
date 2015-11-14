package br.com.visitor;

public interface Visitor {
	
	public void visitaSoma(Soma soma);
	public void visitaSubtracao(Subtracao sub);
	public void VisitaNumero(Numero numero);

}
