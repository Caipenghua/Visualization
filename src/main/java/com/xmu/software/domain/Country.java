package com.xmu.software.domain;

import java.time.LocalDateTime;

public class Country {
    private LocalDateTime date;
    private Integer confirm;
    private Integer confirmCur;
    private Integer confirmAdd;
    private Integer confirmCurAdd;
    private Integer suspect;
    private Integer suspectAdd;
    private Integer cure;
    private Integer cureAdd;
    private Integer dead;
    private Integer deadAdd;

    public Integer getConfirmCurAdd() {
        return confirmCurAdd;
    }

    public void setConfirmCurAdd(Integer confirmCurAdd) {
        this.confirmCurAdd = confirmCurAdd;
    }
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getConfirm() {
        return confirm;
    }

    public void setConfirm(Integer confirm) {
        this.confirm = confirm;
    }

    public Integer getConfirmCur() {
        return confirmCur;
    }

    public void setConfirmCur(Integer confirmCur) {
        this.confirmCur = confirmCur;
    }

    public Integer getConfirmAdd() {
        return confirmAdd;
    }

    public void setConfirmAdd(Integer confirmAdd) {
        this.confirmAdd = confirmAdd;
    }

    public Integer getSuspect() {
        return suspect;
    }

    public void setSuspect(Integer suspect) {
        this.suspect = suspect;
    }

    public Integer getSuspectAdd() {
        return suspectAdd;
    }

    public void setSuspectAdd(Integer suspectAdd) {
        this.suspectAdd = suspectAdd;
    }

    public Integer getCure() {
        return cure;
    }

    public void setCure(Integer cure) {
        this.cure = cure;
    }

    public Integer getCureAdd() {
        return cureAdd;
    }

    public void setCureAdd(Integer cureAdd) {
        this.cureAdd = cureAdd;
    }

    public Integer getDead() {
        return dead;
    }

    public void setDead(Integer dead) {
        this.dead = dead;
    }

    public Integer getDeadAdd() {
        return deadAdd;
    }

    public void setDeadAdd(Integer deadAdd) {
        this.deadAdd = deadAdd;
    }
}
