package com.campusactivity.service.impl;

import com.campusactivity.repository.ActivityRepository;
import com.campusactivity.repository.RegistrationRepository;
import com.campusactivity.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StatisticsServiceImpl implements StatisticsService {
    @Autowired
    private ActivityRepository activityRepository;
    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    public Map<String, Object> getActivityStatistics() {
        Map<String, Object> statistics = new HashMap<>();
        statistics.put("totalActivities", activityRepository.count());
        return statistics;
    }

    @Override
    public Map<String, Object> getRegistrationStatistics() {
        Map<String, Object> statistics = new HashMap<>();
        statistics.put("totalRegistrations", registrationRepository.count());
        return statistics;
    }
}