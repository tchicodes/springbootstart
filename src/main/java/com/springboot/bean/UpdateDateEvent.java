package com.springboot.bean;

import lombok.Data;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;

/**
 * @author: tianchi
 * @date: 2021/7/15
 * @description:
 **/
@Data
public class UpdateDateEvent extends RemoteApplicationEvent {

    private String originService;

    private Integer newData;

}
