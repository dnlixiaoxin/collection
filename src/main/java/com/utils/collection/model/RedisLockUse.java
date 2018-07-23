package com.utils.collection.model;


import org.springframework.data.redis.core.RedisTemplate;

/**
 * Using IntelliJ IDEA.
 *
 * @author 李小鑫 at 2018/7/23 18:12
 */
public class RedisLockUse {

    RedisTemplate redisTemplate;

    public void execute(String[] args) {
        //使用方法，创建RedisLock对象
        RedisLock lock = new RedisLock(redisTemplate, "lock_" + "product.getId()");
        try {
            if (lock.lock()) {
                //执行目标方法
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

}
