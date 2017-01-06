package com.xiaoyu.simpleweather.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity管理类
 * Created by xiaoyu on 17-1-6.
 */

public class ActivityUtil {

    private List<Activity> activityList = new ArrayList<>();
    private static ActivityUtil manager;

    private ActivityUtil() {
    }

    public static ActivityUtil getInstance() {
        if (manager == null) {
            manager = new ActivityUtil();
        }
        return manager;
    }

    public void addActivity(Activity activity) {
        activityList.add(activity);
    }

    public void removeActivity(Activity activity) {
        activityList.remove(activity);
    }

    public void removeAll() {
        for (Activity activity : activityList) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
