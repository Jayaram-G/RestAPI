package com.ra.json_path_with_java;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;
import static com.jayway.jsonpath.Criteria.*;
import static com.jayway.jsonpath.Filter.filter;
import static com.jayway.jsonpath.JsonPath.parse;

public class FilterPredicateExample {
	
	File jsonFile = new File("src/test/resources/bookstore.json");
	
	public void filterAPIPredicateExample() throws IOException {
		
		Filter priceLessThan10 = Filter.filter(
				Criteria
				.where("price")
				.lt(10));
		
		List<Object> result=JsonPath
		.parse(jsonFile)
		.read("$.store.book[?]",priceLessThan10);
	
		System.out.println(result);
		
	}
	
	public void secondFilter() throws IOException {
		
		Filter secondCriteria = Filter.filter(
				Criteria
				.where("price")
				.lt(10)
				.and("category")
				.is("fiction")
				);
		
		List<Map<String,Object>> result=JsonPath.parse(jsonFile).read("$.store.book[?]",secondCriteria);
		
		System.out.println(result.get(0).get("author"));
	}
	
	public void thirdFilter() throws IOException {
		
	 Filter thirdFilter=filter(
				where("price")
				.gt(10)
				.and("category")
				.is("fiction")
				);
	 
	 List<Map<String,Object>> result = parse(jsonFile).read("$.store.book[?]",thirdFilter);
	 
	 System.out.println(result);
		
	}

	public static void main(String[] args) throws IOException {
		
		FilterPredicateExample example = new FilterPredicateExample();
		example.thirdFilter();

	}

}
