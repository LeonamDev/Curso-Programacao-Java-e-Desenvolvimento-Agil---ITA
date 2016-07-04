package exercicioPizza;



public class Principal {

	public static void main(String[] args) {

    Pizza p1 = new Pizza();
    Pizza p2= new Pizza();
    Pizza p3= new Pizza();
    
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    p1.adicionaIngrediente("Cebola");  
    p1.adicionaIngrediente("Queijo"); 
    p2.adicionaIngrediente("Alface");
    p2.adicionaIngrediente("Salame");
    p3.adicionaIngrediente("Mussarela");
    

    carrinho.adicionar(p1);
    carrinho.adicionar(p2);
    carrinho.adicionar(p3);
    
    



   System.out.println("Valor total do carrinho: "+carrinho.getValorTotal());

   System.out.println("Ingredientes das Pizzas: ");
   carrinho.exibirIngredientes();
	

		
		
		
		
		
		
		
	}

}
