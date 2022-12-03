package com.java.RestApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;
@Component
public class InformationService {

		private static List<Information> info= new ArrayList<>();
		static {
			info.add(new Information("AK","Anchorage","US",(long) 10111));
			info.add(new Information("TG","Hyderabad","India",(long) 56789));
			info.add(new Information("AP","Amaravathi","India",(long) 12345));
		}
		public List<Information> findAll()
		{
			return info;
		}

		public Information findOne(long zipcode)
		{
			Predicate<? super Information> predicate = user -> user.getZipcode().equals(zipcode);
		   return info.stream().filter(predicate).findFirst().orElse(null);
		}
}
