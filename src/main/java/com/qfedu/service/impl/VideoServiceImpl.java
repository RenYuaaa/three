package com.qfedu.service.impl;

import com.qfedu.mapper.VideoMapper;
import com.qfedu.pojo.Video;
import com.qfedu.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoMapper videoMapper;
    @Override
    public List<Video> selectAll(Video video) {
        List<Video> videos = videoMapper.selectAll(video);
        return videos;
    }

    @Autowired
    VideoMapper mapper;
    @Override
    public void deleteVideo(int id) {
        int i = mapper.deleteVideo(id);
    }

    @Override
    public void deleteBatchVideos(Integer[] ids) {
        Video video = new Video();
        List<Integer> integers = Arrays.asList(ids);
        video.setIdList(integers);
        mapper.deleteBatch(video);
    }

    @Override
    public int saveOrUpdate(Video video) {
        int id = 0;
        if (video.getId() != 0) {
            mapper.updateVideoById(video);
            id = video.getId();
        } else {
            mapper.saveVideo(video);
            id = video.getId();
        }
        return id;
    }

    @Override
    public Video getVideoById(int id) {
        Video ids = mapper.getVideoById(id);
        return ids;
    }

    @Autowired
    VideoMapper pageMapper;
    @Override
    public int getCount(Video video) {
        int result = pageMapper.getCount(video);
        return result;
    }

    @Override
    public List<Video> selectVideoListByCourseId(int id) {
        return videoMapper.selectVideoListByCourseId(id);
    }

    @Override
    public Video selectVideoById(int videoId) {
        return videoMapper.selectVideoById(videoId);
    }

    @Override
    public List<Video> selectAllBySubjectName(String subjectName) {
        return videoMapper.selectAllBySubjectName(subjectName);
    }

    @Override
    public void updatePlayNum(Video video) {
        videoMapper.updatePlayNum(video);
    }

}
