package com.coco.cocomoappserver.JWT.controller;

import com.coco.cocomoappserver.Food.dto.SuccessResponseDto;
import com.coco.cocomoappserver.JWT.Service.JoinService;
import com.coco.cocomoappserver.JWT.dto.JoinDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JoinController {
    private final JoinService joinService;

    public JoinController(JoinService joinService){
        this.joinService=joinService;
    }

    @PostMapping("/join")
    public SuccessResponseDto joinProcess(JoinDTO joinDTO){
        SuccessResponseDto successResponseDto;
        successResponseDto = joinService.joinProcess(joinDTO);
        return successResponseDto;
    }
}
