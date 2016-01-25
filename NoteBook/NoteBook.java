package com.company;

/**
 * Created by Admin on 24.01.2016.
 */
public class NoteBook extends Date {
    private String surname;
    private String name;
    private String patronymic;
    private String telephone;

    public NoteBook(){
        this.surname = null;
        this.name = null;
        this.patronymic = null;
        this.telephone =null;
    }

    public NoteBook(int yy, int mm, int dd, String surname, String name, String patronymic, String telephone) {
        super(yy, mm, dd);
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.telephone = telephone;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "year:" + yy +
                ", month:" + mm +
                ", date:" + dd +
                ",  surname: " + surname + '\'' +
                " name: " + name + '\'' +
                ", patronymic: " + patronymic + '\'' +
                ", telephone: " + telephone +
                '}';
    }
}
