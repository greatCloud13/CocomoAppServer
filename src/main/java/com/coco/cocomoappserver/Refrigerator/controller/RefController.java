package com.coco.cocomoappserver.Refrigerator.controller;

import com.coco.cocomoappserver.Refrigerator.dto.RefInfoRequestDto;
import com.coco.cocomoappserver.Refrigerator.dto.RefInfoResponseDto;
import com.coco.cocomoappserver.Refrigerator.service.RefService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RefController {
    private final RefService refService;

    @PostMapping("/ref/create")
    public RefInfoResponseDto createRef(@RequestBody RefInfoRequestDto requestDto){
        return refService.createRef(requestDto);
    }

}
