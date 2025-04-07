package com.f1.f1t.controller;

import com.f1.f1t.model.raceDtoModel.RaceScheduleDto;
import com.f1.f1t.service.RaceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/main/")
@Controller
@AllArgsConstructor
public class RaceController {
    private final RaceService raceService;

    @GetMapping("/getRacesForGivenYear")
    public ResponseEntity<RaceScheduleDto> getRacesForGivenYear(@RequestParam String year) {
        return new ResponseEntity<>(raceService.getRacesResponseAsDto(year), HttpStatus.OK);
    }
}
