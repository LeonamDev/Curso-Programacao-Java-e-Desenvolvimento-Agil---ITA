
public class Paciente {
	
	double peso;
	double altura;
	
	public Paciente (double peso , double altura){
		
		this.peso = peso;
		this.altura = altura;
		
		
	}
	
	
	public  double calcularIMC(){
		
		double imc = peso/(altura*altura);
		
		return imc;
		
		
	}
	
	
	
	
	public String diagnostico(){
	    
	     double calculoIMC = calcularIMC();
		
		 if(calculoIMC < 16.00) {
			 return "Baixo peso muito grave";
             } else if(calculoIMC > 16 && calculoIMC <= 16.99){
                 return "Baixo peso grave";
             } else if(calculoIMC >= 17 && calculoIMC <= 18.49){
		         return "Baixo peso";
	         }else if (calculoIMC >= 18.50 && calculoIMC <= 24.99){
		        return"Peso normal";
             }else if (calculoIMC >= 25 && calculoIMC <= 29.99){
		        return "Sobrepeso";
             }else if (calculoIMC >= 30 && calculoIMC <= 34.99){
		        return "Obesidade grau I";
             }else if (calculoIMC >= 35 && calculoIMC <= 39.99){
		        return  "Obesidade grau II";
		     } else if (calculoIMC >= 40 ){
		         return "Obesidade grau III (obesidade mórbida)";
		     } else {
		         return "Ocorreu um erro no cálculo";
		     }
		                                                                          
		
		
		
	}
	

}
