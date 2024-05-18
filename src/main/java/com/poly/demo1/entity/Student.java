package com.poly.demo1.entity;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @NotNull(message = "Không được để trống Name")
    private String name;
    private int age;
    private String classes;
    private String hometown;
    private String address;
}
