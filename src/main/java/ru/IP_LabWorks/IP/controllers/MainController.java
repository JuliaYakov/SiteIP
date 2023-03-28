package ru.IP_LabWorks.IP.controllers;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.IP_LabWorks.IP.domain.ITypeInterface;
import ru.IP_LabWorks.IP.service.TypeService;

@RestController
public class MainController {
    private final TypeService Service;

    public MainController(TypeService service) {
        Service = service;
    }

    @GetMapping("/Method1")
    public Object Method1(@RequestParam(value = "Type") String Type,
                          @RequestParam(value = "value1") Object value1,
                          @RequestParam(value = "value2") Object value2){
        return Service.Method1(value1,value2,Type);
    }

    @GetMapping("/Method2")
    public Object Method2(@RequestParam(value = "Type") String Type,
                          @RequestParam(value = "value1") Object value1,
                          @RequestParam(value = "value2") Object value2){
        return Service.Method2(value1,value2,Type);
    }

    @GetMapping("/Method3")
    public Object Method3(@RequestParam(value = "Type") String Type,
                          @RequestParam(value = "value1") Object value1,
                          @RequestParam(value = "value2") Object value2){
        return Service.Method3(value1,value2,Type);
    }

    @GetMapping("/Method4")
    public Object Method4(@RequestParam(value = "Type") String Type,
                          @RequestParam(value = "value1") Object value1,
                          @RequestParam(value = "value2") Object value2){
        return Service.Method4(value1,value2,Type);
    }
}
