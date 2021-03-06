package case_study.models;

import java.util.Date;

public class Customer extends Person{
    private String type;
    private String address;

    public final String DIAMOND = "Diamond";
    public final String PLATINUM = "Platinum";
    public final String GOLD = "Gold";
    public final String SILVER = "Silver";
    public final String MEMBER = "Member";

    public Customer() {}

    public Customer(String id, String fullName, String birthday, String gender, int idCardNumber, int phoneNumber,
                    String email, String type, String address) {
        super(id, fullName, birthday, gender, idCardNumber, phoneNumber, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", type='" + type + '\'' +
                ", address='" + address + '\'';
    }

    public String[] toStringArray() {
        String[] line = new String[9];
        line[0] = getId();
        line[1] = getFullName();
        line[2] = getBirthday();
        line[3] = getGender();
        line[4] = getIdCardNumber() + "";
        line[5] = getPhoneNumber() + "";
        line[6] = getEmail();
        line[7] = getType();
        line[8] = getAddress();
        return line;
    }
}
