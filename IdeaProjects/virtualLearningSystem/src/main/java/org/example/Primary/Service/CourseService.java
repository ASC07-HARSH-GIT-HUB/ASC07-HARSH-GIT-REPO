package org.example.Primary.Service;

import org.example.Primary.Entity.CourseEntity;

import java.util.List;

public interface CourseService {
    List<CourseEntity> getAllCourses();
    CourseEntity searchCourseByName(String courseName);
    String addToCart(Long courseId);
    String removeFromCart(Long courseId);
    List<CourseEntity> viewCart();
}
