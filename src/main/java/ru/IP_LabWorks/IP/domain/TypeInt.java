package ru.IP_LabWorks.IP.domain;


public class TypeInt implements ITypeInterface<Integer> {
    @Override
    public Integer Method1(Integer value1, Integer value2) {
        return value1 + value2;
    }

    @Override
    public Integer Method2(Integer value1, Integer value2) {
        return value1 - value2;
    }

    @Override
    public Integer Method3(Integer value1, Integer value2) {
        return value1 * value2;
    }

    @Override
    public Integer Method4(Integer value1, Integer value2) {
        return value1 / value2;
    }
}
