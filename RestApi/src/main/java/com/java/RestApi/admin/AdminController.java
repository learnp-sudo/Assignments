package com.java.RestApi.admin;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AdminController
{
    private ProductService service;
   public AdminController(ProductService service) {
        this.service = service;
    }
   @GetMapping("/product")
   public List<ProductDetails> retrieveAll() {
        return service.findAll();
    }
   @PostMapping("/product")
    public ProductDetails createProduct(@RequestBody ProductDetails pro1)
    {
            return service.save1(pro1);
    }
    @DeleteMapping("/product/{id}")
    public void deleteproduct(@PathVariable int id)
    {

        service.deleteById1(id);

    }
    @GetMapping("/product/{id}")
    public ProductDetails getdeatils1(@PathVariable int id)
    {

        return service.findOne1(id);

    }
    @PutMapping("/product/{id}")
    public void UpdateDetails(@PathVariable int id, @RequestBody ProductDetails p )
    {
        service.updateById(id,p);
    }
}