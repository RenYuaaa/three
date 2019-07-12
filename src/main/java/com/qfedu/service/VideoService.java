package com.qfedu.service;

import com.qfedu.pojo.Video;

import java.util.List;

public interface VideoService {

    List<Video> selectAll(Video video);

    void deleteVideo(int id);

    void deleteBatchVideos(Integer[] ids);

    int saveOrUpdate(Video video);

    Video getVideoById(int id);

    int getCount(Video video);

    List<Video> selectVideoListByCourseId(int id);

    Video selectVideoById(int videoId);

    List<Video> selectAllBySubjectName(String subjectName);

    void updatePlayNum(Video video);
}
