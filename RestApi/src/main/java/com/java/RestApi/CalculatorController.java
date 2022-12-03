package com.java.RestApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	@GetMapping("/addition/{num1}/{num2}")
	public double Addition(@PathVariable double num1,@PathVariable double num2) {
		return num1+num2;
	}
	@GetMapping("/substaction/{num1}/{num2}")
	public double Substraction(@PathVariable double num1,@PathVariable double num2) {
		return num1-num2;
	}
	@GetMapping("/Division/{num1}/{num2}")
	public double Division(@PathVariable double num1,@PathVariable double num2) {
		return num1/num2;
	}
	@GetMapping("/multiply/{num1}/{num2}")
	public double Multiplication(@PathVariable double num1,@PathVariable double num2) {
		return num1*num2;
	}
	@GetMapping("/sqrt/{num}")
	public double SquareRoot(@PathVariable long num) {
		return Math.sqrt(num);
	}

}
