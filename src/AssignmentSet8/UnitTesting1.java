package AssignmentSet8;

import static org.junit.Assert.assertEquals;

import  org.junit.Assert;
import org.junit.Test;

class Product {
    private String productName;
    private float price;
    private int stock;
    
    public float calculateFinalPrice(int discountPercentage) {
        float discountedPrice = price - (price * discountPercentage / 100);
        return discountedPrice;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
      
    public float getPrice() {
        return price;
    }
      
    public void setPrice(float price) {
        this.price = price;
    }
      
    public int getStock() {
        return stock;
    }
      
    public void setStock(int stock) {
        this.stock = stock;
    }
}




public class UnitTesting1 {
		@Test
		public void validateProductTesting() {
			Product apple = new Product();
			apple.setPrice(100);
			apple.setProductName("apple");
			apple.setStock(113);
			
	        assertEquals(apple.calculateFinalPrice(2), apple.getPrice() - (apple.getPrice() * 2 / 100), 0.05);
	        Assert.assertTrue(apple.getProductName().equals("apple"));
	        
		}
}
