package figurasGeometricas;

public class Cono extends FigurasDeRevolucion {

	public Cono(double radio, double altura) {
		super(radio, altura);
	}

	public double generatriz() {

		 return Math.sqrt(this.getAltura() * this.getAltura() + this.getRadio() * this.getRadio());

	}

	public double areaLateral() {

		return  Math.PI * this.getAltura() * generatriz();
	}

	public double areaTotal() {

		
		return  Math.PI + this.getRadio() + (generatriz() * this.getRadio());
	}

	public double volumen() {

		return  (Math.PI * (Math.pow(this.getRadio(), 2) * this.getAltura())) / 3;
	}

}
