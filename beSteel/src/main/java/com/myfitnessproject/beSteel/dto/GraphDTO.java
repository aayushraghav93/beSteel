package com.myfitnessproject.beSteel.dto;

import lombok.Data;

import java.util.List;

@Data
public class GraphDTO {
    private List<WorkoutDTO> workouts;
    private List<ActivityDTO> activities;
}
