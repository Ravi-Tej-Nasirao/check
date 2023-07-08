package com.learning.check;/*
 * @author : Ravi Tej Nasirao
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @GetMapping("/")
    public String sample(){
        return "Sample program";
    }
}
