package com.f1.f1t.model.raceDtoModel;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MRDataDto {
    private String series;
    private String url;
    private String limit;
    private String offset;
    private String total;
    private RaceTableDto RaceTable;

}
