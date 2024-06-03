package com.coco.cocomoappserver.Food.service;

import com.coco.cocomoappserver.Food.dto.FoodListRequestsDto;
import com.coco.cocomoappserver.Food.dto.FoodRequestsDto;
import com.coco.cocomoappserver.Food.dto.FoodResponseDto;
import com.coco.cocomoappserver.Food.dto.SuccessResponseDto;
import com.coco.cocomoappserver.Food.entity.Food;
import com.coco.cocomoappserver.Food.repository.FoodRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    @Transactional(readOnly = true)
    public List<FoodResponseDto> getList(FoodListRequestsDto requestsDto){
        String username = requestsDto.getUsername();
        String refname = requestsDto.getRefname();
        return foodRepository.findByUsernameAndRefnameOrderByFoodname(username, refname).stream().map(FoodResponseDto::new).toList();
    }

    @Transactional(readOnly = true)
    public List<FoodResponseDto> getListDesc(FoodListRequestsDto requestsDto){
        String username = requestsDto.getUsername();
        String refname = requestsDto.getRefname();
        return foodRepository.findByUsernameAndRefnameOrderByFoodnameDesc(username, refname).stream().map(FoodResponseDto::new).toList();

    }

    @Transactional(readOnly = true)
    public List<FoodResponseDto> getListOrderByexp(FoodListRequestsDto requestsDto){
        String username = requestsDto.getUsername();
        String refname = requestsDto.getRefname();
        return foodRepository.findByUsernameAndRefnameOrderByExpiredate(username, refname).stream().map(FoodResponseDto::new).toList();
    }

    @Transactional(readOnly = true)
    public List<FoodResponseDto> getListOrderByExpDesc(FoodListRequestsDto requestsDto){
        String username = requestsDto.getUsername();
        String refname = requestsDto.getRefname();
        return foodRepository.findByUsernameAndRefnameOrderByExpiredateDesc(username, refname).stream().map(FoodResponseDto::new).toList();
    }

    @Transactional
    public FoodResponseDto createFood(FoodRequestsDto requestsDto){
        Food food = new Food(requestsDto);
        foodRepository.save(food);
        return new FoodResponseDto(food);
    }

    @Transactional
    public SuccessResponseDto deleteFood(Long id){
        return foodRepository.findById(id).map(FoodResponseDto::new).orElseThrow(
                ()->new IllegalArgumentException("no content")
        );
    }

    @Transactional
    public FoodResponseDto getFood(Long id){
        return foodRepository.findById(id).map(FoodResponseDto::new).orElseThrow(
                ()-> new IllegalArgumentException("no content")
        );
    }

    @Transactional
    public FoodResponseDto updateFood(Long id, FoodRequestsDto requestsDto) throws Exception{
        Food food = foodRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("no id")
        );
        food.update(requestsDto);
        return new FoodResponseDto(food);
    }


//    @Transactional
//    public FoodResponseDto updateFood(@PathVariable Long id, @RequestBody FoodRequestsDto requestsDto){
//        return FoodService.updateFood(id, requestsDto);
//
//    }

}
