package com.java.RestApi;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class EmployeeResource {
	private EmployeeService service;

	public EmployeeResource(EmployeeService service) {
		super();
		this.service = service;
	}
	@GetMapping("/employees")
	public List<EmployeeDomain> retrieveAll()
	{
		return service.findAll();
	}
	@GetMapping("/employees/{id}")
	public EmployeeDomain retrieveOne(@PathVariable Integer id)
	{
		return service.findOne(id);
	}
	@PostMapping("/employees")
	public ResponseEntity<Object> createUser(@RequestBody EmployeeDomain employee)
	{
		EmployeeDomain savedemployee =service.save(employee);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedemployee.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	@DeleteMapping("/employees/{id}")
	public void deleteUser(@PathVariable int id) {
		service.deleteById(id);
	}
	/*@PutMapping("/employees/{id}")
	public EmployeeDomain updateEmployee(@RequestBody EmployeeDomain employee ,@PathVariable Integer id )
	{

		EmployeeDomain employee =service.updatebyId(id);
	}*/

}
