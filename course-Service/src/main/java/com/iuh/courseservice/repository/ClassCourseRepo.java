package com.iuh.courseservice.repository;

import com.iuh.courseservice.model.ClassCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassCourseRepo extends JpaRepository<ClassCourse,Integer> {
}
