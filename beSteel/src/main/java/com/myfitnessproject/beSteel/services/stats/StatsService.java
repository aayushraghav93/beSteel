package com.myfitnessproject.beSteel.services.stats;

import com.myfitnessproject.beSteel.dto.GraphDTO;
import com.myfitnessproject.beSteel.dto.StatsDTO;

public interface StatsService {
    StatsDTO getStats();

    GraphDTO getGraphStats();
}
