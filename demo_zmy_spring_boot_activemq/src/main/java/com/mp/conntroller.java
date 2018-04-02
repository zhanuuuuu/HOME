package com.mp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-02.
 */
@RestController
public class conntroller {

    @RequestMapping("/get")
    public String demo(){
        return "123";
    }
}
