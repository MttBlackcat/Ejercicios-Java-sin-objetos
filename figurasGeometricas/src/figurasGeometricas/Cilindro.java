package figurasGeometricas;

public class Cilindro {
	
	// Atributos
		// r = Radio de la base / h = Altura
		private double radio;
		private double altura;
		private final double pi = 3.1416;

		// Constructores
		public Cilindro() {

		}

		public Cilindro(double radio, double altura) {
		
			this.altura = altura;
			this.radio = radio;
		}
		
		// Métodos
		
		public double areaBaseCilindro () {
			 
			 double areaBaseCilindro = pi*(radio*radio);
			 return areaBaseCilindro;
		 }
		 public double areaLateralCilindro () {
			 
			 return 2 * pi * radio * altura;
		 }
		 public double areaTotalCilindro () {
			 
			 return (2*areaBaseCilindro()) + areaLateralCilindro(); 
		 }
		 public double volumenCilindro () {
			 
			return areaBaseCilindro() * altura;

		 }

	}



