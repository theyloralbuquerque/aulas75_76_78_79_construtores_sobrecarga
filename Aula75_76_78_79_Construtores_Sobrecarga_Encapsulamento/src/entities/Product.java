package entities;

public class Product {
	
	private String name; /* Palavra PRIVATE: quer dizer que esses atributos não podem ser acessados por outras classes, apenas através dos GETTERS E SETTERS. */
	private double price;
	private int quantity;
	
	public Product() { /*Sobrecarga aqui. (Construtor padrão) */
		
	}
	
	public Product(String name, double price, int quantity) { /*Sobrecarga aqui. (Construtor também) */
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { /*Sobrecarga aqui. (Construtor também) */
		this.name = name;
		this.price = price;
	}
	
	public String getName() { /* Encapsulamento aqui. GET: acessa o atributo. */
		return name;
	}
	
	public void setName(String name) { /* Encapsulamento aqui. SET: altera o valor do atributo. */
		this.name = name;
	}

	public double getPrice() { /* Encapsulamento aqui. GET: acessa o atributo. */
		return price;
	}
	
	public void setPrice(double price) { /* Encapsulamento aqui. SET: altera o valor do atributo. */
		this.price = price;
	}
	
	public int getQuantity() { /* Encapsulamento aqui. GET: acessa o atributo. */
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units. Total: $ " + String.format("%.2f", totalValueInStock());
	}
}
