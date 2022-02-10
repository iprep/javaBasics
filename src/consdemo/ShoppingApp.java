package consdemo;

public class ShoppingApp {

	public static void main(String[] args) {
		Review review1 = new Review(1234, "Daniel", 5);
		review1.reviewCount++;
		System.out.println(review1.reviewCount);
		
		Review review2 = new Review(12,"Richard",5);
		review2.reviewCount++;
		
		System.out.println(review2.reviewCount);
		
		Review review3 = new Review(56,"Kyle",7);
		review3.reviewCount++;
		
		System.out.println(review3.reviewCount);	
	}

}
