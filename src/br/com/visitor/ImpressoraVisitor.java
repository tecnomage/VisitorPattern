package br.com.visitor;

public class ImpressoraVisitor implements Visitor{

	/* (non-Javadoc)
	 * @see br.com.visitor.Visitor#visitaSoma(br.com.visitor.Soma)
	 */
	 
	
		public void visitaSoma(Soma soma) {
	        System.out.print("(");
	        soma.getEsquerda().aceita(this);
	        System.out.print(" + ");
	        soma.getDireita().aceita(this);
	        System.out.print(")");

	    }

	/* (non-Javadoc)
	 * @see br.com.visitor.Visitor#visitaSubitracao(br.com.visitor.Subtracao)
	 */
	@Override
	public void visitaSubtracao(Subtracao sub) {
		System.out.print("(");
        sub.getEsquerda().aceita(this);
        System.out.print(" - ");
        sub.getDireita().aceita(this);
        System.out.print(")");
		
	}

	/* (non-Javadoc)
	 * @see br.com.visitor.Visitor#VisitaNumero(br.com.visitor.Numero)
	 */
	@Override
	public void VisitaNumero(Numero numero) {
		System.out.println(numero.getNumero());
		
	}

	
	

}
