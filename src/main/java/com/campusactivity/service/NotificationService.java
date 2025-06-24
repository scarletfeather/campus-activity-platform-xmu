package com.campusactivity.service;

import com.campusactivity.entity.User;

public interface NotificationService {
    /**
     * 发送通知给用户
     * @param user 接收通知的用户
     * @param message 通知内容
     */
    void sendNotification(User user, String message);
}