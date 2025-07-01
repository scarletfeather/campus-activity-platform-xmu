package com.campusactivity.controller.web;

import com.campusactivity.entity.Activity;
import com.campusactivity.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class WebController {
    
    @Autowired
    private ActivityService activityService;
    
    /**
     * 首页
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    /**
     * 用户活动页面
     */
    @GetMapping("/user/activities/page")
    public String userActivities(Model model) {
        List<Activity> activities = activityService.getAllActivities();
        model.addAttribute("activities", activities);
        model.addAttribute("title", "用户活动列表");
        return "user/activity-list";
    }

    /**
     * 用户活动详情页面
     */
    @GetMapping("/user/activities/page/{id}")
    public String userActivityDetail(@PathVariable Long id, Model model) {
        Activity activity = activityService.getActivityById(id);
        model.addAttribute("activity", activity);
        model.addAttribute("title", "活动详情");
        return "user/activity-detail";
    }
    
    /**
     * 管理员活动页面
     */
    @GetMapping("/admin/activities/page")
    public String adminActivities(Model model) {
        List<Activity> activities = activityService.getAllActivities();
        model.addAttribute("activities", activities);
        model.addAttribute("title", "管理员活动列表");
        return "admin/activity-list";
    }
    
    /**
     * 我的报名页面
     */
    @GetMapping("/user/my-registrations")
    public String myRegistrations(Model model) {
        model.addAttribute("title", "我的报名");
        return "user/my-registrations";
    }
    
    /**
     * 登录页面
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
