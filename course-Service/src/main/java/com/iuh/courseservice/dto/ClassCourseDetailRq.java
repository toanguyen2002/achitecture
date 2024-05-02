package com.iuh.courseservice.dto;

import com.iuh.courseservice.model.Course;
import com.iuh.courseservice.model.Lecturer;
import lombok.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClassCourseDetailRq {
    private String ngayHoc;
    private String timeHoc;
    private String timeEnd;
    private int siSo;
    private int soLuongDaDangKy;
    private int lecturer;

}
