package com.iuh.courseservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
@Builder
@Table(name = "class_course_detail")
public class ClassCourseDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCourseDetail")
    private int idClassCourseDetail;
    private String ngayhoc;
    private LocalDateTime timehoc;
    private LocalDateTime timeEnd;
    private int siso;
    private int soluongdadangky;
    @ManyToOne
    @JoinColumn(name = "lecturer_id")
    private Lecturer lecturer;

    @ManyToOne
    @JoinColumn(name = "course_detail_id")
    private ClassCourse classcourse;


}
