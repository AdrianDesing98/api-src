package models;

import java.time.LocalDate;

public class Enrollment {

    private long id;
    private Students student;
    private Course course;
    private LocalDate enrollmentDate;
    private String status; // e.g. "ACTIVE", "COMPLETED", "CANCELLED"

    public Enrollment() {

    }

    public Enrollment(long id, Students student, Course course, LocalDate enrollmentDate, String status) {
        this.id = id;
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "id=" + id +
                ", student=" + (student != null ? student.getFirstname() + " " + student.getLastname() : "null") +
                ", course=" + (course != null ? course.getName() : "null") +
                ", enrollmentDate=" + enrollmentDate +
                ", status='" + status + '\'' +
                '}';
    }
}