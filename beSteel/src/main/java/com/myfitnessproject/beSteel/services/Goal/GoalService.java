package com.myfitnessproject.beSteel.services.Goal;

import com.myfitnessproject.beSteel.dto.GoalDTO;

import java.util.List;

public interface GoalService {
    GoalDTO postGoal(GoalDTO dto);

    List<GoalDTO> getGoals();

    GoalDTO updateStatus(Long id);
}
