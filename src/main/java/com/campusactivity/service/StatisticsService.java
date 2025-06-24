package com.campusactivity.service;

import java.util.Map;

public interface StatisticsService {
    /**
     * 获取活动统计信息
     * @return 包含统计信息的 Map
     */
    Map<String, Object> getActivityStatistics();

    /**
     * 获取注册统计信息
     * @return 包含统计信息的 Map
     */
    Map<String, Object> getRegistrationStatistics();
}