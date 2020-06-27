package com.sutanu.model;

import java.util.List;

public class ActivitySearch {
	
	private int durationFrom;
	private int durationTo;
	
	private List<String> description;
	
	private ActivitySearchType SearchType;
	
	

	public ActivitySearchType getSearchType() {
		return SearchType;
	}

	public void setSearchType(ActivitySearchType searchType) {
		SearchType = searchType;
	}

	public int getDurationFrom() {
		return durationFrom;
	}

	public void setDurationFrom(int durationFrom) {
		this.durationFrom = durationFrom;
	}

	public int getDurationTo() {
		return durationTo;
	}

	public void setDurationTo(int durationTo) {
		this.durationTo = durationTo;
	}

	public List<String> getDescription() {
		return description;
	}

	public void setDescription(List<String> description) {
		this.description = description;
	}
	
	

}
