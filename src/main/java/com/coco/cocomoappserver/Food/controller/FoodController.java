package com.coco.cocomoappserver.Food.controller;

import com.coco.cocomoappserver.Food.dto.FoodRequestsDto;
import com.coco.cocomoappserver.Food.dto.FoodResponseDto;
import com.coco.cocomoappserver.Food.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FoodController{

    private final FoodService foodService;

    @GetMapping("/foods/list")
    public List<FoodResponseDto> getList(){
        return foodService.getList();
    }
    @PostMapping("/foods/post")
    public FoodResponseDto createFood(@RequestBody FoodRequestsDto requestsDto){
        return foodService.createFood(requestsDto);
    }
    @GetMapping("/foods/get/{id}")
    public FoodResponseDto getFood(@PathVariable Long id){
        return foodService.getFood(id);
    }
}
