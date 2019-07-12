package com.qfedu.service.impl;

import com.qfedu.mapper.TeacherMapper;
import com.qfedu.pojo.Speaker;
import com.qfedu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;
    @Override
    public List<Speaker> selectAllTeacher() {
        List<Speaker> speakers = teacherMapper.selectAllTeacher();
        return speakers;
    }


    @Autowired
    TeacherMapper deleteTeacherMapper;
    @Override
    public void deleteTeacher(int id) {
        int i = deleteTeacherMapper.deleteTeacher(id);
    }

    @Autowired
    TeacherMapper mapper;
    @Override
    public int saveOrUpdate(Speaker speaker) {
        int id = 0;
        if (speaker.getId() != 0) {
            mapper.updateSpeakerById(speaker);
            id = speaker.getId();
        } else {
            mapper.saveSpeaker(speaker);
            id = speaker.getId();
        }
        return id;
    }

    @Override
    public Speaker getSpeakerById(int id) {
        Speaker ids = mapper.getSpeakerById(id);
        return ids;
    }

    @Autowired
    TeacherMapper pageMapper;
    @Override
    public int getCount(Speaker speaker) {
        int result = pageMapper.getCount(speaker);
        return result;
    }

    @Autowired
    TeacherService teacherService;
    @Override
    public List<Speaker> selectAllSpeaker(Speaker speaker) {
        List<Speaker> speakers1 = teacherMapper.selectAllSpeaker(speaker);
        return speakers1;
    }

    @Override
    public Speaker selectSpeakerById(int speaker_id) {
        return teacherMapper.selectSpeakerById(speaker_id);
    }
}
