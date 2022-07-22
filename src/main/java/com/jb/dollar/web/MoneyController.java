package com.jb.dollar.web;

import com.jb.dollar.models.MoneyResponseDto;
import com.jb.dollar.service.MoneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("money")
@RequiredArgsConstructor
public class MoneyController {
    private final MoneyService moneyService;

    @GetMapping("convert")
    public MoneyResponseDto convert(@RequestParam String from, @RequestParam String to, @RequestParam double amount) {
        return moneyService.convert(from, to, amount);
    }
}
