package com.gungor.number;

public class DefaultNumberService implements NumberService {

    private NumberRepository numberRepository;

    public DefaultNumberService(NumberRepository numberRepository) {
        this.numberRepository = numberRepository;
    }

    @Override
    public void save(Integer value) {

        Number number = new Number();
        number.setValue(value);

        if (value % 2 == 0) {
            number.setType("even");
        } else {
            number.setType("odd");
        }

        numberRepository.save(number);
    }
}
