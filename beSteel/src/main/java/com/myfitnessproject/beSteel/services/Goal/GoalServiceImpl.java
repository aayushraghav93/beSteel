package com.myfitnessproject.beSteel.services.Goal;

import com.myfitnessproject.beSteel.dto.GoalDTO;
import com.myfitnessproject.beSteel.entity.Goal;
import com.myfitnessproject.beSteel.repositry.GoalRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor


public class GoalServiceImpl implements  GoalService{
private final GoalRepository goalRepository;
public GoalDTO postGoal(GoalDTO dto){
    Goal goal=new Goal();
    goal.setDescription(dto.getDescription());

    goal.setStartDate(dto.getStartDate());
    goal.setEndDate(dto.getEndDate());
    goal.setAchieved(false);

    return goalRepository.save(goal).getGoalDTO();
}

public List<GoalDTO> getGoals(){
    List<Goal> goals=goalRepository.findAll();
    return  goals.stream().map(Goal::getGoalDTO).collect(Collectors.toList());
}

public  GoalDTO updateStatus(Long id){
    Optional<Goal> optionalGoal=goalRepository.findById(id);
    if(optionalGoal.isPresent()){
        Goal exitingGoal=optionalGoal.get();
        exitingGoal.setAchieved(true);
        return goalRepository.save(exitingGoal).getGoalDTO();

    }
    throw  new EntityNotFoundException("Goal not found");
}


}
