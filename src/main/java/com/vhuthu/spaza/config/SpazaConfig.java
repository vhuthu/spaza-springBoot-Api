package com.vhuthu.spaza.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpazaConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
