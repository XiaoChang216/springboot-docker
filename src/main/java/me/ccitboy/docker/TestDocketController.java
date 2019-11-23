package me.ccitboy.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cc
 * @Date 9:54 2019/11/22
 * @Description
 */
@RestController
public class TestDocketController {
    @RequestMapping("hello")
    public  String hello(){
        return "hello docker";
    }
}
