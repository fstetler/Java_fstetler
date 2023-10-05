package com.pluralsight.courseinfo.repository;

import com.pluralsight.courseinfo.domain.Course;

import java.util.List;

public interface repository {

    void saveCourse(Course course);

    List<Course> getAllCourses();

}
