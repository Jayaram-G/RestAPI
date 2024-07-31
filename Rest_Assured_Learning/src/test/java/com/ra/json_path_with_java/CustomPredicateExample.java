package com.ra.json_path_with_java;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;
import com.jayway.jsonpath.Predicate.PredicateContext;

public class CustomPredicateExample {
	
	File jsonFile = new File("src/test/resources/bookstore.json");
	
	public void myCustomPredicate() throws IOException {
		
		/*
		 * Predicate booksWithISBN = new Predicate() {
		 * 
		 * @Override public boolean apply(PredicateContext ctx) { boolean
		 * predicate=ctx.item(Map.class).containsKey("isbn"); return predicate; } };
		 */
		Predicate booksWithISBN = ctx->ctx.item(Map.class).containsKey("isbn");
		
	List<Map<String,Object>> result=JsonPath.parse(jsonFile)
		.read("$.store.book[?].isbn",List.class,booksWithISBN);
	System.out.println(result);
	
	}
	

	public static void main(String[] args) throws IOException {
		
		CustomPredicateExample example = new CustomPredicateExample();
		example.myCustomPredicate();

	}

}
