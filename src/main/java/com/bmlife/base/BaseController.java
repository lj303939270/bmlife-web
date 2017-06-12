package com.bmlife.base;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping("/servlet/json")
    public String index() {
        return "Hello World";
    }

}