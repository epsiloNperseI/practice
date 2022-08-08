package freeUtils;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

public class DifBetween {
    public static void main(String[] args) {
        OffsetDateTime offset = OffsetDateTime.now();
        OffsetDateTime value =  offset.minusSeconds(10);
        long secondsBetween = ChronoUnit.SECONDS.between(value, offset);
        System.out.println(secondsBetween);
    }
}
