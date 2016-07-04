package exercicioPizza;


import java.util.HashMap;

public class Pizza {
	 static HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();
	 static int countIngrediente = 0;
	 int posicao = 0;
	 public boolean temIngrediente;
	
	
	
	public void adicionaIngrediente(String ingrediente){
		registraUsoIngrediente(ingrediente);
		temIngrediente = true;
		
   
	}
	

	
	public double getPreco(){
	    double preco =0;
	    	   preco = 
	    	   (countIngrediente > 0 && countIngrediente <= 2 ) ? 15.0 :
			   (countIngrediente >= 3 && countIngrediente <=5 ) ? 20.0 : 23.0;

		return preco;
		
	
	}
	
	
	
	public static void  registraUsoIngrediente(String ingrediente){
		         ingredientes.put(ingrediente, countIngrediente++);
		
    
	}

}
