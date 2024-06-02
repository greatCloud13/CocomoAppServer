package com.coco.cocomoappserver.Refrigerator.service;

import com.coco.cocomoappserver.Refrigerator.dto.RefInfoRequestDto;
import com.coco.cocomoappserver.Refrigerator.dto.RefInfoResponseDto;
import com.coco.cocomoappserver.Refrigerator.entity.Refinfo;
import com.coco.cocomoappserver.Refrigerator.repository.RefinfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RefService {
    private final RefinfoRepository refinfoRepository;

    @Transactional
    public RefInfoResponseDto createRef(RefInfoRequestDto requestDto){
        Refinfo ref = new Refinfo(requestDto);
        refinfoRepository.save(ref);
        return new RefInfoResponseDto(ref);
    }


}
