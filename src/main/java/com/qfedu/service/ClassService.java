package com.qfedu.service;

import com.qfedu.pojo.Course;
import com.qfedu.pojo.Subject;

import java.util.List;

public interface ClassService {
    List<Course> selectAllClass();

    void deleteClass(int id);

    int saveOrUpdate(Course course);

    Course getClassById(int id);

    List<Subject> selectAllSubject(Subject subject);

    List<Course> selectAllCourse(Course course);

    int getCount(Course course);

    Subject selectSubjectById(int subject_id);

    List<Course> selectCourseBySubjectId(int subject_id);

//    Subject selectSubjectId(String subjectName);

    Course selectCourseById(int course_id);
}
