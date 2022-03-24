package com.example.api_caller;

public class family {
    private String familyName;
    private long member;

    public String getFamilyName() {
        return familyName;
    }

    public long getMember() {
        return member;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setMember(long member) {
        this.member = member;
    }

    public family(String familyName, long member) {
        this.familyName = familyName;
        this.member = member;
    }
}
