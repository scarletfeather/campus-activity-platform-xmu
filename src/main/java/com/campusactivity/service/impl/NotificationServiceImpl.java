package com.campusactivity.service.impl;

import com.campusactivity.entity.User;
import com.campusactivity.service.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendNotification(User user, String message) {
        // 目前仅打印日志，后续可集成邮件、短信等通知方式
        System.out.println("向用户 " + user.getUsername() + " 发送通知: " + message);
    }
}