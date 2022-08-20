package com.example.restrest1.restrest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DenemeController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/zort")
    List<String> all() {

        List<String> deneme = new ArrayList<>();
        deneme.add("ali");
        deneme.add("veli");
        deneme.add("zort");

        return deneme;
    }

}
