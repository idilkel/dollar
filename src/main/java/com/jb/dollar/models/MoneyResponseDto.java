package com.jb.dollar.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MoneyResponseDto {
    @JsonProperty("fromCurrency")
    private String from;
    @JsonProperty("toCurrency")
    private String to;
    private double amount;
    private double result;
}
