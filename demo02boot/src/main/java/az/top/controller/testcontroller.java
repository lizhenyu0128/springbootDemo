package az.top.controller;

import az.top.testmapper.testmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Author:
 * Data:2019-04-20 20:21
 * Description:<>
 */

@RestController
public class testcontroller {


    @Autowired
    testmapper testmapper;

    @GetMapping("/sss")
    public Map<String, Integer> sss(){

        System.out.println(testmapper.getall().toString());
        testmapper.insert();
        return testmapper.getall();
    }
}
