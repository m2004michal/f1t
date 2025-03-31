package com.f1.f1t.model.raceDtoModel;

import lombok.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaceTableDto {
    private String season;
    private List<RaceDto> Races;

}
