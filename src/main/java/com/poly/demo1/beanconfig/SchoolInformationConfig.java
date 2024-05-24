package com.poly.demo1.beanconfig;

import com.poly.demo1.bean.SchoolInformation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Đánh dấu class là một class cấu hình của Spring
public class SchoolInformationConfig {
    @Bean("SchoolInformationConfig") //Đánh dấu đây là một bean

    public SchoolInformation schoolInformationConfig(){
        SchoolInformation schoolInformation = new SchoolInformation();
        schoolInformation.setFullName("FPT Polytechnic");
        schoolInformation.setLocation("Thanh Pho Ho Chi Minh");

        return schoolInformation;
    }
}
