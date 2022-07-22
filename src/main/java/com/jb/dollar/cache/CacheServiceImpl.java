package com.jb.dollar.cache;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class CacheServiceImpl implements CacheService {

    private final Map<String, Map<String, Double>> cache;
//    private final RestTemplate restTemplate;

//    @Value("${exchange.rate.url}")
//    private String url;

    @Override
    public Double getRateFromCache(String from, String to) {
        Map<String, Double> rates = cache.get(from);
        if (rates == null) {
            return null;
        }
        return rates.get(to);
    }

    @Override
    public void save(String from, Map<String, Double> rates) {
        cache.put(from, rates);
    }

    @Override
    public void clearAll() {
        cache.clear();
    }

//    @Override
//    public double getRateFromCache(String from, String to) {
//        double rate = 0;
//        Map<String, Double> rates = cache.get(from);
//        if (rates == null || !rates.containsKey(from)) {
//            ExchangeRateResponse res = restTemplate.getForObject(url + from, ExchangeRateResponse.class);
//            System.out.println("res!!! " + res);
//            cache.put(from, res.getRates());
//        }
//        return cache.get(from).get(to);
//    }
}
