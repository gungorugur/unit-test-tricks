package com.gungor.number.stub;

import com.gungor.number.Number;
import com.gungor.number.NumberRepository;

public class FakeNumberRepository implements NumberRepository {

    private Number retrievedNumber;

    public Number getRetrievedNumber() {
        return retrievedNumber;
    }

    @Override
    public void save(Number number) {
        retrievedNumber = new Number();
        retrievedNumber.setValue(number.getValue());
        retrievedNumber.setType(number.getType());
    }
}
