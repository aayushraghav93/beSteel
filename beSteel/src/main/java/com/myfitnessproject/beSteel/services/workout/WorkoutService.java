package com.myfitnessproject.beSteel.services.workout;

import com.myfitnessproject.beSteel.dto.WorkoutDTO;

import java.util.List;

public interface WorkoutService {
    WorkoutDTO postWorkout(WorkoutDTO workoutDTO);
    List<WorkoutDTO> getWorkouts();
}
