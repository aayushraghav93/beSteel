package com.myfitnessproject.beSteel.services.activity;

import com.myfitnessproject.beSteel.dto.ActivityDTO;

import java.util.List;

public interface ActivityService {
    ActivityDTO postActivity(ActivityDTO dto);
    List<ActivityDTO> getActivities();
}
