package com.hmdp.service;

public interface ISimpleRedisLock {
    boolean tryLock(long timeoutSec);
    void unlock();
}
