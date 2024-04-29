package com.iuh.courseservice.dto;

import lombok.*;

import java.io.Serializable;

@Data
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseRp implements Serializable {
    public String tenMonHoc;
    public boolean trangthai;
    public boolean batbuoc;
    public int soTinChi;
}
