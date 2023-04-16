
public class Inventory {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.setProductId(67821);
		product.setProductName("Mobile Phone");
		
		System.out.println(product.getProductId() + " - " + product.getProductName());
		
		System.out.println("product is of type = " + product.getClass().getName());
		System.out.println("hashCode(product) = " + product.hashCode());
		System.out.println("hashCode(product) in hexadecimal form = " + Integer.toHexString(product.hashCode()));
		
		System.out.println();
		System.out.println(product); //toString() default implementation in java.lang.Object - return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}

}
