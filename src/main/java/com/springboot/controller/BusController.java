package com.springboot.controller;

import com.springboot.bean.State;
import com.springboot.bean.UpdateDateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.BusProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

/**
 * @author: tianchi
 * @date: 2021/7/15
 * @description:
 **/
@RestController
@RequestMapping("/api")
public class BusController {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private BusProperties busProperties;

    @Autowired
    private State state;

    @GetMapping("/get")
    int getResult() {
        return state.getData();
    }

    @PostMapping("/put")
    void updateData(@RequestParam int newData) {
        String id = busProperties.getId();
        UpdateDateEvent event = new UpdateDateEvent();
        event.setOriginService(id);
        event.setNewData(newData);
        applicationContext.publishEvent(event);
    }

}
