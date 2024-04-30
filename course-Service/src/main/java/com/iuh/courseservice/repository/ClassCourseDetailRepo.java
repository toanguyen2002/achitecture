package com.iuh.courseservice.repository;

import com.iuh.courseservice.model.ClassCourse;
import com.iuh.courseservice.model.ClassCourseDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassCourseDetailRepo extends JpaRepository<ClassCourseDetail,Integer> {
    public List<ClassCourseDetail> findAllByClassCourse(ClassCourse classCourse);
}
