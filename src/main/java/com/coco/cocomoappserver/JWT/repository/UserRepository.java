package com.coco.cocomoappserver.JWT.repository;

import com.coco.cocomoappserver.JWT.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Boolean existsByUsername(String username);

    //username을 받아 db테이블에서 회원조회
    UserEntity findByUsername(String username);

    void deleteByUsername(String username);
}