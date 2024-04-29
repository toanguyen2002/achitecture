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
    private static final long serialVersionUID = 297063413780202219L;

    public String tenMonHoc;
    public boolean trangThai;
    public boolean batBuoc;
    public int soTinChi;
}
