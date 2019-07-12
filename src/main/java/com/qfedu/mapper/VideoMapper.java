package com.qfedu.mapper;

import com.qfedu.pojo.Video;

import java.util.List;

public interface VideoMapper {

    List<Video> selectAll(Video video);

    int deleteVideo(int id);

    void deleteBatch(Video video);

    void saveVideo(Video video);

    Video getVideoById(int id);

    void updateVideoById(Video video);

    int getCount(Video video);

    List<Video> selectVideoListByCourseId(int id);

    Video selectVideoById(int videoId);

    List<Video> selectAllBySubjectName(String subjectName);

    void updatePlayNum(Video video);
}
