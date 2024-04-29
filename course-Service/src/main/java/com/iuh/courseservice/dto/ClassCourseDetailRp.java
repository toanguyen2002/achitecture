package com.iuh.courseservice.dto;

import com.iuh.courseservice.model.Course;
import com.iuh.courseservice.model.Lecturer;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClassCourseDetailRp implements Serializable {
    private int idClassCourseDetail;
    private String ngayhoc;
    private LocalDateTime timehoc;
    private LocalDateTime timeEnd;
    private int siso;
    private int soluongdadangky;
    private int lecturer;

}
