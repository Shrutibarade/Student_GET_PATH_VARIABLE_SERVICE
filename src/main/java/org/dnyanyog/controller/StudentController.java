package org.dnyanyog.controller;

import java.util.List;
import org.dyanyog.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/email/{roll_number}")
    public String getEmail(@PathVariable int roll_number) {
        return studentService.getEmail(roll_number);
    }

    @GetMapping("/mobile/{roll_number}")
    public String getMobile(@PathVariable int roll_number) {
        return studentService.getMobile(roll_number);
    }
}
