package com.iuh.courseservice.controller;

import com.iuh.courseservice.dto.ClassCourseDetailRp;
import com.iuh.courseservice.dto.ClassCourseDetailRq;
import com.iuh.courseservice.dto.ClassCourseRq;
import com.iuh.courseservice.model.ClassCourseDetail;
import com.iuh.courseservice.service.ClassCourseDetailService;
import com.iuh.courseservice.service.ClassCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classCourseDetail")
public class ClassCourseDetailController {
    @Autowired
    public ClassCourseDetailService classCourseDetailService;

    @GetMapping("/findall")
    public ResponseEntity<List<ClassCourseDetailRp>> getAllClassCourseDetailRp(){
        return new ResponseEntity<>(classCourseDetailService.getAllClassCourseDetail(),HttpStatus.OK);
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<ClassCourseDetailRp> getClassCourseDetailRpById(@PathVariable int id){
        return new ResponseEntity<>(classCourseDetailService.findClassById(id),HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<ClassCourseDetailRq> addclassCourseDetail(@RequestBody ClassCourseDetailRq classCourseDetailRq){
        return new ResponseEntity<>(classCourseDetailService.addNewClassCourseDetail(classCourseDetailRq),HttpStatus.OK);
    }

}
