package org.example.Primary.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Course")
public class CourseEntity {

    @Id
    private Long courseId;

    @Column(nullable = false)
    private String courseName;

    @Column(nullable = false)
    private String authorName;

    @Column(nullable = false)
    private Integer durationInHours;

    @Column(nullable = false)
    private Boolean availability;

    public CourseEntity() {}

    public CourseEntity(Long courseId, String courseName, String authorName, Integer durationInHours, Boolean availability) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.authorName = authorName;
        this.durationInHours = durationInHours;
        this.availability = availability;
    }

    public Long getCourseId() { return courseId; }
    public void setCourseId(Long courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getAuthorName() { return authorName; }
    public void setAuthorName(String authorName) { this.authorName = authorName; }

    public Integer getDurationInHours() { return durationInHours; }
    public void setDurationInHours(Integer durationInHours) { this.durationInHours = durationInHours; }

    public Boolean getAvailability() { return availability; }
    public void setAvailability(Boolean availability) { this.availability = availability; }
}
