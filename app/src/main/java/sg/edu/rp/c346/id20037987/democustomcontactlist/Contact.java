package sg.edu.rp.c346.id20037987.democustomcontactlist;

import androidx.annotation.NonNull;

public class Contact {
    private String name;
    private int countryCode;
    private int phoneNum;
    private char gender;

    public Contact (String name, int countryCode, int phoneNum, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhoneNum() {
        this.phoneNum = phoneNum;
    }

    public void setGender() {
        this.gender = gender;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
