package ru.IP_LabWorks.IP.domain;

public class TypeString implements ITypeInterface<String> {

    @Override
    public String Method1(String value1, String value2) {
        return value1 + value2;
    }

    @Override
    public String Method2(String value1, String value2) {
        return value1.toUpperCase() + value2.toUpperCase();
    }

    @Override
    public String Method3(String value1, String value2) {
        return value1.toLowerCase() + value2.toLowerCase();
    }

    @Override
    public String Method4(String value1, String value2) {
        return value1.toLowerCase() + value2.toUpperCase();
    }
}
