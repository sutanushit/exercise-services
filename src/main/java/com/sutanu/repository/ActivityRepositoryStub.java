package com.sutanu.repository;

import java.util.ArrayList;
import java.util.List;

import com.sutanu.model.Activity;
import com.sutanu.model.ActivitySearch;
import com.sutanu.model.User;

public class ActivityRepositoryStub implements ActivityRepository {

	@Override
	public List<Activity> findByConstraints(ActivitySearch activitySearch) {
		List<Activity> activities = new ArrayList<Activity>();
		
		System.out.println(activitySearch.getSearchType());
		Activity a1 = new Activity();
		a1.setDescription("swimming");
		a1.setDuration(35);
		
		activities.add(a1);
		
		Activity a2 = new Activity();
		a2.setDescription("running");
		a2.setDuration(120);
		
		activities.add(a2);
		
		return activities;	
	}
	
	@Override
	public List<Activity> findByDescription(List<String> descriptions, int durationFrom, int durationTo) {
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity a1 = new Activity();
		a1.setDescription("swimming");
		a1.setDuration(35);
		
		activities.add(a1);
		
		Activity a2 = new Activity();
		a2.setDescription("running");
		a2.setDuration(120);
		
		activities.add(a2);
		
		return activities;	
	}
	
	@Override
	public void delete(String activityId) {
		// TODO Auto-generated method stub
		//System.out.println("Delete example");

	}
	@Override
	public Activity create(Activity activity) {
		// TODO Auto-generated method stub
		return activity;
	}
	
	@Override
	public Activity update(Activity activity) {
		// TODO update in db
		return activity;
	}
	
	@Override
	public List<Activity> findAllActivities(){
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity a1 = new Activity();
		a1.setDescription("swimming");
		a1.setDuration(35);
		
		activities.add(a1);
		
		Activity a2 = new Activity();
		a2.setDescription("running");
		a2.setDuration(120);
		
		activities.add(a2);
		
		return activities;
	}
	
	@Override
	public Activity findActivity(String activityId) {
		
		if(activityId.equals("7777")) {
			return null;
		}
		
		Activity a1 = new Activity();
		
		a1.setId(activityId);
		a1.setDescription("swimming");
		a1.setDuration(35);
		
		User user = new User();
		user.setId("1234");
		user.setName("Sutanu");
		
		a1.setUser(user);
		
		
		return a1;
	}
}
