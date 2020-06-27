package com.sutanu.client;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.sutanu.model.Activity;
import com.sutanu.model.ActivitySearch;
import com.sutanu.model.ActivitySearchType;

public class ActivityClientTest {

	@Test
	public void testSearchObj() {
		ActivitySearchClient client = new ActivitySearchClient();
	
		String param = "description";
		
		List<String> searchValues = new ArrayList<String>();
		searchValues.add("swiming");
		searchValues.add("running");
		
		
		ActivitySearch search = new ActivitySearch();
		search.setDescription(searchValues);
		search.setDurationFrom(30);
		search.setDurationTo(120);
		
		search.setSearchType(ActivitySearchType.SEARCH_BY_DESCRIPTION);
		
		
		
		
		List<Activity> activities = client.search(search);
		System.out.println(activities);
		
		assertNotNull(activities);

	}
	
	@Test
	public void testSearch() {
		ActivitySearchClient client = new ActivitySearchClient();
	
		String param = "description";
		
		List<String> searchValues = new ArrayList<String>();
		searchValues.add("swiming");
		searchValues.add("running");
		
		String secondParam = "durationFrom";
		int durationFrom = 20;
		String thirdParam = "durationTo";
		int durationTo = 55;
		
		List<Activity> activities = client.search(param, searchValues, secondParam, durationFrom, thirdParam, durationTo);
		System.out.println(activities);
		
		assertNotNull(activities);

	}
	
	@Test
	public void testDelete() {
		ActivityClient client = new ActivityClient();
	
		
		client.delete("1234");
	}
	
	@Test
	public void testPut() {
		ActivityClient client = new ActivityClient();
		
		Activity activity = new Activity();
		activity.setId("3456");
		activity.setDescription("Yoga");
		activity.setDuration(25);
		
		activity = client.update(activity);
		assertNotNull(activity);
	}
	
	@Test
	public void testCreate() {
		ActivityClient client = new ActivityClient();
		
		Activity activity = new Activity();
		activity.setDescription("swaiming");
		activity.setDuration(25);
		
		activity = client.create(activity);
		assertNotNull(activity);
	}
	
	
	@Test
	public void testGet() {
		ActivityClient client = new ActivityClient();
		
		Activity activity = client.get("1234");
		
		System.out.println(activity);
		
		assertNotNull(activity);
	}
	
	@Test
	public void testGetList() {
		ActivityClient client = new ActivityClient();
		
		List<Activity> activities = client.get();
		
		System.out.println(activities);
		
		assertNotNull(activities);
	}
	
	@Test(expected=RuntimeException.class)
	public void testGetWithBadRequest() {
		ActivityClient client = new ActivityClient();
		
		Activity activity = client.get("123");
		
		System.out.println(activity);
		
		assertNotNull(activity);
	}
	
	@Test(expected=RuntimeException.class)
	public void testGetWithNotFound() {
		ActivityClient client = new ActivityClient();
		
		Activity activity = client.get("7777");
		
		System.out.println(activity);
		
		assertNotNull(activity);
	}

}
