package com.careerdevs.intro.employees;

import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(path = "employees")
public class EmployeeController {

//    private final EmployeeRepository repository;
//
//    public EmployeeController(EmployeeRepository repository) {
//        this.repository = repository;
//    }

    private Map<Long, Employee> employees = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong();

    {
        Long id = idCounter.incrementAndGet();
        employees.put(id, new Employee(id, "Fred", "Student", 18));
    }

    @GetMapping
    public List<Employee> all() {
//        return repository.findAll();
        return new ArrayList<Employee>(employees.values());
    }

    @PostMapping
    public Employee newEmployee(@RequestBody Employee newEmployee) {
        Long id = idCounter.incrementAndGet();
        newEmployee.setId(id);
        employees.put(id, newEmployee);
        return newEmployee;

    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable() Long id) {
        return employees.get(id);
    }

}
