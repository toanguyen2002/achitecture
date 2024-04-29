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
    @OneToMany(mappedBy = "courseid")
    public Set<ClassCourse> classCourses;

//    @ElementCollection
//    @CollectionTable(name = "wait_course_student",
//            joinColumns = @JoinColumn(name = "course_id"))
//    @Column(name = "wait_student_username",columnDefinition = "NVARCHAR(256)")
//    private Set<String> wait_course_student;

}
