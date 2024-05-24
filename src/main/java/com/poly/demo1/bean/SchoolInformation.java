package com.poly.demo1.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component //Đánh dấu 1 class là 1 bean.
public class SchoolInformation {
    private String fullName = "FPT Polytechnic - Beans";
    private String location = "TP HCM";
}
