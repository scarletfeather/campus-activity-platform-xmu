package com.campusactivity.service;

import com.campusactivity.entity.ActivityType;
import java.util.List;

public interface ActivityTypeService {
    List<ActivityType> getAllActivityTypes();
    ActivityType getActivityTypeById(Long id);
    ActivityType createActivityType(ActivityType activityType);
    ActivityType updateActivityType(Long id, ActivityType activityType);
    void deleteActivityType(Long id);
}