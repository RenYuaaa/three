package com.qfedu.pojo;

public class Speaker {
    private int id;
    private String speaker_name;
    private String speaker_desc;
    private String speaker_job;
    private String head_img_url;

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

    public Speaker() {
    }

    public Speaker(int id, String speaker_name, String speaker_desc, String speaker_job, String head_img_url, int page, int rows, int begin) {
        this.id = id;
        this.speaker_name = speaker_name;
        this.speaker_desc = speaker_desc;
        this.speaker_job = speaker_job;
        this.head_img_url = head_img_url;
        this.page = page;
        this.rows = rows;
        this.begin = begin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeaker_name() {
        return speaker_name;
    }

    public void setSpeaker_name(String speaker_name) {
        this.speaker_name = speaker_name;
    }

    public String getSpeaker_desc() {
        return speaker_desc;
    }

    public void setSpeaker_desc(String speaker_desc) {
        this.speaker_desc = speaker_desc;
    }

    public String getSpeaker_job() {
        return speaker_job;
    }

    public void setSpeaker_job(String speaker_job) {
        this.speaker_job = speaker_job;
    }

    public String getHead_img_url() {
        return head_img_url;
    }

    public void setHead_img_url(String head_img_url) {
        this.head_img_url = head_img_url;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "id=" + id +
                ", speaker_name='" + speaker_name + '\'' +
                ", speaker_desc='" + speaker_desc + '\'' +
                ", speaker_job='" + speaker_job + '\'' +
                ", head_img_url='" + head_img_url + '\'' +
                '}';
    }
}
