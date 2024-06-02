package com.coco.cocomoappserver.Food.repository;

import com.coco.cocomoappserver.Food.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findAllByOrderByUsernameAsc();



    List<Food> findByUsernameAndRefnameOrderByFoodname(@Param("username")String username, @Param("refname")String refname);

    List<Food> findByUsernameAndRefnameOrderByFoodnameDesc(@Param("username")String username, @Param("refname")String refname);

    List<Food> findByUsernameAndRefnameOrderByExpiredate(@Param("username")String username, @Param("refname")String refname);

    List<Food> findByUsernameAndRefnameOrderByExpiredateDesc(@Param("username")String username, @Param("refname")String refname);
}
