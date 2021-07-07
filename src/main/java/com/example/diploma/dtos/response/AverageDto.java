package com.example.diploma.dtos.response;

import com.example.diploma.dtos.request.StudentDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AverageDto {
    private String message;
    private Double average;
    private String studentName;
}
