package com.handy.support.entity;

public class AlbumCourse {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column album_course.album_id
     *
     * @mbggenerated
     */
    private Integer albumId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column album_course.course_id
     *
     * @mbggenerated
     */
    private Integer courseId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_course
     *
     * @mbggenerated
     */
    public AlbumCourse(Integer albumId, Integer courseId) {
        this.albumId = albumId;
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column album_course.album_id
     *
     * @return the value of album_course.album_id
     *
     * @mbggenerated
     */
    public Integer getAlbumId() {
        return albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column album_course.course_id
     *
     * @return the value of album_course.course_id
     *
     * @mbggenerated
     */
    public Integer getCourseId() {
        return courseId;
    }
}