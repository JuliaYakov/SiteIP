package ru.IP_LabWorks.IP.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.IP_LabWorks.IP.domain.TypeDouble;
import ru.IP_LabWorks.IP.domain.TypeInt;
import ru.IP_LabWorks.IP.domain.TypeString;

@Configuration
public class TypeConfiguration {
    @Bean(value = "int")
    public TypeInt createIntType(){
        return new TypeInt();
    }

    @Bean(value = "str")
    public TypeString createStrType(){
        return new TypeString();
    }

    @Bean(value = "double")
    public TypeDouble createDoubleType(){
        return new TypeDouble();
    }
}