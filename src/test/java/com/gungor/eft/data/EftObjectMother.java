package com.gungor.eft.data;


import com.gungor.eft.Eft;

/*
An object mother is a kind of class used in testing to help create example objects that you use for testing.
https://martinfowler.com/bliki/ObjectMother.html
https://medium.com/@ugurgungor/object-mother-pattern-ve-test-data-builder-pattern-8c1bda7acbcd
*/
public class EftObjectMother {

    public static Eft newValidEft() {
        Eft eft = new Eft();
        eft.setAmount(25.0);
        eft.setSourceIban("TR330006100519786457000000");
        eft.setTargetIban("TR330006100519786457000001");
        return eft;
    }

    public static Eft newUnvalidEftWithZeroAmount() {
        Eft eft = new Eft();
        eft.setAmount(0.0);
        eft.setSourceIban("TR330006100519786457000000");
        eft.setTargetIban("TR330006100519786457000001");
        return eft;
    }
}
