package figurasGeometricas;

public class FigurasDeRevolucion {

	private double radio;
	private double altura;

	public FigurasDeRevolucion(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double areaBase() {

		return Math.PI * (radio * radio);

	}

}
