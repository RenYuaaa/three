package com.qfedu.pojo;

import com.qfedu.utils.StringUtils;

import java.util.List;

public class Video {
    private int id;
    private String title;
    private String detail;
    private int time;
    private int speaker_id;
    private int course_id;
    private String video_url;
    private String image_url;
    private int play_num;
    private String speaker_name;
    private List<Integer> idList;
    private String subjectName;

    private String showTime;

    private int page = 1;
    private int rows = 5;
    private int begin = 0;

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

    public Video() {
    }

    public Video(int id, String title, String detail, int time, int speaker_id, int course_id, String video_url, String image_url, int play_num, String speaker_name, List<Integer> idList, String showTime, int page, int rows, int begin) {
        this.id = id;
        this.title = title;
        this.detail = detail;
        this.time = time;
        this.speaker_id = speaker_id;
        this.course_id = course_id;
        this.video_url = video_url;
        this.image_url = image_url;
        this.play_num = play_num;
        this.speaker_name = speaker_name;
        this.idList = idList;
        this.showTime = showTime;
        this.page = page;
        this.rows = rows;
        this.begin = begin;
    }

    public String getShowTime() {
        String timeByInt = StringUtils.getTimeByInt(time);
        return timeByInt;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public List<Integer> getIdList() {
        return idList;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getSpeaker_id() {
        return speaker_id;
    }

    public void setSpeaker_id(int speaker_id) {
        this.speaker_id = speaker_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public int getPlay_num() {
        return play_num;
    }

    public void setPlay_num(int play_num) {
        this.play_num = play_num;
    }

    public String getSpeaker_name() {
        return speaker_name;
    }

    public void setSpeaker_name(String speaker_name) {
        this.speaker_name = speaker_name;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", time=" + time +
                ", speaker_id=" + speaker_id +
                ", course_id=" + course_id +
                ", video_url='" + video_url + '\'' +
                ", image_url='" + image_url + '\'' +
                ", play_num=" + play_num +
                ", speaker_name='" + speaker_name + '\'' +
                ", idList=" + idList +
                ", subjectName='" + subjectName + '\'' +
                ", showTime='" + showTime + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                ", begin=" + begin +
                '}';
    }
}
