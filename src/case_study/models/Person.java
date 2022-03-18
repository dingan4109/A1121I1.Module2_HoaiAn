package case_study.models;

import java.util.Date;

public abstract class Person {
    private String id;
    private String fullName;
    private Date birthday;
    private String gender;
    private int idCardNumber;
    private int phoneNumber;
    private String email;

    public Person() {}

    public Person(String id, String fullName, Date birthday, String gender, int idCardNumber, int phoneNumber, String email) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(int idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
