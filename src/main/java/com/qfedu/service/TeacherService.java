package com.qfedu.service;

import com.qfedu.pojo.Speaker;

import java.util.List;

public interface TeacherService {
    List<Speaker> selectAllTeacher();

    void deleteTeacher(int id);

    int saveOrUpdate(Speaker speaker);

    Speaker getSpeakerById(int id);

    int getCount(Speaker speaker);

    List<Speaker> selectAllSpeaker(Speaker speaker);

    Speaker selectSpeakerById(int speaker_id);
}
