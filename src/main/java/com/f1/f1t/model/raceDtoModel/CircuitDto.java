package com.f1.f1t.model.raceDtoModel;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CircuitDto {
    private String circuitId;
    private String url;
    private String circuitName;
    private LocationDto LocationDto;

}
