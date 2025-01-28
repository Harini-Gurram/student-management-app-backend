package com.sms.sms_be.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name="name",nullable=false)
    public String name;

    @Getter
    @Column(name="age",nullable=false)
    public int age;

    @Getter
    @Column(name="class_grade",nullable=false)
    public String classGrade;

    @Getter
    @Column(name="phone_number",nullable=false)
    public String phoneNumber;

    public String getName() {
       return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }




    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}
