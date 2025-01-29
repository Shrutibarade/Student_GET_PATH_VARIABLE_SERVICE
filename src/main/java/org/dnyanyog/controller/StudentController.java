package org.dnyanyog.controller;

import org.dyanyog.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/first_name/{roll_number}")
    public String getFirstName(@PathVariable int roll_number) {  // Change String → int
        return new StudentService().getFirstName(roll_number);
    }

    @GetMapping("/last_name/{roll_number}")
    public String getLastName(@PathVariable int roll_number) {
        return new StudentService().getLastName(roll_number);
    }

    @GetMapping("/email/{roll_number}")
    public String getEmail(@PathVariable int roll_number) {
        return new StudentService().getEmail(roll_number);
    }

    @GetMapping("/mobile/{roll_number}")
    public String getMobile(@PathVariable int roll_number) {
        return new StudentService().getMobile(roll_number);
    }
}
