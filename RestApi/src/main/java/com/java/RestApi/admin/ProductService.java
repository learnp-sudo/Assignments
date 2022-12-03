package com.java.RestApi.admin;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.function.Predicate;
import org.springframework.stereotype.Component;
	@Component
	public class ProductService
	{
	    private static List<ProductDetails> product=new ArrayList<>();
	    private static int ProductCount =0;
	    static
	    {
	        product.add(new ProductDetails(++ProductCount,"laptop",1000000,"Dell"));
	        product.add(new ProductDetails(++ProductCount,"Headset",1500,"Boat"));
	        product.add(new ProductDetails(++ProductCount,"Smartphone",20000,"Samsung"));
	        product.add(new ProductDetails(++ProductCount,"Earphopnes",4000,"oneplus"));


	    }
	    public ProductDetails save1(ProductDetails pro)
	    {
	        pro.setId(++ProductCount);
	        product.add(pro);
	        return pro;
	    }
	    public List<ProductDetails> findAll()
	    {
	        return product;
	    }
	    public ProductDetails findOne1(int id)
	    {
	        Predicate<? super ProductDetails> predicate=user->user.getId().equals(id);
	        return product.stream().filter(predicate).findFirst().orElse(null);
	        }
	    public void deleteById1(int id)
	    {
	        Predicate<? super ProductDetails> predicate=user->user.getId().equals(id);
	        product.removeIf(predicate);

	        }
	    public void updateById(int id, ProductDetails p) {

	        for(int i=0;i<product.size();i++)
	        {
	            ProductDetails pd=product.get(i);
	            if(pd.getId().equals(id))
	            {
	                product.set(i, p);

	            }
	        }
	    }



	   }


