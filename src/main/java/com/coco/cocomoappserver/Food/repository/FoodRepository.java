package com.coco.cocomoappserver.Food.repository;

import com.coco.cocomoappserver.Food.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findAllByOrderByUsernameAsc();
}
