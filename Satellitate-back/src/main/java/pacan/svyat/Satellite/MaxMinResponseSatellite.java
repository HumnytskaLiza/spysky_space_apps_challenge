package pacan.svyat.Satellite;

import lombok.*;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MaxMinResponseSatellite {
    private Timestamp minValue;
    private Timestamp maxValue;
}
