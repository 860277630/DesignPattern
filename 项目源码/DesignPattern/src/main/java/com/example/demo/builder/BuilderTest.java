package com.example.demo.builder;

public class BuilderTest {
    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder()
                .setName("peter")
                .setAge("8")
                .setSex("男")
                .setClassName("二年级")
                .setGrade("三班");
        System.out.println(builder.build().toString());
    }
}
