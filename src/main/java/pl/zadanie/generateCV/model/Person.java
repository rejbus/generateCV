package pl.zadanie.generateCV.model;

public class Person {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String addreess;
    private String email;
    private String phone;
    private String fullName;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    private String page;

    public String getFullName(){
        return firstName + " "+ lastName;
    }

    public void setFullName(){
        this.fullName = firstName+" "+ lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddreess() {
        return addreess;
    }

    public void setAddreess(String addreess) {
        this.addreess = addreess;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
