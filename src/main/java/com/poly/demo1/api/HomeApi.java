package com.poly.demo1.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeApi {
    @GetMapping("/getInfomation")
    //http://localhost:5050/getInfomation?ten=Vu&tuoi=21
    public ResponseEntity<?> doGetInfomation(@RequestParam("ten")String name,
                                             @RequestParam("tuoi")String age) {
        //Map: TreesMap, HashMap, SetMap
        Map<String, String> result = new HashMap<String, String>();
        result.put("ten", name);
        result.put("tuoi", age);
        result.put("lop", "Lop Java 5");
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getInfomationWithPathvariable/{name}")
    //http://localhost:5050/getInfomationWithPathvariable/Vu
    public ResponseEntity<?> doGetInfomationWithPathvariable(@PathVariable String name){
        return ResponseEntity.ok(name);
    }

    //TRUYEN DU LIEU: PARAM, PATHVARIABLE, OBJECT; GET, POST
}
