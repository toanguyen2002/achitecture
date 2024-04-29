package com.iuh.courseservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
@Builder
@Table(name = "class_course")
public class ClassCourse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClass;
    private String nameClass;
    @OneToMany(mappedBy = "classcourse",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<ClassCourseDetail> classCourseDetails;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course courseId;

}
