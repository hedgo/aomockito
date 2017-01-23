package com.hedgo.mockito.business;

import java.util.List;

import com.hedgo.mockito.data.ClientDAO;
import com.hedgo.mockito.model.Product;

public class ProductService {

	ClientDAO clientDAO;
	static ProductService productService=new ProductService();	
	
	public ProductService() {
		clientDAO=new ClientDAO();
	}
	
	public static void main(String[] args) {
		System.out.println("mockito test by hedgo!");
		System.out.println("PRODUKTY="+productService.sumBasket());
	}
	
	public int sumBasket()
	{
		int sum=0;
		for(Product p:clientDAO.getAllProducts())
		{
			sum+=p.getAmout();
		}
		return sum;
	}

}
