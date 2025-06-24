package com.campusactivity.service;

import com.campusactivity.entity.Activity;
import java.util.List;

public interface ActivityService {
    List<Activity> getAllActivities();
    Activity getActivityById(Long id);
    Activity createActivity(Activity activity);
    Activity updateActivity(Long id, Activity activity);
    void deleteActivity(Long id);
}