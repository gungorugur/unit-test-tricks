package com.gungor.eft;

import java.time.LocalDateTime;

public class DefaultDatetimeService implements DatetimeService {

    @Override
    public LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }
}
