package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RefactoringExampleApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testCustomerStatement() {
	Movie testMovieRegular = new Movie("test-title-regular", Movie.REGULAR);
	Movie testMovieNew = new Movie("test-title-new", Movie.NEW_RELEASE);
	Movie testMovieChildren = new Movie("test-title-children", Movie.CHILDRENS);

	Rental testRental1 = new Rental(testMovieRegular, 1);
	Rental testRental2 = new Rental(testMovieNew, 2);
	Rental testRental3 = new Rental(testMovieChildren, 3);

	Customer testCustomer1 = new Customer("test-customer-01");
	Customer testCustomer2 = new Customer("test-customer-02");

	testCustomer1.addRental(testRental1);
	System.out.println(testCustomer1.statement());
	testCustomer1.addRental(testRental2);
	System.out.println(testCustomer1.statement());
	testCustomer1.addRental(testRental3);
	System.out.println(testCustomer1.statement());
    }
}
