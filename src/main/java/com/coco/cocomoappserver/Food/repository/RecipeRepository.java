package com.coco.cocomoappserver.Food.repository;

import com.coco.cocomoappserver.Food.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
