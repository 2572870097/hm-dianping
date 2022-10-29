package com.hmdp.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @program: hm-dianping
 * @description:
 * @author: 张陈宏
 * @create: 2022-10-20 21:09
 **/
@Data
public class RedisData {
    private LocalDateTime expireTime;
    private Object data;
}
