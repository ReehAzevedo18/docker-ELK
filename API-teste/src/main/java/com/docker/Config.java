package com.docker;

import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.docker")
public class Config{

    @Bean
    public Sampler alwaysSampler(){

        return Sampler.ALWAYS_SAMPLE;
    }

}
