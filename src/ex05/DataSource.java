package ex05;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DataSource {
	
	public static List<Customer> allCustomers;
	public static List<Order> allOrders;
	public static List<Product> allProducts;
	public static List<OrderProduct> allOrderProducts;
	// Update this path according to your data files location
	public static String basePath = "C:\\Design-and-OOP\\src\\ex05\\";
	public static String customersPath = basePath +"customers.txt";
	public static String ordersPath = basePath +"orders.txt";
	public static String productsPath = basePath +"products.txt";
	public static String orderProductPath = basePath +"orderProduct.txt";
	
	static
	{
		try {
			allCustomers = readCustomersfromFile();
			allOrders = readOrdersfromFile();
			allProducts = readProductsfromFile();
			allOrderProducts = readOrderProductsfromFile();
		} catch (IOException e) { e.printStackTrace(); }
	}
	public static List<Customer> readCustomersfromFile() throws IOException {
		
		//Files.lines(Paths.get(customersPath)).map(c->new Customer(c)).collect(Collectors.toList());
		
		
		//ToDo
		return Files.lines(Paths.get(customersPath)).map(c->new Customer(c)).collect(Collectors.toList());
	}
	
	public static List<Order> readOrdersfromFile() throws IOException {
		//ToDo
		return Files.lines(Paths.get(ordersPath)).map(o->new Order(o)).collect(Collectors.toList());
	}
	
	public static List<Product> readProductsfromFile() throws IOException {
		//ToDo
		return Files.lines(Paths.get(productsPath)).map(p->new Product(p)).collect(Collectors.toList());
	}
	
	public static List<OrderProduct> readOrderProductsfromFile() throws IOException {
		//ToDo
		return Files.lines(Paths.get(orderProductPath)).map(o->new OrderProduct(o)).collect(Collectors.toList());
	}
}


