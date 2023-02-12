package com.example.service;

import com.example.dao.InfectedPersonDao;
import com.example.entity.InfectedPerson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qiu
 * @description
 * @create 2023/2/12 11:18
 **/
@Service
public class InfectedPersonService {
    @Resource
    private InfectedPersonDao infectedPersonDao;

    public List<InfectedPerson> queryInfectedPersonAll(){
        List<InfectedPerson> infectedPeople = infectedPersonDao.selectAll();
        return infectedPeople;
    }
}
