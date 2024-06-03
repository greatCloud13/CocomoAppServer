package com.coco.cocomoappserver.Refrigerator.entity;

import com.coco.cocomoappserver.Refrigerator.dto.RefInfoRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Refinfo {
    @Id
    @Column(nullable = false)
    private int refid;

    @Column(nullable = false)
    private int refnum;

    @Column(nullable = false)
    private String refName;

    @Column(nullable = false)
    private String username;

    public Refinfo(RefInfoRequestDto requestDto){
        this.refName = requestDto.getRefname();
        this.username = requestDto.getUsername();
    }

}
