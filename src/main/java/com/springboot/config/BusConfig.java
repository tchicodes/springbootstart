package com.springboot.config;

import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.stereotype.Component;

/**
 * @author: tianchi
 * @date: 2021/7/15
 * @description:
 **/
@Component
@RemoteApplicationEventScan
//@RemoteApplicationEventScan({"com.acme", "foo.bar"})
//@RemoteApplicationEventScan(basePackages = {"com.acme", "foo.bar", "fizz.buzz"})
public class BusConfig {
}
