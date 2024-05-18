package com.poly.demo1.api;

import com.poly.demo1.entity.SinhVienDTO;
import com.poly.demo1.entity.Student;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PostManApi {
    @GetMapping("/getStudentInformation")
    //http://localhost:5050/getStudentInformation?name=Vu&age=20&classes=Java5&hometown=HCM&address=Q12
    public ResponseEntity<?> doGetStudentInformation(Student student) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Call api success");
        result.put("status", true);
        result.put("data", student);

        return ResponseEntity.ok(result);
    }

    @PostMapping("/postStudentInformation")
    public ResponseEntity<?> doPostStudentInformation(@Valid @RequestBody SinhVienDTO student) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Call api success");
        result.put("status", true);
        result.put("data", student);

        return ResponseEntity.ok(result);

    }
}
