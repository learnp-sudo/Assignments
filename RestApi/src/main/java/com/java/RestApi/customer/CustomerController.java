package com.java.RestApi.customer;

	import java.net.URI;
	import java.util.List;
	import org.springframework.http.ResponseEntity;
	import org.springframework.validation.annotation.Validated;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
	@RestController
	public class CustomerController {
	       CustomerService service;


	        public CustomerController(CustomerService service)
	        {
	            super();
	            this.service = service;
	        }
	       @GetMapping("/customer")
	        public List<CustomerDetails> retrieveAllCustomer()
	       {
	            return service.findAll();
	        }

	        @GetMapping("/customer/{id}")
	        public CustomerDetails retrieveCustomer(@PathVariable int id)
	        {
	            return service.findOne(id);

	        }
	          @DeleteMapping("/customer/{id}")

	          public void deleteCustomer(@PathVariable int id)
	          {
	              service.deleteById(id);
	          }
	            @PostMapping("/customer")
	      public ResponseEntity<CustomerDetails> createUser(@Validated @RequestBody CustomerDetails customer)
	            {
	                CustomerDetails savedUser = service.save(customer);

	                URI location = ServletUriComponentsBuilder.fromCurrentRequest()
	                        .path("/{id}")
	                        .buildAndExpand(savedUser.getId())
	                        .toUri();

	                return ResponseEntity.created(location).build();
	            }
	}

