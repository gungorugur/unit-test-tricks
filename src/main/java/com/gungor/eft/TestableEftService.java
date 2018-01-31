package com.gungor.eft;

public class TestableEftService implements EftService {

    private DatetimeService datetimeService;

    public TestableEftService(DatetimeService datetimeService) {
        this.datetimeService = datetimeService;
    }

    public Boolean doEft(Eft eft) {

        if (datetimeService.getCurrentTime().getHour() >= 9 && datetimeService.getCurrentTime().getHour() < 17) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

}