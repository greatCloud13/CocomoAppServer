package com.coco.cocomoappserver.Refrigerator.service;

import com.coco.cocomoappserver.Refrigerator.dto.*;
import com.coco.cocomoappserver.Refrigerator.entity.Refinfo;
import com.coco.cocomoappserver.Refrigerator.repository.RefinfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Transactional(readOnly = true)
    public List<RefListResponseDto> getRefList(String userid){
        return refinfoRepository.findByUsernameOrderByRefNameAsc(userid).stream().map(RefListResponseDto::new).toList();
    }

    @Transactional
    public SuccessResponseDto deleteRef(Long id)throws Exception{
        Refinfo refinfo = refinfoRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("no id")
        );
        refinfoRepository.deleteById(id);
        return new SuccessResponseDto("true");
    }
}
