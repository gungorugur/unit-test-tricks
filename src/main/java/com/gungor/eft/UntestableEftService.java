package com.gungor.eft;

import java.time.LocalDateTime;

public class UntestableEftService implements EftService {

    public Boolean doEft(Eft eft) {

        if (LocalDateTime.now().getHour() >= 9 && LocalDateTime.now().getHour() < 17) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }
}
