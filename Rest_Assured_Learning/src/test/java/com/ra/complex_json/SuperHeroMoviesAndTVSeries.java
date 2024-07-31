package com.ra.complex_json;
import java.util.List;
import lombok.Data;

@Data
public class SuperHeroMoviesAndTVSeries {
	
	private String category;
	private List<String> acceptedFranchises;
	private List<String> genres;
	private List<Movies> movies;
	private List<TVSeries> tvSeries;
	private OtherDetails otherDetails;
	
}
