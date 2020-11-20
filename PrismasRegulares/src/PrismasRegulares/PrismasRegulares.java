package PrismasRegulares;


public class PrismasRegulares {

	public static void main(String[] args) {
		
		Prisma triangular = new Prisma(3, 10, 30);
		Prisma cuadrangular = new Prisma(4, 10, 30);
		Prisma pentagonal = new Prisma(5, 10, 30);
		Prisma hexagonal = new Prisma(6, 10, 30);
		
		System.out.printf(
				"N�mero de v�rtices del prisma Triangular: " + triangular.numeroDeVertices() 
				+ "%nN�mero de aristas del prisma Triangular: " + triangular.numeroDeAristas() 
				+ "%nArea lateral del prisma Triangular: " + triangular.areaLateral() 
				+ "%nPer�metro del prisma Triangular: " + triangular.perimetro() 
				+ "%n%nN�mero de v�rtices del prisma Cuadrangular: " + cuadrangular.numeroDeVertices()
				+ "%nN�mero de aristas del prisma Cuadrangular: " + cuadrangular.numeroDeAristas() 
				+ "%nArea lateral del prisma Cuadrangular: " + cuadrangular.areaLateral() 
				+ "%nPer�metro del prisma Cuadrangular: " + cuadrangular.perimetro()
				+ "%n%nN�mero de v�rtices del prisma Pentagonal: " + pentagonal.numeroDeVertices()
				+ "%nN�mero de aristas del prisma Pentagonal: " + pentagonal.numeroDeAristas() 
				+ "%nArea lateral del prisma Pentagonal: " + pentagonal.areaLateral() 
				+ "%nPer�metro del prisma Pentagonal: " + pentagonal.perimetro()
				+ "%n%nN�mero de v�rtices del prisma Hexagonal: " + hexagonal.numeroDeVertices()
				+ "%nN�mero de aristas del prisma Hexagonal: " + hexagonal.numeroDeAristas() 
				+ "%nArea lateral del prisma Hexagonal: " + hexagonal.areaLateral() 
				+ "%nPer�metro del prisma Hexagonal: " + hexagonal.perimetro());

	}

}
