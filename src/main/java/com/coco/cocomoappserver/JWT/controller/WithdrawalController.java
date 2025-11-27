package com.coco.cocomoappserver.JWT.controller;

import com.coco.cocomoappserver.Food.dto.SuccessResponseDto;
import com.coco.cocomoappserver.JWT.Service.WithreawlService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WithdrawalController {
    private final WithreawlService withreawlService;
    @DeleteMapping("/withreawl/{username}")
    public SuccessResponseDto withreawl(@PathVariable String username){
        return withreawlService.withreawl(username);
    }
}
