package com.coco.cocomoappserver.Refrigerator.dto;

import com.coco.cocomoappserver.Refrigerator.entity.Refinfo;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RefListResponseDto {
    private String refName;
    private String username;

    public RefListResponseDto(Refinfo entity){
        this.refName=entity.getRefName();
        this.username=entity.getUsername();
    }
}
