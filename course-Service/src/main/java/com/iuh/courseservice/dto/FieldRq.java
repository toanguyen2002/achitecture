package com.iuh.courseservice.dto;

import lombok.*;

@Data
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FieldRq {
    public int field_id;
    public String field_name;
}
