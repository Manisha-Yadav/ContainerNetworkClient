package com.hi.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@EnableAutoConfiguration
public class SprintBootHiMe {

    @GetMapping("/client")
    @ResponseBody
    String home(@RequestParam String hostname) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://" + hostname + "/print";
        String response = restTemplate.getForObject(url,String.class);
        return response + " FROM " + url;
    }

    @RequestMapping("/")
    String health() {
        return "SUCCESS";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SprintBootHiMe.class, args);
    }

}