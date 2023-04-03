package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList(
                "Java",
                "FrontEnd",
                "BackEnd",
                "FullStack"
        );
        for (String course : courseList) {
            String newCourseName = course.toLowerCase().replace("!", "!!");
            System.out.println("Platzi: " + newCourseName);
        }

        Stream<String> courseStream = Stream.of(
                "Java",
                "FrontEnd",
                "BackEnd",
                "FullStack"
        );

        //Stream<Integer> courseLengthStream = courseStream.map(course -> course.length());

        //Optional<Integer> longest = courseLengthStream.max((x , y) -> y - x);

        Stream<String> emphasisCourses = courseStream.map(course -> course + "!");
        Stream<String> justJavaCourses = emphasisCourses.filter(course -> course.contains("Java"));
        justJavaCourses.forEach(System.out::println);
    }
}
