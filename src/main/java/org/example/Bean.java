package org.example;
import org.example.reflection.SomeInterface;
import org.example.reflection.SomeOtherInterface;

class Bean {

    @AutoInjectable
    private SomeInterface someField;
    @AutoInjectable
    private SomeOtherInterface otherField;

    public Bean() {
    }

    public void go(){
        someField.doSome();
        otherField.doSome();
    }


}