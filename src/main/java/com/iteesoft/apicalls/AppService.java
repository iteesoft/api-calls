package com.iteesoft.apicalls;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class AppService {

    private static final String apiUrl = "https://randomuser.me/api/";



    public ResponseEntity<String> fetchUserData(){
        RestTemplate restTemplate = new RestTemplate();
        try {
            var forEntity = restTemplate.getForEntity(apiUrl, String.class);
            log.info(forEntity.getBody());
            return forEntity;
        } catch (Exception abc){
            log.info(abc.getMessage());
            return null;
        }
    }
}
