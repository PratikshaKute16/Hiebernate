package org.example;

import javax.persistence.Embeddable;

@Embeddable
public class Courses
{
    private String course;
    private int duration;

    public Courses() {
    }

    public Courses(String course, int duration) {
        this.course = course;
        this.duration = duration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


}
