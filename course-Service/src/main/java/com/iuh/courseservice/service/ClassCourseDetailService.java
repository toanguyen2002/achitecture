package com.iuh.courseservice.service;


import com.iuh.courseservice.dto.ClassCourseDetailRp;
import com.iuh.courseservice.dto.ClassCourseDetailRq;
import com.iuh.courseservice.dto.ClassCourseRp;
import com.iuh.courseservice.model.ClassCourse;
import com.iuh.courseservice.model.ClassCourseDetail;
import com.iuh.courseservice.model.Lecturer;
import com.iuh.courseservice.repository.ClassCourseDetailRepo;
import com.netflix.discovery.converters.Auto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClassCourseDetailService {
    @Autowired
    public ClassCourseDetailRepo courseDetailRepo;
    public ClassCourseDetailRp mapClassCourseDetailToClassCourseDetailRp(ClassCourseDetail courseDetail){
        return ClassCourseDetailRp.builder()
                .idClassCourseDetail(courseDetail.getIdClassCourseDetail())
                .timeEnd(courseDetail.getTimeEnd())
                .timehoc(courseDetail.getTimehoc())
                .siso(courseDetail.getSiso())
                .soluongdadangky(courseDetail.getSoluongdadangky())
                .build();
    }
    public List<ClassCourseDetailRp> getAllClassCourseDetail(){
        return courseDetailRepo.findAll().stream().map(this::mapClassCourseDetailToClassCourseDetailRp).toList();
    }

    public ClassCourseDetailRq addNewClassCourseDetail(ClassCourseDetailRq ClassCourseDetailRq){
        ClassCourseDetail rs = ClassCourseDetail.builder()
                .ngayhoc(ClassCourseDetailRq.getNgayhoc())
                .timehoc(ClassCourseDetailRq.getTimehoc())
                .timeEnd(ClassCourseDetailRq.getTimeEnd())
                .siso(ClassCourseDetailRq.getSiso())
                .soluongdadangky(ClassCourseDetailRq.getSoluongdadangky())
                .lecturer(new Lecturer(ClassCourseDetailRq.getLecturer(), "", "", null))
                .build();
        courseDetailRepo.save(rs);
        return ClassCourseDetailRq;
    }

    public ClassCourseDetailRp findClassById(int id){
        Optional<ClassCourseDetail> optionalcourseDetail = courseDetailRepo.findById(id);
        if (optionalcourseDetail.isPresent()){
            ClassCourseDetail classCourseDetail = optionalcourseDetail.get();
            ClassCourseDetailRp rs = ClassCourseDetailRp.builder()
                    .idClassCourseDetail(classCourseDetail.getIdClassCourseDetail())
                    .idClassCourseDetail(classCourseDetail.getIdClassCourseDetail())
                    .timeEnd(classCourseDetail.getTimeEnd())
                    .timehoc(classCourseDetail.getTimehoc())
                    .siso(classCourseDetail.getSiso())
                    .soluongdadangky(classCourseDetail.getSoluongdadangky())
                    .build();
            return  rs;
        }
        return  null;
    }
}
