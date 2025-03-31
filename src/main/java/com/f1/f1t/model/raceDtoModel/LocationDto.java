package com.f1.f1t.model.raceDtoModel;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LocationDto {
    private String lat;
    private String _long;
    private String locality;
    private String country;

}
