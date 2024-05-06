package com.coco.cocomoappserver.Food.dto;

import lombok.Getter;

@Getter
public class FoodRequestsDto {
    private String username;
    private String foodname;
    private String expiredate;
    private String category;
    private String memo;
    private String favorite;
}
