package PrismasRegulares;

public class Prisma {

	// Atributos

	int ladosBase, lado, altura;

	// Constructores

	public Prisma() {

	}

	public Prisma(int ladosBase, int lado, int altura) {

		this.ladosBase = ladosBase;
		this.lado = lado;
		this.altura = altura;

	}

	// Métodos

	public int numeroDeVertices() {
		return 2 * ladosBase;
	}

	public int numeroDeAristas() {
		return 3 * ladosBase;
	}

	public int areaLateral() {
		return ladosBase * lado * altura;
	}

	public int perimetro() {
		return lado * numeroDeAristas();
	}

}