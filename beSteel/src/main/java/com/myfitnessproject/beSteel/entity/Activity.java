package com.myfitnessproject.beSteel.entity;


import com.myfitnessproject.beSteel.dto.ActivityDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Data

public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private int steps;

    public int caloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public Date date() {
        return date;
    }

    public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double distance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int steps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    private double distance;
    private int caloriesBurned;

    public ActivityDTO getActivityDTO() {
        ActivityDTO activityDTO=new ActivityDTO();
        activityDTO.setId(id);
        activityDTO.setDate(date);
        activityDTO.setSteps(steps);
        activityDTO.setDistance(distance);
        activityDTO.setCaloriesBurned(caloriesBurned);
        return activityDTO;
    }
}
