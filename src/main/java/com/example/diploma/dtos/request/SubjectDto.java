package com.example.diploma.dtos.request;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class SubjectDto {

    @NotBlank(message = "The name of the subject is empty")
    private String name;

    @Max(message = "It should be lower than 10", value = 10)
    @Min(message = "It should be greater than 0", value = 0)
    private int grade;
}
