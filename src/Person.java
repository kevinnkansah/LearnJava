public class Person {
    private String firstName, surName, email, position, department, phoneNumber;

    Person(String firstName, String surName, String email, String position, String department, String phoneNumber) {
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        this.position = position;
        this.department = department;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "This person's first name is " + firstName +
                ", surname is " + surName +
                ", and they can be contacted at the email " + email +
                ".\nThey work as a " + position +
                " in the " + department +
                " department.\nTheir phone number is " + phoneNumber + ".";
    }
}
