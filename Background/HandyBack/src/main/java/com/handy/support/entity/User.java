package com.handy.support.entity;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.nick_name
     *
     * @mbggenerated
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.login_password
     *
     * @mbggenerated
     */
    private String loginPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbggenerated
     */
    private Byte sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_pic
     *
     * @mbggenerated
     */
    private String userPic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbggenerated
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.level_id
     *
     * @mbggenerated
     */
    private Byte levelId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public User(Integer userId, String nickName, String loginPassword, String email, Byte sex, String userPic, Date birthday, Byte levelId) {
        this.userId = userId;
        this.nickName = nickName;
        this.loginPassword = loginPassword;
        this.email = email;
        this.sex = sex;
        this.userPic = userPic;
        this.birthday = birthday;
        this.levelId = levelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.nick_name
     *
     * @return the value of user.nick_name
     *
     * @mbggenerated
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.login_password
     *
     * @return the value of user.login_password
     *
     * @mbggenerated
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbggenerated
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_pic
     *
     * @return the value of user.user_pic
     *
     * @mbggenerated
     */
    public String getUserPic() {
        return userPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbggenerated
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.level_id
     *
     * @return the value of user.level_id
     *
     * @mbggenerated
     */
    public Byte getLevelId() {
        return levelId;
    }
}