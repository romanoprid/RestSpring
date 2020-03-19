package ua.lviv.iot.first.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.first.rest.model.Student;

@RequestMapping("/students")
@RestController
public class StudentsController {
    @GetMapping(path = "/{id}")
    public Student getStudent(@PathVariable ("id") Integer studentId) {
        System.out.println(studentId);
        return new Student("pedro", "aldomovar");
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.PUT }, path = "/smartest")
    public Student getSmartestStudent() {
        return new Student("tapas", "karantino");
    }
}
