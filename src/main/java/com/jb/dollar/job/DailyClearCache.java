package com.jb.dollar.job;

import com.jb.dollar.cache.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DailyClearCache {

    private final CacheService cacheService;

    @Scheduled(cron = " 0 0 6 * * *")
    public void dailyClear() {
        cacheService.clearAll();
    }
}
