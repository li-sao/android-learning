package com.pojo;

public class User {


    private String username;
    private String password;
    private String name;
    private String studentId;
    private String sex;
    private int  age;
    private String contact;
    private String institute;
    private String cls;

    public User() {
    }

    public User(String username, String password, String name, String studentId, String sex, int age, String contact, String institute, String cls) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.studentId = studentId;
        this.sex = sex;
        this.age = age;
        this.contact = contact;
        this.institute = institute;
        this.cls = cls;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getContact() {
        return contact;
    }

    public String getInstitute() {
        return institute;
    }

    public String getCls() {
        return cls;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                ", institute='" + institute + '\'' +
                ", cls='" + cls + '\'' +
                '}';
    }
}
