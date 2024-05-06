package com.coco.cocomoappserver.Food.dto;

import lombok.Getter;

@Getter
public class SuccessResponseDto {
    private String success;

    public SuccessResponseDto(String success){
        this.success = success;
    }

}
