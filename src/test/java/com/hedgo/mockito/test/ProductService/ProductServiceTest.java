package com.hedgo.mockito.test.ProductService;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.*; //tu mam np. when lub stub:)

import org.mockito.runners.MockitoJUnitRunner;

import com.hedgo.mockito.business.ProductService;
import com.hedgo.mockito.data.ClientDAO;
import com.hedgo.mockito.model.Product;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {
		
	@Mock
	ClientDAO clientDAO;
		
	@InjectMocks
	ProductService productService = new ProductService();

	@Before
	public void setUp() {
		//MockitoAnnotations.initMocks(this);
		//when(.....)
	}
	
	@Test
	public void testSumBasket()
	{
		//given
		//tu mo¿na inicjalizowaæ obiekty do tego testu
        when(clientDAO.getAllProducts()).thenReturn(getAllProducts());			//mo¿na te¿ tak: stub(clientDAO.getAllProducts()).toReturn(getAllProducts());
		
		//when
        int result = productService.sumBasket();
		
        //then
		assertEquals(6,result);
				
		//then
		//Assertions.assertThat(result).hasSize(1);
		//Assertions.assertThat(result.get(0).getInterestRate()).isEqualByComparingTo(BigDecimalUtility.bd("0.01"));
		//assertNotNull
		//assertFalse
		//assertTrue
        //assertThat(actual, is(user));
        //assertThat(user.getCreatedAt(), is(notNullValue()));
        //assertThat(user.getUpdatedAt(), is(notNullValue()));
        //assertThat(user.getPassword(), is("xxxx"));		
	}

	@Test
	public void testSumBasket2()
	{
        when(clientDAO.getAllProducts()).thenReturn(getAllProducts());			//mo¿na te¿ tak: stub(clientDAO.getAllProducts()).toReturn(getAllProducts());
        int result = productService.sumBasket();
		assertEquals(6,result);
	}	
	
	private List<Product> getAllProducts()
	{
		List<Product> myProducts;
		myProducts = new ArrayList<Product>();
		myProducts.add(new Product(1,"eurokonto"));
		myProducts.add(new Product(2,"oszczêdnoœciowe"));
		myProducts.add(new Product(3,"walutowe"));
		return myProducts;
	}
	
}
