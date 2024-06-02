package com.coco.cocomoappserver.Refrigerator.repository;

import com.coco.cocomoappserver.Refrigerator.entity.Refinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefinfoRepository extends JpaRepository<Refinfo, Long>{
    //List<Refrigerator> findByUsernameOrderByRefnum(@Param("username")String username);

}
