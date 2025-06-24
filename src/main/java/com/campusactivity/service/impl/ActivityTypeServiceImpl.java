package com.campusactivity.service.impl;

import com.campusactivity.entity.ActivityType;
import com.campusactivity.repository.ActivityTypeRepository;
import com.campusactivity.service.ActivityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityTypeServiceImpl implements ActivityTypeService {
    @Autowired
    private ActivityTypeRepository activityTypeRepository;

    @Override
    public List<ActivityType> getAllActivityTypes() {
        return activityTypeRepository.findAll();
    }

    @Override
    public ActivityType getActivityTypeById(Long id) {
        return activityTypeRepository.findById(id).orElse(null);
    }

    @Override
    public ActivityType createActivityType(ActivityType activityType) {
        return activityTypeRepository.save(activityType);
    }

    @Override
    public ActivityType updateActivityType(Long id, ActivityType activityType) {
        if (activityTypeRepository.existsById(id)) {
            activityType.setId(id);
            return activityTypeRepository.save(activityType);
        }
        return null;
    }

    @Override
    public void deleteActivityType(Long id) {
        activityTypeRepository.deleteById(id);
    }
}