package com.coco.cocomoappserver.Food.repository;

import com.coco.cocomoappserver.Food.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findAllByOrderByUsernameAsc();

    List<Food> findByUsernameAndRefnumOrderByFoodname(@Param("username")String username, @Param("refnum")int refnum);

    List<Food> findByUsernameAndRefnumOrderByFoodnameDesc(@Param("username")String username, @Param("refnum")int refnum);

    List<Food> findByUsernameAndRefnumOrderByExpiredate(@Param("username")String username, @Param("refnum")int refnum);

    List<Food> findByUsernameAndRefnumOrderByExpiredateDesc(@Param("username")String username, @Param("refnum")int refnum);
}
