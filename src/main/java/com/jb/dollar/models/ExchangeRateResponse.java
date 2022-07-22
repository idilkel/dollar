package com.jb.dollar.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExchangeRateResponse {

    public String provider;
    @JsonProperty("WARNING_UPGRADE_TO_V6")
    public String warningUpgradeToV6;

    public String terms;

    public String base;

    public Date date;

    public long timeLastUpdated;

    public Map<String, Double> rates;

}
