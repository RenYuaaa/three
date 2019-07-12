package com.qfedu.mapper;

import com.qfedu.pojo.Speaker;

import java.util.List;

public interface TeacherMapper {

    List<Speaker> selectAllTeacher();

    int deleteTeacher(int id);

    void saveSpeaker(Speaker speaker);

    void updateSpeakerById(Speaker speaker);

    Speaker getSpeakerById(int id);

    int getCount(Speaker speaker);

    List<Speaker> selectAllSpeaker(Speaker speaker);

    Speaker selectSpeakerById(int speaker_id);
}
