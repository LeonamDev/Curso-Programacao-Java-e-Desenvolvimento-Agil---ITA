package exercicioPizza;

import java.util.ArrayList;


public class CarrinhoDeCompras {
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	double valorTotal =0;
	
	
	public void adicionar(Pizza p){
		   if(p.temIngrediente){
			  pizzas.add(p);
	          valorTotal = p.getPreco();
		    }
		     else
		     System.out.println("Existe Pizza que não foi adicionada ao carrinho por estar sem ingrediente");
	}
	
	
	double getValorTotal(){
		   return valorTotal;
	}
	
	
	
	public void exibirIngredientes(){
	       for ( String key : Pizza.ingredientes.keySet() ) 
			    System.out.println( key );
			
		
		}
	}

	

