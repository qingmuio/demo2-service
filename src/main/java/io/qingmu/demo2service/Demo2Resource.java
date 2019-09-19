package io.qingmu.demo2service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Resource {

    @Value("${demo2Value}")
    private String demo2Value;

    @GetMapping("world")
    public String hello() {
        return demo2Value;
    }

    @GetMapping("world2")
    public DemoQueryModel hello2(DemoQueryModel demo) {
        return DemoQueryModel.builder().nameEQ(demo.getNameEQ()).build();
    }


}
