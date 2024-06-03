package com.coco.cocomoappserver.Food.controller;

import com.coco.cocomoappserver.Food.dto.*;
import com.coco.cocomoappserver.Food.repository.FoodRepository;
import com.coco.cocomoappserver.Food.service.FoodService;
import com.coco.cocomoappserver.Refrigerator.dto.RefInfoResponseDto;
import com.coco.cocomoappserver.Refrigerator.dto.RefInfoRequestDto;
import com.sun.net.httpserver.Authenticator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FoodController{

    private final FoodService foodService;



    @PostMapping("/foods/list/asc")
    public List<FoodResponseDto> getList(@RequestBody FoodListRequestsDto requestsDto){
        return foodService.getList(requestsDto);
    }

    @PostMapping("/foods/list/desc")
    public List<FoodResponseDto> getListDesc(@RequestBody FoodListRequestsDto requestsDto){
        return foodService.getListDesc(requestsDto);
    }


    @PostMapping("/foods/list/exp_asc")
    public List<FoodResponseDto> getListExpAsc(@RequestBody FoodListRequestsDto requestsDto){
        return foodService.getListOrderByexp(requestsDto);
    }

    @PostMapping("/foods/list/exp_desc")
    public List<FoodResponseDto> getListExpDesc(@RequestBody FoodListRequestsDto requestsDto){
        return foodService.getListOrderByExpDesc(requestsDto);
    }

    @PostMapping("/foods/post")
    public FoodResponseDto createFood(@RequestBody FoodRequestsDto requestsDto){
        return foodService.createFood(requestsDto);
    }
    @PutMapping("/foods/{id}")
    public FoodResponseDto updateFood(@PathVariable Long id, @RequestBody FoodRequestsDto requestsDto) throws Exception {
        return foodService.updateFood(id, requestsDto);
    }

    @GetMapping("/foods/{id}")
    public FoodResponseDto getFood(@PathVariable Long id){
        return foodService.getFood(id);
    }

    @DeleteMapping("/foods/{id}")
    public SuccessResponseDto deleteFood(@PathVariable Long id) throws Exception {
        return foodService.deleteFood(id);
    }
}
