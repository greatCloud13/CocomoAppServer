package com.coco.cocomoappserver.Refrigerator.controller;

import com.coco.cocomoappserver.Refrigerator.dto.RefInfoRequestDto;
import com.coco.cocomoappserver.Refrigerator.dto.RefInfoResponseDto;
import com.coco.cocomoappserver.Refrigerator.dto.RefListRequestDto;
import com.coco.cocomoappserver.Refrigerator.dto.RefListResponseDto;
import com.coco.cocomoappserver.Refrigerator.service.RefService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Ref;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RefController {
    private final RefService refService;

    @PostMapping("/ref/create")
    public RefInfoResponseDto createRef(@RequestBody RefInfoRequestDto requestDto){
        return refService.createRef(requestDto);
    }

    @GetMapping("/ref/list/{userid}")
    public List<RefListResponseDto> getRefList(@PathVariable String userid){
        return refService.getRefList(userid);
    }

}
