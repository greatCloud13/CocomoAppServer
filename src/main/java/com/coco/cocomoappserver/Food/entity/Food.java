package com.coco.cocomoappserver.Food.entity;

import com.coco.cocomoappserver.Food.dto.FoodRequestsDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Food {

    @Id
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String foodname;

    @Column(nullable = false)
    private String expiredate;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String memo;

    @Column(nullable = false)
    private String favorite;

    @Column(nullable = false)
    private int refnum;

    public Food(FoodRequestsDto requestDto){
        this.username= requestDto.getUsername();
        this.foodname=requestDto.getFoodname();
        this.expiredate= requestDto.getExpiredate();
        this.category= requestDto.getCategory();
        this.memo = requestDto.getMemo();
        this.favorite = requestDto.getFavorite();
        this.refnum = requestDto.getRefnum();
    }
}
