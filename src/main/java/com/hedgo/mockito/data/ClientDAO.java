package com.hedgo.mockito.data;

import java.util.ArrayList;
import java.util.List;
import com.hedgo.mockito.model.Product;

public class ClientDAO {
	
	List<Product> myProducts;

	public ClientDAO()
	{
		myProducts = new ArrayList<Product>();
		myProducts.add(new Product(1,"eurokonto"));
		myProducts.add(new Product(2,"oszczêdnoœciowe"));
		myProducts.add(new Product(3,"walutowe"));
	}
	
	public List<Product> getAllProducts()
	{
		return myProducts;
	}

}
