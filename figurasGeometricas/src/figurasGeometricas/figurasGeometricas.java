package figurasGeometricas;

public class figurasGeometricas {

	public static void main(String[] args) {
		// Declaraciones
		double r = 2.5;
		double h = 10;
		// Creación de objetos
		Cilindro cilindro = new Cilindro(2.5, 10.0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Cono cono = new Cono(2.5, 10.0);
		// Instruciones del método main
		System.out.printf(
				"Area de la base del Cilindro: " + cilindro.areaBaseCilindro() 
				+ "%nArea del lateral del Cilindro: " + cilindro.areaLateralCilindro() 
				+ "%nArea total del Cilindro: " + cilindro.areaTotalCilindro() 
				+ "%nVolumen del Cilindro: " + cilindro.volumenCilindro() 
				+ "%nGeneratriz del Cono: " + cono.generatriz() 
				+ "%nArea de la base del Cono" + cono.areaBase()
				+ "%nArea del lateral del Cono: " + cono.areaLateral()
				+ "%nArea total del Cono: " + cono.areaTotal()
				+ "%nVolumen del Cono: " + cono.volumen());
				  
	}

}
