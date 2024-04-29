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
    public int fieldId;
    public String fieldName;
}
