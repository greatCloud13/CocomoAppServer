package com.coco.cocomoappserver.Food.entity;

import com.coco.cocomoappserver.Food.dto.FoodRequestsDto;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Food {

    @Id
    @Column(nullable = false)
    private int id;

    @Column(nullable = true)
    private String username;

    @Column(nullable = false)
    private String foodname;

    @Column(nullable = false)
    private String expiredate;

    @Column(nullable = false)
    private String category;

    @Column(nullable = true)
    private String memo;

    @Column(nullable = false)
    private String favorite;

    @Column(nullable = true)
    private String refname;

    @Column(nullable = false)
    private String filepath;

    public Food(FoodRequestsDto requestDto){
        this.username= requestDto.getUsername();
        this.foodname=requestDto.getFoodname();
        this.expiredate= requestDto.getExpiredate();
        this.category= requestDto.getCategory();
        this.memo = requestDto.getMemo();
        this.favorite = requestDto.getFavorite();
        this.refname = requestDto.getRefname();
        this.filepath=requestDto.getFilepath();
    }

    public void update(FoodRequestsDto requestDto){
        this.username= requestDto.getUsername();
        this.foodname=requestDto.getFoodname();
        this.expiredate= requestDto.getExpiredate();
        this.category= requestDto.getCategory();
        this.memo = requestDto.getMemo();
        this.favorite = requestDto.getFavorite();
        this.refname = requestDto.getRefname();
    }
}