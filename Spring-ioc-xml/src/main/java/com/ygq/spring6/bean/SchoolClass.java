package com.ygq.spring6.bean;

import java.util.List;

public class SchoolClass {
    private Integer schoolClassId;
    private String schoolClassName;
    private List<Student> studentList;

    public SchoolClass() {
    }

    public SchoolClass(Integer schoolClassId, String schoolClassName) {
        this.schoolClassId = schoolClassId;
        this.schoolClassName = schoolClassName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Integer getSchoolClassId() {
        return schoolClassId;
    }

    public void setSchoolClassId(Integer schoolClassId) {
        this.schoolClassId = schoolClassId;
    }

    public String getSchoolClassName() {
        return schoolClassName;
    }

    public void setSchoolClassName(String schoolClassName) {
        this.schoolClassName = schoolClassName;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "schoolClassId=" + schoolClassId +
                ", schoolClassName='" + schoolClassName + '\'' +
                '}';
    }
}
