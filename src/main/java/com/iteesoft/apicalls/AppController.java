package com.iteesoft.apicalls;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class AppController {

    private final AppService appService;

//    @GetMapping
//    public ResponseEntity<?> getCountries() {
//        String result;
//        try {
//            String uri = "https://countriesnow.space/api/v0.1/countries";
//            RestTemplate restTemplate = new RestTemplate();
//            result = restTemplate.getForObject(uri, HttpStatus.Ok);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ResponseEntity<>("Error!, please try again ",HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//        return ResponseEntity.ok().body(result).build();
//    }


    @GetMapping("/")
    public ResponseEntity<String> externalControllerHandler() {
        return appService.fetchUserData();
    }
}
