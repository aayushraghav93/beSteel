package com.myfitnessproject.beSteel.services.workout;

import com.myfitnessproject.beSteel.dto.WorkoutDTO;
import com.myfitnessproject.beSteel.entity.Workout;
import com.myfitnessproject.beSteel.repositry.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WorkoutServiceImpl implements WorkoutService {
    private final WorkoutRepository workoutRepository;
    public WorkoutDTO postWorkout(WorkoutDTO workoutDTO){
        Workout workout=new Workout();
        workout.setDate(workoutDTO.getDate());
        workout.setType(workoutDTO.getType());
        workout.setDuration(workoutDTO.getDuration());
        workout.setCaloriesBurned(workoutDTO.getCaloriesBurned()
        );

        return workoutRepository.save(workout).getWorkoutDto();
    }

    public List<WorkoutDTO> getWorkouts(){
        List<Workout> workouts=workoutRepository.findAll();
        return workouts.stream().map(Workout::getWorkoutDto).collect(Collectors.toList());

    }



}
