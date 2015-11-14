package br.com.visitor;

public class Soma implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public int avalia() {
        int resultadoDaEsquerda = esquerda.avalia();
        int resultadoDaDireita = direita.avalia();
        return resultadoDaEsquerda + resultadoDaDireita;
    }
    
    /* (non-Javadoc)
	 * @see br.com.visitor.Expressao#aceita(br.com.visitor.Visitor)
	 */
	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaSoma(this);
		
	}
	
	
	public Expressao getEsquerda(){
		return esquerda;
	}
	
	public Expressao getDireita(){
		return direita;
	}
	
}
