package org.example.Primary.Repository;

import org.example.Primary.Entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<CourseEntity, Long> {
    CourseEntity findByCourseName(String courseName);
}
