package com.qfedu.service.impl;

import com.qfedu.mapper.ClassMapper;
import com.qfedu.pojo.Course;
import com.qfedu.pojo.Subject;
import com.qfedu.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassMapper classmapper;

    @Override
    public List<Course> selectAllClass() {

        List<Course> courses = classmapper.selectAllClass();
        return courses;
    }

    @Autowired
    ClassMapper deleteClassMapper;

    @Override
    public void deleteClass(int id) {

        int i = deleteClassMapper.deleteClass(id);
    }

    @Autowired
    ClassMapper mapper;

    @Override
    public int saveOrUpdate(Course course) {
        int id = 0;

        if (course.getId() != 0) {
            mapper.updateClassById(course);
            id = course.getId();
        } else {
            mapper.saveClass(course);
            id = course.getId();
        }

        return id;
    }

    @Override
    public Course getClassById(int id) {
        Course result = mapper.getClassById(id);
        return result;
    }


    @Autowired
    ClassMapper subjectMapper;
    @Override
    public List<Subject> selectAllSubject(Subject subject) {

        List<Subject> subjects = subjectMapper.selectAllSubject();
        return subjects;
    }


    @Autowired
    ClassMapper courseMapper;
    @Override
    public List<Course> selectAllCourse(Course course) {

        List<Course> courses1 = courseMapper.selectAllCourse(course);
        return courses1;
    }

    @Autowired
    ClassMapper pageMapper;
    @Override
    public int getCount(Course course) {
        int result = pageMapper.getCount(course);
        return result;
    }

    @Override
    public Subject selectSubjectById(int subject_id) {
        return classmapper.selectSubjectById(subject_id);
    }

    @Override
    public List<Course> selectCourseBySubjectId(int subject_id) {

        return classmapper.selectCourseBySubjectId(subject_id);
    }

//    @Override
//    public Subject selectSubjectId(String subjectName) {
//        return classmapper.selectSubjectId(subjectName);
//    }

    @Override
    public Course selectCourseById(int course_id) {
        return classmapper.selectCourseById(course_id);
    }
}
