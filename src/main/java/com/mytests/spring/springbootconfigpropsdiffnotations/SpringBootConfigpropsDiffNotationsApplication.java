package com.mytests.spring.springbootconfigpropsdiffnotations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootConfigpropsDiffNotationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigpropsDiffNotationsApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(PropsUsingUnderscores propsUsingUnderscores, PropsUsingUnderscoresCtor propsUsingUnderscoresCtor, UsePropertiesAsValues usePropertiesAsValues) {
        return args -> {
            System.out.println(propsUsingUnderscores.getProp_with_underscores_1());
            System.out.println(propsUsingUnderscores.getProp_with_underscores_two());
            System.out.println(propsUsingUnderscores.getList_prop_with_underscores_three());
            System.out.println(propsUsingUnderscores.getMap_prop_with_underscores_four());
            System.out.println(propsUsingUnderscores.getInner_pojo().getPojo_prop());
            System.out.println(propsUsingUnderscoresCtor.getProp_with_underscores_1());
            System.out.println(propsUsingUnderscoresCtor.getProp_with_underscores_two());
            System.out.println(propsUsingUnderscoresCtor.getList_prop_with_underscores_three());
            System.out.println(propsUsingUnderscoresCtor.getMap_prop_with_underscores_four());
            usePropertiesAsValues.displayProps();
        };
    }
}
