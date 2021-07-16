package com.springboot.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.bean.State;
import com.springboot.bean.UpdateDateEvent;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author: tianchi
 * @date: 2021/7/15
 * @description:
 **/
@Slf4j
@Component
public class UpdateDataEventListener implements ApplicationListener<UpdateDateEvent> {

    @Autowired
    private State state;
    @Autowired
    private ObjectMapper objectMapper;

    @SneakyThrows
    @Override
    public void onApplicationEvent(UpdateDateEvent updateDateEvent) {
        log.info("event received:{}", objectMapper.writeValueAsString(updateDateEvent));
        state.setData(updateDateEvent.getNewData());
    }

}
