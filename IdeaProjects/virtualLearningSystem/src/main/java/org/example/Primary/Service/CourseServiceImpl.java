package org.example.Primary.Service;

import org.example.Primary.Entity.CourseEntity;
import org.example.Primary.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepo courseRepo;
    private List<CourseEntity> cart = new ArrayList<>();

    @Autowired
    public CourseServiceImpl(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public List<CourseEntity> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public CourseEntity searchCourseByName(String courseName) {
        return courseRepo.findByCourseName(courseName);
    }

    @Override
    public String addToCart(Long courseId) {
        CourseEntity course = courseRepo.findById(courseId).orElse(null);
        if (course != null && course.getAvailability()) {
            if (!cart.contains(course)) {
                cart.add(course);
                return "Course added to cart!";
            }
            return "Course is already in the cart!";
        }
        return "Course not found or unavailable.";
    }

    @Override
    public String removeFromCart(Long courseId) {
        CourseEntity course = cart.stream()
                .filter(c -> c.getCourseId().equals(courseId))
                .findFirst()
                .orElse(null);
        if (course != null) {
            cart.remove(course);
            return "Course removed from cart!";
        }
        return "Course not found in cart.";
    }

    @Override
    public List<CourseEntity> viewCart() {
        return new ArrayList<>(cart);
    }
}
