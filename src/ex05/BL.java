package ex05;


import javax.xml.crypto.Data;
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
		
		return DataSource.allProducts.stream().filter((p) -> p.getProductId() == productId).findAny().orElse(null);
	}
	
	@Override
	public Order getOrderById(long orderId) {
		
		return DataSource.allOrders.stream().filter((o) -> o.getOrderId() == orderId).findAny().orElse(null);
	}
	
	@Override
	public Customer getCustomerById(long customerId) {
		
		
		//Todo JJ
		return DataSource.allCustomers.stream().filter((c) -> c.getId() == customerId).findAny().orElse(null);
	}
	
	
	@Override
	public List<Product> getProducts(ProductCategory cat, double price) {
		//Todo Fisher
		return DataSource.allProducts.stream()
				.filter((p) -> p.getCategory() == cat && p.getPrice() <= price)
				.sorted((p1, p2) -> (int) (p1.getProductId() - p2.getProductId()))
				.collect(Collectors.toList());
	}
	
	@Override
	public List<Customer> popularCustomers() {
		//Todo JJ
		return DataSource.allCustomers.stream()
				.filter((c) -> c.getTier() == 3 &&
						10 < DataSource.allOrders.stream().filter((o) -> o.getCustomrId() == c.getId())
								.count()
				)
				.sorted((c1, c2) -> (int) (c1.getId() - c2.getId()))
				.collect(toList());
	}
	
	@Override
	public List<Order> getCustomerOrders(long customerId) {
		//Todo Fisher
		return DataSource.allOrders.stream()
				.filter((o) -> o.getCustomrId() == customerId)
				.sorted((o1, o2) -> (int) (o1.getOrderId() - o2.getOrderId()))
				.collect(Collectors.toList());
	}
	
	@Override
	public long numberOfProductInOrder(long orderId) {
		//Todo JJ
		return DataSource.allOrderProducts.stream()
				.filter((op) -> op.getOrderId() == orderId)
				.count();
	}
	
	@Override
	public List<Product> getPopularOrderedProduct(int orderedtimes) {
		//Todo Fisher
		return DataSource.allProducts.stream()
				.filter((p) ->
								DataSource.allOrderProducts.stream()
										.filter((op) -> op.getProductId() == p.getProductId())
										.count() >= orderedtimes)
				.sorted((p1, p2) -> (int) (p1.getProductId() - p2.getProductId()))
				.collect(toList());
		
		
	}
	
	@Override
	public List<Product> getOrderProducts(long orderId) {
		//Todo JJ
		return DataSource.allProducts.stream()
				.filter((p) ->
								DataSource.allOrderProducts.stream().anyMatch(
										(op) -> op.getProductId() == p.getProductId() && op.getOrderId() == orderId)
				)
				.collect(toList());
	}
	
	@Override
	public List<Customer> getCustomersWhoOrderedProduct(long productId) {
		//Todo Fisher
		return DataSource.allCustomers.stream()
				.filter((c) ->
								DataSource.allOrders.stream()
										.filter((o) -> o.getCustomrId() == c.getId())//find all the costumer orders and
										.anyMatch((o) -> DataSource.allOrderProducts.stream()
												.anyMatch((op) -> op.getProductId() == productId && o.getOrderId() == op
														.getOrderId())// check if any of them contain the productId
										))
				.collect(toList());

//				DataSource.allOrderProducts.stream()
//						.anyMatch((o)->o.() == c.getId() && o.getOrderId() == productId))
//				.collect(toList());
	}
	
	@Override
	public Product getMaxOrderedProduct() {
		//Todo JJ
		return DataSource.allProducts.stream()
				.max((p1, p2) ->//the comparator will subtract the number of the ordered products of p1 than p2 to find the max ordered product
							 (int) (DataSource.allOrderProducts.stream()
									 .filter((op) -> op.getProductId() == p1.getProductId())
									 .count()
									 -
									 DataSource.allOrderProducts.stream()
											 .filter((op) -> op.getProductId() == p2.getProductId())
											 .count())
				).orElse(null);
		
	}
	
	@Override
	public double sumOfOrder(long orderID) {
		//Todo Fisher
		return DataSource.allOrderProducts.stream()
				.filter((op) -> op.getOrderId() == orderID)// find the order
				.mapToDouble((op) -> op
						.getQuantity() * // map it to double to calc the total price by quantity * price per one
						DataSource.allProducts.stream() // getting the price for one
								.filter((p) -> p.getProductId() == op.getProductId()) // find the product
								.mapToDouble((p) -> p.getPrice())
								.sum()) // map it to double is just getting the price per one
				.sum();
		
	}
	
	@Override
	public List<Order> getExpensiveOrders(double price) {
		//Todo JJ
		return DataSource.allOrders.stream()
				.filter((o) -> sumOfOrder(o.getOrderId()) > price)
				.collect(toList());
	}
	
	@Override
	public List<Customer> ThreeTierCustomerWithMaxOrders() {
		//Todo Fisher
		return DataSource.allCustomers.stream()
				.filter((c) -> c.getTier() == 3)
				.sorted((c1, c2) -> (int) (c1.getId() - c2.getId()))
				.sorted((c1, c2) -> (int) (getCustomerOrders(c2.getId()).stream().count() - getCustomerOrders(
						c1.getId()).stream().count()))
				.limit(3)
				.collect(toList());
		
	}
	
}
