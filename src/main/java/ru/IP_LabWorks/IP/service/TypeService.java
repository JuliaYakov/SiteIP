package ru.IP_LabWorks.IP.service;

import ru.IP_LabWorks.IP.domain.ITypeInterface;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;

@Service
public class TypeService {

    private final ApplicationContext applicationContext;
    private ITypeInterface _type;
    private Object _value1;
    private Object _value2;

    public TypeService(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    private void ValidateParams(Object value1, Object value2, String type){
        _type = (ITypeInterface)applicationContext.getBean(type);

        switch (type) {
            case "int" -> {
                try {
                    _value1 = Integer.valueOf(value1.toString());
                    _value2 = Integer.valueOf(value2.toString());
                }catch (Exception ex){
                    _value1 = 0;
                    _value2 = 0;
                }
            }
            case "double" -> {
                try {
                    _value1 = Double.valueOf(value1.toString());
                    _value2 = Double.valueOf(value2.toString());
                }catch (Exception ex){
                    _value1 = 0.0;
                    _value2 = 0.0;
                }
            }
            case "str" -> {
                _value1 = value1;
                _value2 = value2;
            }
        }

    }

    public Object Method1(Object value1, Object value2, String type){
        ValidateParams(value1,value2,type);
        return  String.format("%s", _type.Method1(_value1,_value2));
    }

    public Object Method2(Object value1, Object value2, String type){
        ValidateParams(value1,value2,type);
        return  String.format("%s", _type.Method2(_value1,_value2));
    }

    public Object Method3(Object value1, Object value2, String type){
        ValidateParams(value1,value2,type);
        return  String.format("%s", _type.Method3(_value1,_value2));
    }

    public Object Method4(Object value1, Object value2, String type){
        ValidateParams(value1,value2,type);
        return  String.format("%s", _type.Method4(_value1,_value2));
    }
}
