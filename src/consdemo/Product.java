package consdemo;

public class Product {

	int productId;
	String productName;
	int quantityOnHand;
	int price;
	//constructor - used to initialize
	public Product() {
		productId=1;
		productName="Clifton";
		quantityOnHand=100;
		price=99;
		
		System.out.println("PRODUCT CONSTRUCTOR CALLED");
	}
	public void printProductDetails() {
		System.out.println("Product Id : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Quantity On Hand : "+quantityOnHand);
		System.out.println("Prics : "+price);
	}
	public static void main(String[] args) {

		Product product1 = new Product();
		System.out.println("Printing the details about product1");
		product1.printProductDetails();
		
		Product product2 = new Product();
		System.out.println("Printing the details about product2");
		product2.printProductDetails();

		new Product().printProductDetails();
	}

}
