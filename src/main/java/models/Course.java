package models;

public class Course {

    private long id;
    private String name;
    private String code;
    private String description;
    private int duration; // in hours or weeks, as you prefer
    private int capacity;

    public Course() {

    }

    public Course(long id, String name, String code, String description, int duration, int capacity) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.duration = duration;
        this.capacity = capacity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", capacity=" + capacity +
                '}';
    }
}