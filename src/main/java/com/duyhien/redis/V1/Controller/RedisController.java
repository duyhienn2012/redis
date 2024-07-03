package com.duyhien.redis.V1.Controller;


import com.duyhien.redis.V1.Service.BaseRedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/redis")
@RequiredArgsConstructor
public class RedisController {

    private final BaseRedisService redisService;

    @PostMapping
    public void set() {
        redisService.set("redis_key", "redis_value");
    }
}
