package com.example.demo.builder;

public class StudentBuilder {

    private Student student = new Student();

    public StudentBuilder setName(String name) {
        student.setName(name);
        return this;
    }

    public StudentBuilder setAge(String age) {
        student.setAge(age);
        return this;
    }
    public StudentBuilder setSex(String sex) {
        student.setSex(sex);
        return this;
    }
    public StudentBuilder setClassName(String className) {
        student.setClassName(className);
        return this;
    }
    public StudentBuilder setGrade(String grade) {
        student.setGrade(grade);
        return this;
    }
    public Student build(){
        return this.student;
    }

}
