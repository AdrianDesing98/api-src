package Data;

import models.Students;
import models.Course;
import models.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private final List<Students> listStudents;
    private final List<Course> listCourse;
    private final List<Enrollment> listEnrollment;

    public DataStore() {
        this.listStudents = new ArrayList<>();
        this.listCourse = new ArrayList<>();
        this.listEnrollment = new ArrayList<>();
    }

    // ---------- STUDENTS ----------

    public void addStudent(Students student) {
        listStudents.add(student);
    }

    public boolean validateStudent(long id) {
        return findStudentById(id) != null;
    }

    public Students findStudentById(long id) {
        for (Students student : listStudents) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public boolean removeStudent(long id) {
        Students student = findStudentById(id);
        if (student != null) {
            listStudents.remove(student);
            return true;
        }
        return false;
    }

    public List<Students> getStudents() {
        return listStudents;
    }

    // ---------- COURSES ----------

    public void addCourse(Course course) {
        listCourse.add(course);
    }

    public boolean validateCourse(long id) {
        return findCourseById(id) != null;
    }

    public Course findCourseById(long id) {
        for (Course course : listCourse)
            if (course.getId() == id) {
                return course;
            }
        return null;
    }

    public boolean removeCourse(long id) {
        Course course = findCourseById(id);
        if (course != null) {
            listCourse.remove(course);
            return true;
        }
        return false;
    }

    public List<Course> getCourses() {
        return listCourse;
    }

    // ---------- ENROLLMENTS ----------

    public void addEnrollment(Enrollment enrollment) {
        listEnrollment.add(enrollment);
    }

    public boolean validateEnrollment(long id) {
        return findEnrollmentById(id) != null;
    }

    public Enrollment findEnrollmentById(long id) {
        for (Enrollment enrollment : listEnrollment) {
            if (enrollment.getId() == id) {
                return enrollment;
            }
        }
        return null;
    }

    public boolean removeEnrollment(long id) {
        Enrollment enrollment = findEnrollmentById(id);
        if (enrollment != null) {
            listEnrollment.remove(enrollment);
            return true;
        }
        return false;
    }

    public List<Enrollment> getEnrollments() {
        return listEnrollment;
    }
}