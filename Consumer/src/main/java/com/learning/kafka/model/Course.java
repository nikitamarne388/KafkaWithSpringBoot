package com.learning.kafka.model;

public class Course {
    private String courseId;
    private String courseName;
    private String trainer;
    private double price;

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTrainer() {
        return trainer;
    }

    public double getPrice() {
        return price;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", trainer='" + trainer + '\'' +
                ", price=" + price +
                '}';
    }
}
