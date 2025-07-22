package com.myfitnessproject.beSteel.dto;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
@RequiredArgsConstructor
public class ActivityDTO {
    private Long id;


    public void setSteps(int steps) {
        this.steps = steps;
    }



    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public int getSteps() {
        return steps;
    }

    public double getDistance() {
        return distance;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public Date getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;



    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    private int steps;

    private double distance;
    private int caloriesBurned;

}
