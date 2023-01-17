package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);
		
		product.setName("Computador");
		System.out.println("Atualização do Produto: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Atualização do Preço: " + product.getPrice());
		
		System.out.println();
		System.out.println("Dados do Produto: " + product);
		
		System.out.println();
		System.out.print("Digite a quantidade de produto que irá adicionar ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		
		
		System.out.println();
		System.out.println("Dados do Produto: " + product);
		
		System.out.println();
		System.out.print("Digite a quantidade de produtos que irá remover do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		
	
		sc.close();
	}

}
