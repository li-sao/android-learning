package com.pojo;

public class Team {
    private String teamName;
    private String position;
    private String name;
    private String studentId;
    private String sex;
    private int age;
    private String institute;
    private String cls;
    private String contestName;
    private String contact;

    public Team() {
    }

    public Team(String teamName, String position, String name, String studentId, String sex, int age, String institute, String cls, String contestName, String contact) {
        this.teamName = teamName;
        this.position = position;
        this.name = name;
        this.studentId = studentId;
        this.sex = sex;
        this.age = age;
        this.institute = institute;
        this.cls = cls;
        this.contestName = contestName;
        this.contact = contact;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getPosition() {
        return position;
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

    public String getInstitute() {
        return institute;
    }

    public String getCls() {
        return cls;
    }

    public String getContestName() {
        return contestName;
    }

    public String getContact() {
        return contact;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", institute='" + institute + '\'' +
                ", cls='" + cls + '\'' +
                ", contestName='" + contestName + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
