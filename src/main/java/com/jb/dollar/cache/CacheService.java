package com.jb.dollar.cache;

import java.util.Map;

public interface CacheService {
//    double getRateFromCache(String from, String to);

    Double getRateFromCache(String from, String to);

    void save(String from, Map<String, Double> rates);

    void clearAll();
}
