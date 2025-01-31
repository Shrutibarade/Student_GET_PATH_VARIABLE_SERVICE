package org.dnyanyog.controller;

import org.dyanyog.dto.Student;
import org.dyanyog.service.StudentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    private final StudentService studentService = new StudentService(); // Reuse instance

    @GetMapping("/first_name/{roll_number}")
    public String getFirstName(@PathVariable int roll_number) {
        return studentService.getFirstName(roll_number);
    }

    @GetMapping("/last_name")
    public List<String> getLastName() {
        return studentService.getLastName();
    }

    @GetMapping("/email/{roll_number}") // Fixed path and added roll_number parameter
    public String getEmail(@PathVariable int roll_number) {
        return studentService.getEmail(roll_number);
    }

    @GetMapping(value = "/student", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public Student getStudent() {
        Student std = new Student();
        std.setFirstName("Vaibhav");
        std.setLastName("Jodge");
        std.setEmail("aj287");
        std.setMobile("12121212");
        std.setAge(81);
        return std;
    }

    @GetMapping("/mobile/{roll_number}")
    public String getMobile(@PathVariable int roll_number) {
        return studentService.getMobile(roll_number);
    }
}
