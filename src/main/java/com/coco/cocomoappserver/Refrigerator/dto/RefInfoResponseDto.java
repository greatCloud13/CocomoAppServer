package com.coco.cocomoappserver.Refrigerator.dto;

import com.coco.cocomoappserver.Refrigerator.entity.Refinfo;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RefInfoResponseDto {
    private String refName;
    private int refNum;
    private String username;

    public RefInfoResponseDto(Refinfo entity){
        this.refName = entity.getRefName();
        this.refNum = entity.getRefnum();
        this.username = entity.getUseranme();
    }
}
