package org.zerock.guestbook.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolConfig {

    @Bean
    public School school() {
        return new School(); // new School 객체가 bean 으로 등록
    }
    @Bean(name = "sch2")
    public School school2() {
        return new School(); // new School 객체가 bean 으로 등록
    }

}