package com.coco.cocomoappserver.Refrigerator.controller;

import com.coco.cocomoappserver.Refrigerator.dto.*;
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

    @DeleteMapping("/ref/{id}")
    public SuccessResponseDto deleteRef(@PathVariable Long id) throws Exception {
        return refService.deleteRef(id);
    }

    @DeleteMapping("/ref/clear/{username}")
    public SuccessResponseDto deleteAllRef(@PathVariable String username)throws Exception{
        return refService.deleteAllRef(username);


    }

}
