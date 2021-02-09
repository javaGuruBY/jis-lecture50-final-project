package by.jrr.fp.nbrbclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RateShort {
    public int Cur_ID;
    public LocalDateTime Date;
    public double Cur_OfficialRate;
}
