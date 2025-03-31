package com.f1.f1t.service;

import com.f1.f1t.model.raceDtoModel.RaceScheduleDto;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class RaceService {

    private static final String RACES_API_URL = "https://api.jolpi.ca/ergast/f1/{year}/races.json";
    private final RestTemplate restTemplate;
    private final Gson gson;

    private String injectYearParameterIntoURL(String year) {
        return RACES_API_URL.replace("{year}", year);
    }

    public String getRacesResponseAsJSON(String year) {
        return restTemplate.getForObject(injectYearParameterIntoURL(year), String.class);
    }

    public RaceScheduleDto getRacesResponseAsDto(String year) {
        return gson.fromJson(getRacesResponseAsJSON(year), RaceScheduleDto.class);

    }

}