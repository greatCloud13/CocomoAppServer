package com.coco.cocomoappserver.Food.service;

import com.coco.cocomoappserver.Food.dto.FoodRequestsDto;
import com.coco.cocomoappserver.Food.dto.FoodResponseDto;
import com.coco.cocomoappserver.Food.entity.Food;
import com.coco.cocomoappserver.Food.repository.FoodRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    @Transactional(readOnly = true)
    public List<FoodResponseDto> getList(){
        return foodRepository.findAllByOrderByUsernameAsc().stream().map(FoodResponseDto::new).toList();
    }

    @Transactional
    public FoodResponseDto createFood(FoodRequestsDto requestsDto){
        Food food = new Food(requestsDto);
        foodRepository.save(food);
        return new FoodResponseDto(food);
    }

    @Transactional
    public FoodResponseDto getFood(Long id){
        return foodRepository.findById(id).map(FoodResponseDto::new).orElseThrow(
                ()-> new IllegalArgumentException("해당 항목이 존재하지 않습니다")
        );
    }

//    @Transactional
//    public FoodResponseDto updateFood(@PathVariable Long id, @RequestBody FoodRequestsDto requestsDto){
//        return FoodService.updateFood(id, requestsDto);
//
//    }

}
