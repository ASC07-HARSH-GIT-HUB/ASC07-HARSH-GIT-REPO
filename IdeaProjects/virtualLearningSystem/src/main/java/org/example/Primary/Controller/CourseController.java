package org.example.Primary.Controller;

import org.example.Primary.Entity.CourseEntity;
import org.example.Primary.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apis/courses")
public class CourseController {

    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseEntity> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/search")
    public CourseEntity searchCourse(@RequestParam String name) {
        return courseService.searchCourseByName(name);
    }

    @PostMapping("/cart/add/{courseId}")
    public String addToCart(@PathVariable Long courseId) {
        return courseService.addToCart(courseId);
    }

    @DeleteMapping("/cart/remove/{courseId}")
    public String removeFromCart(@PathVariable Long courseId) {
        return courseService.removeFromCart(courseId);
    }

    @GetMapping("/cart")
    public List<CourseEntity> viewCart() {
        return courseService.viewCart();
    }
}
