package com.qfedu.controller;


import com.qfedu.pojo.Course;
import com.qfedu.pojo.Speaker;
import com.qfedu.pojo.Video;
import com.qfedu.service.ClassService;
import com.qfedu.service.TeacherService;
import com.qfedu.service.VideoService;
import com.qfedu.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class VideosController {

    @Autowired
    VideoService videoService;
    @Autowired
    TeacherService teacherService;
    @Autowired
    ClassService classService;

    /**
     * 展示视频管理界面
     *
     * @param model
     * @return
     */
    @RequestMapping("/moviesList")
    public String moviesList(Model model, Video video) {
        video.setBegin((video.getPage() - 1) * video.getRows() );
        List<Video> videos = videoService.selectAll(video);
        //model.addAttribute("list", videos);

        List<Speaker> speakers = teacherService.selectAllTeacher();
        model.addAttribute("speakerList", speakers);

        List<Course> courses = classService.selectAllClass();
        model.addAttribute("courseList", courses);

        Page<Video> page = new Page<Video>();
        page.setPage(video.getPage());
        page.setSize(video.getRows());
        page.setTotal(videoService.getCount(video));
        page.setRows(videos);
        model.addAttribute("page",page);

        System.out.println("我进到movieslist里面了");

        return "moviesList";
    }

    /**
     * 删除视频管理中的数据
     *
     * @param id
     * @return
     */
    @RequestMapping("/deleteVideo")
    public String deleteVideo(int id) {
        System.out.println(id);

        videoService.deleteVideo(id);

        return "redirect:moviesList";
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/deleteBatchVideos")
    public String deleteBatchVideos(Integer[] ids) {
        videoService.deleteBatchVideos(ids);
        return "redirect:moviesList";
    }

    /**
     * 添加视频信息
     *
     * @return
     */
    @RequestMapping("/addvideo")
    public String addvideo(Model model) {
        List<Speaker> speakers = teacherService.selectAllTeacher();
        model.addAttribute("speakerList", speakers);

        List<Course> courses = classService.selectAllClass();
        model.addAttribute("courseList", courses);

        System.out.println("我进到了addvideos里面了");

        return "addvideo";
    }

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Video video) {
        videoService.saveOrUpdate(video);
        return "redirect:moviesList";
    }

    @RequestMapping("/edit")
    public String edit(int id, Model model) {
        Video video = videoService.getVideoById(id);
        model.addAttribute("video", video);

        List<Speaker> speakers = teacherService.selectAllTeacher();
        model.addAttribute("speakerList", speakers);

        List<Course> courses = classService.selectAllClass();
        model.addAttribute("courseList", courses);

        return "addvideo";
    }

    @RequestMapping("/showVideo.action")
    public String showVideo(int videoId, String subjectName, Model model) {
        Video video = videoService.selectVideoById(videoId);
        Speaker speaker = teacherService.selectSpeakerById(video.getSpeaker_id());
        model.addAttribute("speaker", speaker);
        Course course1 = classService.selectCourseById(video.getCourse_id());
        model.addAttribute("course", course1);

        List<Video> videoList = videoService.selectAllBySubjectName(subjectName);

        model.addAttribute("video",video);
        model.addAttribute("videoList",videoList);
        return "before/section";
    }

    /**
     * 视频播放次数增加
     * @param video
     * @return
     */
    @RequestMapping("/updatePlayNum.action")
    @ResponseBody
    public String updatePlayNum(Video video) {
        videoService.updatePlayNum(video);
        return "success";
    }


}
