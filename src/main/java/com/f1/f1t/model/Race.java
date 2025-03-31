package com.f1.f1t.model;

import lombok.*;
import java.time.LocalDate;
import java.time.OffsetTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Race {
    private String round;
    private String raceName;
    private String circuitId;
    private String circuitName;
    private String Country;
    private LocalDate date;
    private OffsetTime startTime;
    private DateAndTime firstPractice;
    private DateAndTime qualifying;
    private DateAndTime Sprint;
    private DateAndTime SprintQualifying;

}
