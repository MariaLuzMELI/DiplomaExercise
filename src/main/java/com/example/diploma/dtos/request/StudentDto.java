package com.example.diploma.dtos.request;

import lombok.Data;


import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Data
public class StudentDto {

    @NotBlank(message = "The name of the student is empty")
    private String name;

    @NotEmpty(message = "The collection is empty")
    @Valid
    private List<SubjectDto> subjects=new ArrayList<>();
}
