package com.qfedu.controller;

import com.qfedu.pojo.Course;
import com.qfedu.pojo.Subject;
import com.qfedu.pojo.Video;
import com.qfedu.service.ClassService;
import com.qfedu.service.VideoService;
import com.qfedu.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClassController {

    @Autowired
    ClassService classService;

    @Autowired
    VideoService videoService;

    /**
     * 展示课程管理界面
     *
     * @param model
     * @return
     */
    @RequestMapping("/classManager")
    public String classManager(Model model, Course course) {

        List<Course> courses = classService.selectAllClass();
//        model.addAttribute("courseList", courses);

        course.setBegin((course.getPage() - 1) * course.getRows() );
        List<Course> courses1 = classService.selectAllCourse(course);
        Page<Course> page = new Page<Course>();
        page.setPage(course.getPage());
        page.setSize(course.getRows());
        page.setTotal(classService.getCount(course));
        page.setRows(courses1);

        model.addAttribute("page", page);
        System.out.println("我进入到了课程管理界面了");
        return "classManager";
    }

    /**
     * 删除课程信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/deleteClass")
    public String deleteClass(int id) {
        System.out.println(id);

        classService.deleteClass(id);

        return "redirect:classManager";
    }

    /**
     * 添加课程信息
     *
     * @return
     */
    @RequestMapping("/addClass")
    public String addClass(Model model, Subject subject) {
        List<Subject> subjects = classService.selectAllSubject(subject);
        model.addAttribute("subjectList", subjects);
        System.out.println(subjects);
        System.out.println("我进到addClass里面了");

        return "addClass";
    }

    @RequestMapping("/saveOrUpdateClass")
    public String saveOrUpdateTeacher(Course course){
        classService.saveOrUpdate(course);
        return "redirect:classManager";
    }

    @RequestMapping("/editClass")
    public String editClass(int id, Model model, Subject subject) {
        Course course = classService.getClassById(id);
        System.out.println(course);
        model.addAttribute("courseList", course);

        List<Subject> subjects = classService.selectAllSubject(subject);
        model.addAttribute("subjectList", subjects);

        return "addClass";
    }

    @RequestMapping("/course.action")
    public String showList(int subject_id, Model model) {
        Subject subject = classService.selectSubjectById(subject_id);

        List<Course> courseList = classService.selectCourseBySubjectId(subject_id);
        subject.setCourseList(courseList);
        for (Course course: courseList) {
            List<Video> videoList = videoService.selectVideoListByCourseId(course.getId());
            course.setVideoList(videoList);
            System.out.println(videoList);
        }

        model.addAttribute("subject", subject);
        return  "before/course";
    }

}
