import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	List<Product> products = new ArrayList<Product>();

	public void addProduct(Product p) {
		products.add(p);
	}
	
	public List<Product> getAllProduts(){
		return products;
	}
	
	public Product getProducts(String name) {
		for(Product p : products) {
			if(p.getName().equals(name))
				return p;
		}
		return null;
	}
	
	public Product getProductByPlace(String place) {
		for(Product p : products) {
			if(p.getPlace().equals(place))
				return p;
		}
		
		return null;
	}

	public List<Product> getProductInWarranty(int warranty) {
		List<Product> warrantyProducts = new ArrayList<Product>();
		for(Product p : products) {
			if(p.getWarranty()>warranty)
				warrantyProducts.add(p);
		}
		return warrantyProducts;
	}

	public List<Product> getProductWithText(String text) {
		String str = text.toLowerCase();
		List<Product> prods = new ArrayList<>();
		for(Product p : products) {
			String name = p.getName().toLowerCase();
			String type = p.getType().toLowerCase();
			String place = p.getPlace().toLowerCase();
			if(name.contains(str) ||
					place.contains(str) || 
					type.contains(str)) {
				prods.add(p);
			}
		}
		return prods;
	}

}
