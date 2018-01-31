package com.gungor.number;

import com.gungor.number.stub.FakeNumberRepository;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UsingStubNumberServiceTest {

    @Test
    public void save() throws Exception {
        FakeNumberRepository fakeNumberRepository = new FakeNumberRepository();
        DefaultNumberService defaultNumberService = new DefaultNumberService(fakeNumberRepository);

        defaultNumberService.save(4);

        assertThat(fakeNumberRepository.getRetrievedNumber().getValue(), is(4));
        assertThat(fakeNumberRepository.getRetrievedNumber().getType(), is("even"));
    }
}