package com.myfitnessproject.beSteel.services.activity;

import com.myfitnessproject.beSteel.dto.ActivityDTO;
import com.myfitnessproject.beSteel.entity.Activity;
import com.myfitnessproject.beSteel.repositry.ActivityRepositry;
import lombok.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ActivityServiceImpl implements ActivityService{
    private final ActivityRepositry activityRepositry;

    public ActivityDTO postActivity(ActivityDTO dto){
        Activity activity=new Activity();
        activity.setDate(dto.getDate());
        activity.setSteps(dto.getSteps());
        activity.setDistance(dto.getDistance());
        activity.setCaloriesBurned(dto.getCaloriesBurned());
        return activityRepositry.save(activity).getActivityDTO();
    }

    public List<ActivityDTO> getActivities(){
        List<Activity> activities=activityRepositry.findAll();
        return activities.stream().map(Activity::getActivityDTO).collect(Collectors.toList());
    }

}
