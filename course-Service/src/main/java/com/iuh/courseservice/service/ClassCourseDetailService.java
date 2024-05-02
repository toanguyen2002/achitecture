package com.iuh.courseservice.service;


import com.iuh.courseservice.dto.ClassCourseDetailRp;
import com.iuh.courseservice.dto.ClassCourseDetailRq;
import com.iuh.courseservice.dto.ClassCourseRp;
import com.iuh.courseservice.model.ClassCourse;
import com.iuh.courseservice.model.ClassCourseDetail;
import com.iuh.courseservice.model.Lecturer;
import com.iuh.courseservice.repository.ClassCourseDetailRepo;
import com.iuh.courseservice.repository.ClassCourseRepo;
import com.netflix.discovery.converters.Auto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClassCourseDetailService {
    @Autowired
    public ClassCourseDetailRepo courseDetailRepo;
    @Autowired
    public EntityManager entityManager;
    public ClassCourseDetailRp mapClassCourseDetailToClassCourseDetailRp(ClassCourseDetail courseDetail){
        return ClassCourseDetailRp.builder()
                .idClassCourseDetail(courseDetail.getIdClassCourseDetail())
                .timeEnd(courseDetail.getTimeEnd())
                .timeHoc(courseDetail.getTimeHoc())
                .siSo(courseDetail.getSiSo())
                .ngayHoc(courseDetail.getNgayHoc())
                .soLuongDaDangKy(courseDetail.getSoLuongDaDangKy())
                .lecturer(courseDetail.getLecturer().getGiangVienid())
                .build();
    }
    public List<ClassCourseDetailRp> getAllClassCourseDetail(){
        return courseDetailRepo.findAll().stream().map(this::mapClassCourseDetailToClassCourseDetailRp).toList();
    }
    public List<ClassCourseDetailRp> getAllClassCourseDetailByClassCourse(ClassCourse classCourse){
        return courseDetailRepo.findAllByClassCourse(classCourse).stream().map(this::mapClassCourseDetailToClassCourseDetailRp).toList();
    }

//    public ClassCourseDetailRq addNewClassCourseDetail(ClassCourseDetailRq ClassCourseDetailRq){
//        ClassCourseDetail rs = ClassCourseDetail.builder()
//                .ngayHoc(ClassCourseDetailRq.getNgayHoc())
//                .timeHoc(ClassCourseDetailRq.getTimeHoc())
//                .timeEnd(ClassCourseDetailRq.getTimeEnd())
//                .siSo(ClassCourseDetailRq.getSiSo())
//                .soLuongDaDangKy(ClassCourseDetailRq.getSoLuongDaDangKy())
//                .lecturer(new Lecturer(ClassCourseDetailRq.getLecturer(), "", "", null))
//                .build();
//        courseDetailRepo.save(rs);
//        return ClassCourseDetailRq;
//    }

    public ClassCourseDetailRp findClassById(int id){
        Optional<ClassCourseDetail> optionalcourseDetail = courseDetailRepo.findById(id);
        if (optionalcourseDetail.isPresent()){
            ClassCourseDetail classCourseDetail = optionalcourseDetail.get();
            ClassCourseDetailRp rs = ClassCourseDetailRp.builder()
                    .idClassCourseDetail(classCourseDetail.getIdClassCourseDetail())
                    .timeEnd(classCourseDetail.getTimeEnd())
                    .timeHoc(classCourseDetail.getTimeHoc())
                    .siSo(classCourseDetail.getSiSo())
                    .soLuongDaDangKy(classCourseDetail.getSoLuongDaDangKy())
                    .lecturer(classCourseDetail.getLecturer().getGiangVienid())
                    .build();
            return  rs;
        }
        return  null;
    }

//    findClassCourseDetailByTimeHo
//   c
    @Transactional
    public List<Integer> getClassCourseDetailByTimeHoc(String localTime){
        List<Integer> listrs = new ArrayList<>();
        NativeQuery<Object[]> rs = (NativeQuery<Object[]>) entityManager.createNativeQuery("SELECT * from class_course_detail where time_hoc = '"+localTime+"'");
        for (Object[] o : rs.getResultList()){
            System.out.println(o[0]);
            listrs.add((Integer) o[0]);
        }
        return  listrs;
    }

//    findClassCourseDetailByTimeEnd
@Transactional
    public List<Integer> getClassCourseDetailByNgayHoc(String ngayHoc){
        List<Integer> listrs = new ArrayList<>();
        NativeQuery<Object[]> rs = (NativeQuery<Object[]>) entityManager.createNativeQuery("SELECT * from class_course_detail where  ngay_hoc = '"+ngayHoc+"'");
        for (Object[] o : rs.getResultList()){
            System.out.println(o[0]);
            listrs.add((Integer) o[0]);
        }
        return listrs;
    }
}
