package com.example.diploma.utils;

import com.example.diploma.dtos.request.StudentDto;
import com.example.diploma.dtos.request.SubjectDto;
import com.example.diploma.dtos.response.AverageDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class AverageCalculator {

    public static Double calculateAverage(StudentDto student) {
        Double sum= student.getSubjects().stream().mapToDouble(SubjectDto::getGrade).sum();
        return sum/student.getSubjects().size();
    }

    public static String sendMessage(StudentDto student) {
        Double average=calculateAverage(student);
        String message;
        if(average>=9){
            message="Usted ha pasado con honores, su promedio es: " + average;

        }else{
            message="Su promedio es: " + average;
        }
        return message;
        }
    }

