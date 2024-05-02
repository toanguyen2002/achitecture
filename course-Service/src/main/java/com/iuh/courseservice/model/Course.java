package com.iuh.courseservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="course")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course implements Serializable {
    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public  long maMonHoc;
    public String tenMonHoc;
    public boolean trangThai;
    public boolean batBuoc;
    public int soTinChi;
    @OneToMany(mappedBy = "courseId",cascade = CascadeType.ALL)
    public Set<ClassCourse> classCourses;
}
