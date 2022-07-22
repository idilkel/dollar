package com.jb.dollar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CollectionConfig {

    @Bean
    public Map<String, Double> map1() {
        return new HashMap<>();
    }

    @Bean
    public Map<String, Map<String, Double>> map2() {
        return new HashMap<>();
    }
}
