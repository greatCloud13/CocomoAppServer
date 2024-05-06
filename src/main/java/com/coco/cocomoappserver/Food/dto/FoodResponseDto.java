package com.coco.cocomoappserver.Food.dto;

import com.coco.cocomoappserver.Food.entity.Food;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FoodResponseDto {
    private String username;
    private String foodname;
    private String expiredate;
    private String category;
    private String memo;
    private String favorite;

    public FoodResponseDto(Food entity){
        this.foodname = entity.getFoodname();
        this.username = entity.getUsername();
        this.expiredate = entity.getExpiredate();
        this.category = entity.getCategory();
        this.memo = entity.getMemo();
        this.favorite = entity.getFavorite();
    }
}
