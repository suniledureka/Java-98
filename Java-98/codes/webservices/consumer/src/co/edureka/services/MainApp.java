package co.edureka.services;

public class MainApp {

	public static void main(String[] args) throws Exception {
		NumsServiceLocator locator = new NumsServiceLocator(); 
		Nums ref = locator.getNums();
		
		System.out.println("sum = " + ref.add(10,20));
		System.out.println("diff = " + ref.sub(10.2f, 12.5f));
	}
}