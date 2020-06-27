package com.sutanu.repository;

import java.util.List;

import com.sutanu.model.Activity;
import com.sutanu.model.ActivitySearch;

public interface ActivityRepository {

	List<Activity> findAllActivities();
	
	Activity findActivity(String activityId);

	Activity create(Activity activity);

	Activity update(Activity activity);

	void delete(String activityId);

	List<Activity> findByDescription(List<String> descriptions, int durationFrom, int durationTo);

	List<Activity> findByConstraints(ActivitySearch activitySearch);
}