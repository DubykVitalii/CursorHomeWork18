package com.example.cursorhomework18.autoconfiguration;

import com.example.cursorhomework18.configuration.ConfigurationEnabler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ConfigurationEnabler.class)
@ConditionalOnProperty(prefix = "custom.configuration", name = "enabled", havingValue = "true")
public class MyAutoconfiguration {
    @Bean
    public String stringBean() {
        System.out.println("stringBean was created by autoConfiguration");
        return "";
    }
}
