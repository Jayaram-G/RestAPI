package com.ra.complex_json;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movies {
	
	private String title;
	private int year;
	private List<String> cast;

}
