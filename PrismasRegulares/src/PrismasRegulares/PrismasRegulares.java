package PrismasRegulares;


public class PrismasRegulares {

	public static void main(String[] args) {
		
		Prisma triangular = new Prisma(3, 10, 30);
		Prisma cuadrangular = new Prisma(4, 10, 30);
		Prisma pentagonal = new Prisma(5, 10, 30);
		Prisma hexagonal = new Prisma(6, 10, 30);
		
		System.out.printf(
				"Número de vértices del prisma Triangular: " + triangular.numeroDeVertices() 
				+ "%nNúmero de aristas del prisma Triangular: " + triangular.numeroDeAristas() 
				+ "%nArea lateral del prisma Triangular: " + triangular.areaLateral() 
				+ "%nPerímetro del prisma Triangular: " + triangular.perimetro() 
				+ "%n%nNúmero de vértices del prisma Cuadrangular: " + cuadrangular.numeroDeVertices()
				+ "%nNúmero de aristas del prisma Cuadrangular: " + cuadrangular.numeroDeAristas() 
				+ "%nArea lateral del prisma Cuadrangular: " + cuadrangular.areaLateral() 
				+ "%nPerímetro del prisma Cuadrangular: " + cuadrangular.perimetro()
				+ "%n%nNúmero de vértices del prisma Pentagonal: " + pentagonal.numeroDeVertices()
				+ "%nNúmero de aristas del prisma Pentagonal: " + pentagonal.numeroDeAristas() 
				+ "%nArea lateral del prisma Pentagonal: " + pentagonal.areaLateral() 
				+ "%nPerímetro del prisma Pentagonal: " + pentagonal.perimetro()
				+ "%n%nNúmero de vértices del prisma Hexagonal: " + hexagonal.numeroDeVertices()
				+ "%nNúmero de aristas del prisma Hexagonal: " + hexagonal.numeroDeAristas() 
				+ "%nArea lateral del prisma Hexagonal: " + hexagonal.areaLateral() 
				+ "%nPerímetro del prisma Hexagonal: " + hexagonal.perimetro());

	}

}
