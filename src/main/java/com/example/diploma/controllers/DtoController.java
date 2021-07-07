package com.example.diploma.controllers;

import com.example.diploma.dtos.request.StudentDto;
import com.example.diploma.dtos.response.AverageDto;
import com.example.diploma.utils.AverageCalculator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/student")
public class DtoController {

    @PostMapping("/average")
    public ResponseEntity<AverageDto> calculateAverage(@Valid @RequestBody StudentDto student){
        AverageDto averageDto = new AverageDto(
                AverageCalculator.sendMessage(student),
                AverageCalculator.calculateAverage(student),
                student.getName()
        );

        return new ResponseEntity<>(averageDto, HttpStatus.OK);
    }

}
