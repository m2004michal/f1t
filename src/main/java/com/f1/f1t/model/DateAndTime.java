package com.f1.f1t.model;

import lombok.*;
import java.time.LocalDate;
import java.time.OffsetTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DateAndTime {
    private LocalDate date;
    private OffsetTime startTime;

}
