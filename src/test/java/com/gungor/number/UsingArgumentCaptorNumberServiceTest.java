package com.gungor.number;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class UsingArgumentCaptorNumberServiceTest {

    @Mock
    private NumberRepository numberRepository;

    @InjectMocks
    private DefaultNumberService defaultNumberService;

    @Captor
    private ArgumentCaptor<Number> numberArgumentCaptor;

    @Test
    public void save() {
        defaultNumberService.save(4);

        verify(numberRepository, times(1)).save(numberArgumentCaptor.capture());
        assertThat(numberArgumentCaptor.getValue().getValue(), is(4));
        assertThat(numberArgumentCaptor.getValue().getType(), is("even"));
    }
}
