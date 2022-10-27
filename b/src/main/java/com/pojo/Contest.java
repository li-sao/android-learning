package com.pojo;

import java.sql.Date;

public class Contest {


        private String contestName;
        private String contestType;
        private String contestDetail;
        private Date startTime;
        private Date endTime;
        private String contact;
        private Date contestTime;
        private String contestVenue;
        private String award;
        private String sponsor;
        private String contestant;

    public Contest() {
    }

    public Contest(String contestName, String contestType, String contestDetail, Date startTime, Date endTime, String contact, Date contestTime, String contestVenue, String award, String sponsor, String contestant) {
        this.contestName = contestName;
        this.contestType = contestType;
        this.contestDetail = contestDetail;
        this.startTime = startTime;
        this.endTime = endTime;
        this.contact = contact;
        this.contestTime = contestTime;
        this.contestVenue = contestVenue;
        this.award = award;
        this.sponsor = sponsor;
        this.contestant = contestant;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public void setContestType(String contestType) {
        this.contestType = contestType;
    }

    public void setContestDetail(String contestDetail) {
        this.contestDetail = contestDetail;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setContestTime(Date contestTime) {
        this.contestTime = contestTime;
    }

    public void setContestVenue(String contestVenue) {
        this.contestVenue = contestVenue;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public void setContestant(String contestant) {
        this.contestant = contestant;
    }

    public String getContestName() {
        return contestName;
    }

    public String getContestType() {
        return contestType;
    }

    public String getContestDetail() {
        return contestDetail;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getContact() {
        return contact;
    }

    public Date getContestTime() {
        return contestTime;
    }

    public String getContestVenue() {
        return contestVenue;
    }

    public String getAward() {
        return award;
    }

    public String getSponsor() {
        return sponsor;
    }

    public String getContestant() {
        return contestant;
    }

    @Override
    public String toString() {
        return "Contest{" +
                "contestName='" + contestName + '\'' +
                ", contestType='" + contestType + '\'' +
                ", contestDetail='" + contestDetail + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", contact='" + contact + '\'' +
                ", contestTime=" + contestTime +
                ", contestVenue='" + contestVenue + '\'' +
                ", award='" + award + '\'' +
                ", sponsor='" + sponsor + '\'' +
                ", contestant='" + contestant + '\'' +
                '}';
    }
}
