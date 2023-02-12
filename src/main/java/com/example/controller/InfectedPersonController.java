package com.example.controller;

import com.example.common.Result;
import com.example.entity.InfectedPerson;
import com.example.service.InfectedPersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qiu
 * @description
 * @create 2023/2/12 8:41
 **/
@RestController("/infectedPerson")
public class InfectedPersonController {
    @Resource
    private InfectedPersonService infectedPersonService;

    @GetMapping("/list")
    public Result<List<InfectedPerson>> queryInfectedPersonAll(){
        List<InfectedPerson> infectedPeople = infectedPersonService.queryInfectedPersonAll();
        return  Result.success(infectedPeople);
    }
}
