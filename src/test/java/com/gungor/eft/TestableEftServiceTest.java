package com.gungor.eft;

import com.gungor.eft.data.EftObjectMother;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestableEftServiceTest {

    @Mock
    private DatetimeService datetimeService;

    @InjectMocks
    private TestableEftService testableEftService;

    //Test code formatting pattern: 3A
    @Test
    public void doEftShouldReturnTrueWhenCurrentHourBetween9and17() throws Exception {
        //Arrange
        LocalDateTime localDateTime = LocalDateTime.of(2017, Month.DECEMBER, 29, 10, 30);
        when(datetimeService.getCurrentTime()).thenReturn(localDateTime);

        //Act
        Boolean result = testableEftService.doEft(EftObjectMother.newValidEft());

        //Assert
        assertTrue(result);
    }

    @Test
    public void doEftShouldReturnTrueWhenCurrentHourLessThan9() throws Exception {
        LocalDateTime localDateTime = LocalDateTime.of(2017, Month.DECEMBER, 29, 8, 30);
        when(datetimeService.getCurrentTime()).thenReturn(localDateTime);

        Boolean result = testableEftService.doEft(EftObjectMother.newValidEft());

        assertFalse(result);
    }

    @Test
    public void doEftShouldReturnTrueWhenCurrentHourBiggerThan17() throws Exception {
        LocalDateTime localDateTime = LocalDateTime.of(2017, Month.DECEMBER, 29, 18, 30);
        when(datetimeService.getCurrentTime()).thenReturn(localDateTime);

        Boolean result = testableEftService.doEft(EftObjectMother.newValidEft());

        assertFalse(result);
    }
}