package ex05;



import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;
import static java.util.Map.Entry.comparingByValue;
import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.*;

public class BL implements IBL {
	@Override
	public Product getProductById(long productId) {
		//Todo jj
		return null;
	}
	
	@Override
	public Order getOrderById(long orderId) {
		//Todo Fisher
		return null;
	}
	
	@Override
	public Customer getCustomerById(long customerId) {
		
		DataSource.allCustomers.stream();
		//Todo JJ
		return null;
	}
	
	
	@Override
	public List<Product> getProducts(ProductCategory cat, double price) {
		//Todo Fisher
		return null;
	}
	
	@Override
	public List<Customer> popularCustomers() {
		//Todo JJ
		return null;
	}
	
	@Override
	public List<Order> getCustomerOrders(long customerId) {
		//Todo Fisher
		return null;
	}
	
	@Override
	public long numberOfProductInOrder(long orderId) {
		//Todo JJ
		return 0;
	}
	
	@Override
	public List<Product> getPopularOrderedProduct(int orderedtimes) {
		//Todo Fisher
		return null;
	}
	
	@Override
	public List<Product> getOrderProducts(long orderId)
	{
		//Todo JJ
		return null;
	}
	
	@Override
	public List<Customer> getCustomersWhoOrderedProduct(long productId) {
		//Todo Fisher
		return null;
	}
	
	@Override
	public Product getMaxOrderedProduct() {
		//Todo JJ
		return null;
		
	}
	@Override
	public double sumOfOrder(long orderID) {
		//Todo Fisher
		return 0;
	}
	
	@Override
	public List<Order> getExpensiveOrders(double price) {
		//Todo JJ
		return null;
	}
	
	@Override
	public List<Customer> ThreeTierCustomerWithMaxOrders() {
		//Todo Fisher
		return null;
		
	}
	
}
