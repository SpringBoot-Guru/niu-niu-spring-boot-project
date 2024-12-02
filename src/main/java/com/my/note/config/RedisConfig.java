//package com.my.note.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
//
///**
// * Redis配置类
// *
// * @Author：勇敢牛牛
// * @Date：2024-11-29 15:48
// * @Description：Consider
// */
//@Configuration
//public class RedisConfig {
//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
//        redisTemplate.setConnectionFactory(redisConnectionFactory);
//        // 设置键的序列化器为StringSerializer
//        redisTemplate.setKeySerializer(new JdkSerializationRedisSerializer());
//        // 设置值的序列化器为GenericJackson2JsonSerializer，可根据需求选择其他序列化器
//        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
//        return redisTemplate;
//    }
//}