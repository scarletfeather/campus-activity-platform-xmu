package com.campusactivity.controller.admin;

import com.campusactivity.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/admin/statistics")
public class StatisticsController {
    @Autowired
    private StatisticsService statisticsService;

    @GetMapping("/activities")
    public Map<String, Object> getActivityStatistics() {
        return statisticsService.getActivityStatistics();
    }

    @GetMapping("/registrations")
    public Map<String, Object> getRegistrationStatistics() {
        return statisticsService.getRegistrationStatistics();
    }
}