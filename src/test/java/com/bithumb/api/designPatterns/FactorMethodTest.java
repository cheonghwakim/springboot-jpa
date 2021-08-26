package com.bithumb.api.designPatterns;

import java.util.function.Supplier;

public class FactorMethodTest {
}

interface  Flooring{void installation();}

class ConcreteFlooring implements Flooring{
    @Override
    public void installation() {
        System.out.println("컨크리트 바닥 시공됨");
    }
}
class CorkFlooring implements Flooring{
    @Override
    public void installation() {
        System.out.println("코크 바닥 시공됨");
    }
}
class WoodenFlooring implements Flooring{
    @Override
    public void installation() {
        System.out.println("목재 바닥 시공됨");
    }
}
class FlooringFactory{
    static Flooring getFlooring(int min, int max){
        Supplier<Flooring> flooring;
        if(min <= 5 && max <= 20){ flooring = WoodenFlooring::new;}
        else if(min <= 5 && max <= 45){ flooring = CorkFlooring::new;}
        else{ flooring = ConcreteFlooring::new;}
        return flooring.get();
    }
}
