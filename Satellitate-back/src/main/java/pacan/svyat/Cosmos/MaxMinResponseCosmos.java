package pacan.svyat.Cosmos;

import lombok.*;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MaxMinResponseCosmos {
    private Timestamp minValue;
    private Timestamp maxValue;
}
