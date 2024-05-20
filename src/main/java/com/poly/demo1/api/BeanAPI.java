package com.poly.demo1.api;

import com.poly.demo1.bean.SchoolInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java5-b4/bean")
public class BeanAPI {
    @Autowired
    @Qualifier("SchoolInformationConfig")
    SchoolInformation schoolInformation;
    @GetMapping("/getSchoolInformation")
    public ResponseEntity<?> getSchoolInformation() {
//        SchoolInformation schoolInformation = new SchoolInformation();
//        schoolInformation.setFullName("Dang Quoc Vu");
//        schoolInformation.setLocation("TP.HCM");

        return ResponseEntity.ok(schoolInformation);
    }
}
