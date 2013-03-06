package org.designpatterns.createmodel.abstractfactory;

public class ConcreteFactory2 implements Factory {

    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }

}
