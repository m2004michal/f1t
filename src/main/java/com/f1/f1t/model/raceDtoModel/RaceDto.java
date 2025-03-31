package com.f1.f1t.model.raceDtoModel;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaceDto {
    private String season;
    private String round;
    private String url;
    private String raceName;
    private CircuitDto Circuit;
    private String date;
    private String time;
    private SessionDto FirstPractice;
    private SessionDto SecondPractice;
    private SessionDto ThirdPractice;
    private SessionDto Qualifying;
    private SessionDto Sprint;
    private SessionDto SprintQualifying;

}