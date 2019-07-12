package com.qfedu.pojo;

import java.util.List;

public class Course {
    private int id;
    private String course_title;
    private String course_desc;
    private int subject_id;
    private String subjectName;

    private List<Video> videoList;

    private int page = 1;
    private int rows = 5;
    private int begin = 0;

    public Course() {
    }

    public Course(int id, String course_title, String course_desc, int subject_id, String subjectName, int page, int rows, int begin) {
        this.id = id;
        this.course_title = course_title;
        this.course_desc = course_desc;
        this.subject_id = subject_id;
        this.subjectName = subjectName;
        this.page = page;
        this.rows = rows;
        this.begin = begin;
    }

    public List<Video> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<Video> videoList) {
        this.videoList = videoList;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public String getCourse_desc() {
        return course_desc;
    }

    public void setCourse_desc(String course_desc) {
        this.course_desc = course_desc;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course_title='" + course_title + '\'' +
                ", course_desc='" + course_desc + '\'' +
                ", subject_id=" + subject_id +
                ", subjectName='" + subjectName + '\'' +
                ", videoList=" + videoList +
                ", page=" + page +
                ", rows=" + rows +
                ", begin=" + begin +
                '}';
    }
}
