package com.iuh.courseservice.dto;

import lombok.*;

@Data
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClassCourseRp {
    private int idClass;
    private String nameClass;
    private int courseId;



}
