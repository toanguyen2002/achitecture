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
public class LecturerRp implements Serializable {
    public String tenGiangVien;
    public String chuyenNghanh;
}
