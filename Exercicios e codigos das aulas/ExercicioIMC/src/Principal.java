
public class Principal {

	public static void main(String[] args) {
	
		
		
		
		Paciente p1 = new Paciente(57,1.78);
		Paciente p2 = new Paciente(70,1.70);
		Paciente p3 = new Paciente(90,1.72);
		
		
		System.out.println(" IMC do paciente 1: "+p1.calcularIMC() + " Diagnóstico do paciente 1: " + p1.diagnostico());
		System.out.println(" IMC do paciente 2: "+p2.calcularIMC()+ " Diagnóstico do paciente 2: " + p2.diagnostico());
		System.out.println(" IMC do paciente 3: "+p3.calcularIMC() + " Diagnóstico do paciente 3: " + p3.diagnostico());
	}

}
