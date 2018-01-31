package com.gungor.eft;

import com.gungor.eft.data.EftObjectMother;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UntestableEftServiceTest {

    // This test fails when current hour less than 9:00 or bigger than 17:00
    // Static methods are evil!!
    @Test
    public void doEftShouldReturnTrueWhenCurrentHourBetween9and17() {
        UntestableEftService untestableEftService = new UntestableEftService();

        Boolean result = untestableEftService.doEft(EftObjectMother.newValidEft());

        assertTrue(result);
    }
}