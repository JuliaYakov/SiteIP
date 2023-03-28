package ru.IP_LabWorks.IP.domain;

public class TypeDouble implements ITypeInterface<Double> {

    @Override
    public Double Method1(Double value1, Double value2) {
        return value1 + value2;
    }

    @Override
    public Double Method2(Double value1, Double value2) {
        return value1 - value2;
    }

    @Override
    public Double Method3(Double value1, Double value2) {
        return value1 * value2;
    }

    @Override
    public Double Method4(Double value1, Double value2) {
        return value1 / value2;
    }
}
