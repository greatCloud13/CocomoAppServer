package com.coco.cocomoappserver.JWT.Service;

import com.coco.cocomoappserver.JWT.dto.CustomUserDetails;
import com.coco.cocomoappserver.JWT.entity.UserEntity;
import com.coco.cocomoappserver.JWT.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userData = userRepository.findByUsername(username);

        if(userData != null){

            return new CustomUserDetails(userData);
        }

        return null;
    }

}
