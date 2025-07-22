package com.myfitnessproject.beSteel.repositry;

import com.myfitnessproject.beSteel.entity.Activity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.apache.catalina.LifecycleState;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepositry extends JpaRepository<Activity,Long> {
@Query("SELECT SUM(a.steps) FROM Activity a")
    Integer getTotalSteps();
@Query("SELECT SUM(a.distance) FROM Activity a")
    Double getTotalDistance();

@Query("SELECT SUM(a.caloriesBurned) FROM Activity a")
    Integer getTotalActivityCalories();
@Query("SELECT a FROM Activity a ORDER BY a.date DESC")
List<Activity> findLast7Activities(Pageable pageable);



}
