import java.util.List;

public class Main {
	public static void main(String[] args) {
		ProductService service = new ProductService();
		

//		service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Table", 2022));
//		service.addProduct(new Product("HP Pavilion", "Laptop", "Silver Desk", 2023));
//		service.addProduct(new Product("Dell XPS", "Laptop", "Black Stand", 2021));
//		service.addProduct(new Product("Black Lenovo ThinkPad", "Laptop", "Wooden Desk", 2022));
//		service.addProduct(new Product("MacBook Pro", "Laptop", "Glass Table", 2023));
//		service.addProduct(new Product("Black Acer Swift", "Laptop", "White Stand", 2024));
//		service.addProduct(new Product("Microsoft Surface", "Laptop", "Metal Desk", 2022));
//		service.addProduct(new Product("Google Pixelbook", "Laptop", "Marble Table", 2023));
//		service.addProduct(new Product("Samsung Galaxy Book", "Laptop", "Plastic Stand", 2021));
//		service.addProduct(new Product("Black Huawei MateBook", "Laptop", "Copper Desk", 2022));
//		service.addProduct(new Product("Razer Blade", "Black Laptop", "Aluminum Table", 2024));
//		
		List<Product> products = service.getAllProduts();
//		System.out.println(products);
		
//		for(Product i : products) {
//			System.out.println(i);
//		}
//		
//		System.out.println(service.getProducts("Asus Vivobook"));
//		System.out.println(service.getProductByPlace("Silver Desk"));
//		System.out.println(service.getProductInWarranty(2022));
		
		List<Product> prods = service.getProductWithText("black");
		
		System.out.println(prods);
		
	}
}
