package com.myfitnessproject.beSteel.controllers;

import com.myfitnessproject.beSteel.dto.ActivityDTO;
import com.myfitnessproject.beSteel.entity.Activity;
import com.myfitnessproject.beSteel.repositry.ActivityRepositry;
import com.myfitnessproject.beSteel.services.activity.ActivityService;
import com.myfitnessproject.beSteel.services.activity.ActivityServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ActivityController {
    private  final ActivityService activityService;
    @PostMapping("/activity")
    public ResponseEntity<?> postActivity(@RequestBody  ActivityDTO dto){
        ActivityDTO createActivity=activityService.postActivity(dto);

        if(createActivity!=null){
            return ResponseEntity.status(HttpStatus.CREATED).body(createActivity);
        }
        else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Went Wrong");
        }


    }
    @GetMapping("/activities")
    public ResponseEntity<?> getActivities(){
        try{
            return ResponseEntity.ok(activityService.getActivities());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Went Wrong");
        }
    }


}
