package com.handy.support.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    public CourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseTitleIsNull() {
            addCriterion("course_title is null");
            return (Criteria) this;
        }

        public Criteria andCourseTitleIsNotNull() {
            addCriterion("course_title is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTitleEqualTo(String value) {
            addCriterion("course_title =", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotEqualTo(String value) {
            addCriterion("course_title <>", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleGreaterThan(String value) {
            addCriterion("course_title >", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleGreaterThanOrEqualTo(String value) {
            addCriterion("course_title >=", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleLessThan(String value) {
            addCriterion("course_title <", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleLessThanOrEqualTo(String value) {
            addCriterion("course_title <=", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleLike(String value) {
            addCriterion("course_title like", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotLike(String value) {
            addCriterion("course_title not like", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleIn(List<String> values) {
            addCriterion("course_title in", values, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotIn(List<String> values) {
            addCriterion("course_title not in", values, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleBetween(String value1, String value2) {
            addCriterion("course_title between", value1, value2, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotBetween(String value1, String value2) {
            addCriterion("course_title not between", value1, value2, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseIntroIsNull() {
            addCriterion("course_intro is null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroIsNotNull() {
            addCriterion("course_intro is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroEqualTo(String value) {
            addCriterion("course_intro =", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroNotEqualTo(String value) {
            addCriterion("course_intro <>", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroGreaterThan(String value) {
            addCriterion("course_intro >", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroGreaterThanOrEqualTo(String value) {
            addCriterion("course_intro >=", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroLessThan(String value) {
            addCriterion("course_intro <", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroLessThanOrEqualTo(String value) {
            addCriterion("course_intro <=", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroLike(String value) {
            addCriterion("course_intro like", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroNotLike(String value) {
            addCriterion("course_intro not like", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroIn(List<String> values) {
            addCriterion("course_intro in", values, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroNotIn(List<String> values) {
            addCriterion("course_intro not in", values, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroBetween(String value1, String value2) {
            addCriterion("course_intro between", value1, value2, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroNotBetween(String value1, String value2) {
            addCriterion("course_intro not between", value1, value2, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseNoteIsNull() {
            addCriterion("course_note is null");
            return (Criteria) this;
        }

        public Criteria andCourseNoteIsNotNull() {
            addCriterion("course_note is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNoteEqualTo(String value) {
            addCriterion("course_note =", value, "courseNote");
            return (Criteria) this;
        }

        public Criteria andCourseNoteNotEqualTo(String value) {
            addCriterion("course_note <>", value, "courseNote");
            return (Criteria) this;
        }

        public Criteria andCourseNoteGreaterThan(String value) {
            addCriterion("course_note >", value, "courseNote");
            return (Criteria) this;
        }

        public Criteria andCourseNoteGreaterThanOrEqualTo(String value) {
            addCriterion("course_note >=", value, "courseNote");
            return (Criteria) this;
        }

        public Criteria andCourseNoteLessThan(String value) {
            addCriterion("course_note <", value, "courseNote");
            return (Criteria) this;
        }

        public Criteria andCourseNoteLessThanOrEqualTo(String value) {
            addCriterion("course_note <=", value, "courseNote");
            return (Criteria) this;
        }

        public Criteria andCourseNoteLike(String value) {
            addCriterion("course_note like", value, "courseNote");
            return (Criteria) this;
        }

        public Criteria andCourseNoteNotLike(String value) {
            addCriterion("course_note not like", value, "courseNote");
            return (Criteria) this;
        }

        public Criteria andCourseNoteIn(List<String> values) {
            addCriterion("course_note in", values, "courseNote");
            return (Criteria) this;
        }

        public Criteria andCourseNoteNotIn(List<String> values) {
            addCriterion("course_note not in", values, "courseNote");
            return (Criteria) this;
        }

        public Criteria andCourseNoteBetween(String value1, String value2) {
            addCriterion("course_note between", value1, value2, "courseNote");
            return (Criteria) this;
        }

        public Criteria andCourseNoteNotBetween(String value1, String value2) {
            addCriterion("course_note not between", value1, value2, "courseNote");
            return (Criteria) this;
        }

        public Criteria andCourseCoverIsNull() {
            addCriterion("course_cover is null");
            return (Criteria) this;
        }

        public Criteria andCourseCoverIsNotNull() {
            addCriterion("course_cover is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCoverEqualTo(String value) {
            addCriterion("course_cover =", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverNotEqualTo(String value) {
            addCriterion("course_cover <>", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverGreaterThan(String value) {
            addCriterion("course_cover >", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverGreaterThanOrEqualTo(String value) {
            addCriterion("course_cover >=", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverLessThan(String value) {
            addCriterion("course_cover <", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverLessThanOrEqualTo(String value) {
            addCriterion("course_cover <=", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverLike(String value) {
            addCriterion("course_cover like", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverNotLike(String value) {
            addCriterion("course_cover not like", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverIn(List<String> values) {
            addCriterion("course_cover in", values, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverNotIn(List<String> values) {
            addCriterion("course_cover not in", values, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverBetween(String value1, String value2) {
            addCriterion("course_cover between", value1, value2, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverNotBetween(String value1, String value2) {
            addCriterion("course_cover not between", value1, value2, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseViewsIsNull() {
            addCriterion("course_views is null");
            return (Criteria) this;
        }

        public Criteria andCourseViewsIsNotNull() {
            addCriterion("course_views is not null");
            return (Criteria) this;
        }

        public Criteria andCourseViewsEqualTo(Integer value) {
            addCriterion("course_views =", value, "courseViews");
            return (Criteria) this;
        }

        public Criteria andCourseViewsNotEqualTo(Integer value) {
            addCriterion("course_views <>", value, "courseViews");
            return (Criteria) this;
        }

        public Criteria andCourseViewsGreaterThan(Integer value) {
            addCriterion("course_views >", value, "courseViews");
            return (Criteria) this;
        }

        public Criteria andCourseViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_views >=", value, "courseViews");
            return (Criteria) this;
        }

        public Criteria andCourseViewsLessThan(Integer value) {
            addCriterion("course_views <", value, "courseViews");
            return (Criteria) this;
        }

        public Criteria andCourseViewsLessThanOrEqualTo(Integer value) {
            addCriterion("course_views <=", value, "courseViews");
            return (Criteria) this;
        }

        public Criteria andCourseViewsIn(List<Integer> values) {
            addCriterion("course_views in", values, "courseViews");
            return (Criteria) this;
        }

        public Criteria andCourseViewsNotIn(List<Integer> values) {
            addCriterion("course_views not in", values, "courseViews");
            return (Criteria) this;
        }

        public Criteria andCourseViewsBetween(Integer value1, Integer value2) {
            addCriterion("course_views between", value1, value2, "courseViews");
            return (Criteria) this;
        }

        public Criteria andCourseViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("course_views not between", value1, value2, "courseViews");
            return (Criteria) this;
        }

        public Criteria andCourseCollectsIsNull() {
            addCriterion("course_collects is null");
            return (Criteria) this;
        }

        public Criteria andCourseCollectsIsNotNull() {
            addCriterion("course_collects is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCollectsEqualTo(Integer value) {
            addCriterion("course_collects =", value, "courseCollects");
            return (Criteria) this;
        }

        public Criteria andCourseCollectsNotEqualTo(Integer value) {
            addCriterion("course_collects <>", value, "courseCollects");
            return (Criteria) this;
        }

        public Criteria andCourseCollectsGreaterThan(Integer value) {
            addCriterion("course_collects >", value, "courseCollects");
            return (Criteria) this;
        }

        public Criteria andCourseCollectsGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_collects >=", value, "courseCollects");
            return (Criteria) this;
        }

        public Criteria andCourseCollectsLessThan(Integer value) {
            addCriterion("course_collects <", value, "courseCollects");
            return (Criteria) this;
        }

        public Criteria andCourseCollectsLessThanOrEqualTo(Integer value) {
            addCriterion("course_collects <=", value, "courseCollects");
            return (Criteria) this;
        }

        public Criteria andCourseCollectsIn(List<Integer> values) {
            addCriterion("course_collects in", values, "courseCollects");
            return (Criteria) this;
        }

        public Criteria andCourseCollectsNotIn(List<Integer> values) {
            addCriterion("course_collects not in", values, "courseCollects");
            return (Criteria) this;
        }

        public Criteria andCourseCollectsBetween(Integer value1, Integer value2) {
            addCriterion("course_collects between", value1, value2, "courseCollects");
            return (Criteria) this;
        }

        public Criteria andCourseCollectsNotBetween(Integer value1, Integer value2) {
            addCriterion("course_collects not between", value1, value2, "courseCollects");
            return (Criteria) this;
        }

        public Criteria andCourseLikesIsNull() {
            addCriterion("course_likes is null");
            return (Criteria) this;
        }

        public Criteria andCourseLikesIsNotNull() {
            addCriterion("course_likes is not null");
            return (Criteria) this;
        }

        public Criteria andCourseLikesEqualTo(Integer value) {
            addCriterion("course_likes =", value, "courseLikes");
            return (Criteria) this;
        }

        public Criteria andCourseLikesNotEqualTo(Integer value) {
            addCriterion("course_likes <>", value, "courseLikes");
            return (Criteria) this;
        }

        public Criteria andCourseLikesGreaterThan(Integer value) {
            addCriterion("course_likes >", value, "courseLikes");
            return (Criteria) this;
        }

        public Criteria andCourseLikesGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_likes >=", value, "courseLikes");
            return (Criteria) this;
        }

        public Criteria andCourseLikesLessThan(Integer value) {
            addCriterion("course_likes <", value, "courseLikes");
            return (Criteria) this;
        }

        public Criteria andCourseLikesLessThanOrEqualTo(Integer value) {
            addCriterion("course_likes <=", value, "courseLikes");
            return (Criteria) this;
        }

        public Criteria andCourseLikesIn(List<Integer> values) {
            addCriterion("course_likes in", values, "courseLikes");
            return (Criteria) this;
        }

        public Criteria andCourseLikesNotIn(List<Integer> values) {
            addCriterion("course_likes not in", values, "courseLikes");
            return (Criteria) this;
        }

        public Criteria andCourseLikesBetween(Integer value1, Integer value2) {
            addCriterion("course_likes between", value1, value2, "courseLikes");
            return (Criteria) this;
        }

        public Criteria andCourseLikesNotBetween(Integer value1, Integer value2) {
            addCriterion("course_likes not between", value1, value2, "courseLikes");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDiyLabelIsNull() {
            addCriterion("diy_label is null");
            return (Criteria) this;
        }

        public Criteria andDiyLabelIsNotNull() {
            addCriterion("diy_label is not null");
            return (Criteria) this;
        }

        public Criteria andDiyLabelEqualTo(String value) {
            addCriterion("diy_label =", value, "diyLabel");
            return (Criteria) this;
        }

        public Criteria andDiyLabelNotEqualTo(String value) {
            addCriterion("diy_label <>", value, "diyLabel");
            return (Criteria) this;
        }

        public Criteria andDiyLabelGreaterThan(String value) {
            addCriterion("diy_label >", value, "diyLabel");
            return (Criteria) this;
        }

        public Criteria andDiyLabelGreaterThanOrEqualTo(String value) {
            addCriterion("diy_label >=", value, "diyLabel");
            return (Criteria) this;
        }

        public Criteria andDiyLabelLessThan(String value) {
            addCriterion("diy_label <", value, "diyLabel");
            return (Criteria) this;
        }

        public Criteria andDiyLabelLessThanOrEqualTo(String value) {
            addCriterion("diy_label <=", value, "diyLabel");
            return (Criteria) this;
        }

        public Criteria andDiyLabelLike(String value) {
            addCriterion("diy_label like", value, "diyLabel");
            return (Criteria) this;
        }

        public Criteria andDiyLabelNotLike(String value) {
            addCriterion("diy_label not like", value, "diyLabel");
            return (Criteria) this;
        }

        public Criteria andDiyLabelIn(List<String> values) {
            addCriterion("diy_label in", values, "diyLabel");
            return (Criteria) this;
        }

        public Criteria andDiyLabelNotIn(List<String> values) {
            addCriterion("diy_label not in", values, "diyLabel");
            return (Criteria) this;
        }

        public Criteria andDiyLabelBetween(String value1, String value2) {
            addCriterion("diy_label between", value1, value2, "diyLabel");
            return (Criteria) this;
        }

        public Criteria andDiyLabelNotBetween(String value1, String value2) {
            addCriterion("diy_label not between", value1, value2, "diyLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNull() {
            addCriterion("level_id is null");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNotNull() {
            addCriterion("level_id is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(Byte value) {
            addCriterion("level_id =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(Byte value) {
            addCriterion("level_id <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(Byte value) {
            addCriterion("level_id >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("level_id >=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(Byte value) {
            addCriterion("level_id <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(Byte value) {
            addCriterion("level_id <=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIn(List<Byte> values) {
            addCriterion("level_id in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<Byte> values) {
            addCriterion("level_id not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(Byte value1, Byte value2) {
            addCriterion("level_id between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(Byte value1, Byte value2) {
            addCriterion("level_id not between", value1, value2, "levelId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}