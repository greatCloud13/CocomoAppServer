package com.coco.cocomoappserver.JWT.Service;

import com.coco.cocomoappserver.Food.dto.SuccessResponseDto;
import com.coco.cocomoappserver.JWT.dto.JoinDTO;
import com.coco.cocomoappserver.JWT.entity.UserEntity;
import com.coco.cocomoappserver.JWT.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class JoinService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public JoinService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder){

        this.userRepository=userRepository;
        this.bCryptPasswordEncoder=bCryptPasswordEncoder;
    }

    public SuccessResponseDto joinProcess(JoinDTO joinDTO){

        String username = joinDTO.getUsername();
        String password = joinDTO.getPassword();


        Boolean isExist = userRepository.existsByUsername(username);

        if(isExist){

            return new SuccessResponseDto("false");
        }

        UserEntity data = new UserEntity();

        data.setUsername(username);
        data.setPassword(bCryptPasswordEncoder.encode(password));
        data.setRole("ROLE_ADMIN");

        userRepository.save(data);

        return new SuccessResponseDto("false");
    }
}
