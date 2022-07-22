package com.jb.dollar.service;

import com.jb.dollar.cache.CacheService;
import com.jb.dollar.models.ExchangeRateResponse;
import com.jb.dollar.models.MoneyResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class MoneyServiceImpl implements MoneyService {

    private final RestTemplate restTemplate;
    private final CacheService cacheService;
    @Value("${exchange.rate.url}")
    private String url;

//    @Override
//    public MoneyResponseDto convert(String from, String to, double amount) {
////        ExchangeRateResponse res = restTemplate.getForObject(url + from, ExchangeRateResponse.class);
////        System.out.println("res!!! " + res);
////        double rate = res.rates.get(to);
//    double rate= cacheService.getRateFromCache(from, to);
//
//        return MoneyResponseDto.builder().from(from).to(to).amount(amount).result(amount * rate).build();
//    }

    @Override
    public MoneyResponseDto convert(String from, String to, double amount) {

        Double rate = cacheService.getRateFromCache(from, to);
        if (rate == null) {
            ExchangeRateResponse res = restTemplate.getForObject(url + from, ExchangeRateResponse.class);
            System.out.println("res!!! " + res);
            cacheService.save(from, res.getRates());
            rate = cacheService.getRateFromCache(from, to);
        }

        return MoneyResponseDto.builder().from(from).to(to).amount(amount).result(amount * rate).build();
    }
}
