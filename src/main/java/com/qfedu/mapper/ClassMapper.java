package com.qfedu.mapper;

import com.qfedu.pojo.Course;
import com.qfedu.pojo.Subject;

import java.util.List;

public interface ClassMapper {

    List<Course> selectAllClass();

    int deleteClass(int id);

    void saveClass(Course course);

    void updateClassById(Course course);

    Course getClassById(int id);

    List<Subject> selectAllSubject();

    List<Course> selectAllCourse(Course course);

    int getCount(Course course);

    Subject selectSubjectById(int subject_id);

    List<Course> selectCourseBySubjectId(int subject_id);

//    Subject selectSubjectId(String subjectName);

    Course selectCourseById(int course_id);
}
