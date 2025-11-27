package com.coco.cocomoappserver.JWT.Service;

import com.coco.cocomoappserver.Food.dto.SuccessResponseDto;
import com.coco.cocomoappserver.Food.repository.FoodRepository;
import com.coco.cocomoappserver.JWT.repository.UserRepository;
import com.coco.cocomoappserver.Refrigerator.repository.RefinfoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WithreawlService {
    private final RefinfoRepository refinfoRepository;
    private final FoodRepository foodRepository;
    private final UserRepository userRepository;

    @Transactional
    public SuccessResponseDto withreawl(String username){
        refinfoRepository.deleteAllByUsername(username);
        foodRepository.deleteAllByUsername(username);
        userRepository.deleteByUsername(username);
        return new SuccessResponseDto("true");
    }
}
