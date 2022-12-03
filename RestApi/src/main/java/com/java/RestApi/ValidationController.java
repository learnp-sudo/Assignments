package com.java.RestApi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {




	   @RequestMapping(value = "/validate/{cardNo}",method = RequestMethod.GET)



	   public String validateCreditCard(@PathVariable("cardNo") String cardNo){
	        CardValidator cardValidator = new CardValidator();
	        cardValidator.setCardNo(cardNo);
	        String res = cardValidator.isValidCard();
	        return  res;
	    }
	}


