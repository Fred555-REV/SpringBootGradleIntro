package com.careerdevs.intro.employees;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    private @Id
    @GeneratedValue
    Long id;
    private String name;
    private String role;
    private @NotNull Integer age;

    public Employee() {
    }

    public Employee(String name, String role, Integer age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }

    public Employee(Long id, String name, String role, Integer age) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
