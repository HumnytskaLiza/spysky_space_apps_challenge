package pacan.svyat.Iridium;

import lombok.*;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MaxMinResponseIridium {
    private Timestamp minValue;
    private Timestamp maxValue;
}
