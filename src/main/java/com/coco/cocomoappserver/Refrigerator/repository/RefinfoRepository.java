package com.coco.cocomoappserver.Refrigerator.repository;

import com.coco.cocomoappserver.Refrigerator.entity.Refinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RefinfoRepository extends JpaRepository<Refinfo, Long>{

    List<Refinfo> findByUsernameOrderByRefNameAsc(@Param("username")String username);

}
