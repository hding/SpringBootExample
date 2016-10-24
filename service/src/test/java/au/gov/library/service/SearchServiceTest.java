package au.gov.library.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import au.gov.library.entity.Customer;
import au.gov.library.repository.BookRepository;
import au.gov.library.repository.CustomerRepository;


@RunWith(MockitoJUnitRunner.class)
public class SearchServiceTest {
	@Mock
	private CustomerRepository userRepository;

	@Mock
	private BookRepository bookRepository;

	@InjectMocks
	private SearchService searchService = new SearchService();


	@Before
	public void setUp() throws Exception {
	    MockitoAnnotations.initMocks(this);
	    List<Customer> all= new ArrayList<Customer>();
	    all.add(new Customer());
	    
	    Mockito.when(userRepository.findAll()).thenReturn(all);   
	}

	
	@Test
	public void testFindAllCustomer() {
    	Iterable<Customer> searchResults = searchService.findAllCustomer();
        assertThat(searchResults).hasSize(1);
	}

}
