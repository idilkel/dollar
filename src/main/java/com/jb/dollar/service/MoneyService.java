package com.jb.dollar.service;

import com.jb.dollar.models.MoneyResponseDto;

public interface MoneyService {
    MoneyResponseDto convert(String from, String to, double amount);
}
