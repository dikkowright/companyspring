package com.example.companyspring.Model.Entity;

import com.example.companyspring.Model.Constatnt.MaritalStatus;
import com.example.companyspring.Model.Constatnt.Status;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "staffs")
public class RecuitmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String surname;
    private String firstName;
    private String middleName;
    private String sex;
    private String age;
    private MaritalStatus maritalStatus;
    private String phoneNumber;
    private String level;
    private Status status;
   // @CreationTimestamp
    private Timestamp createdAt;
   // @UpdateTimestamp
    private Timestamp updatedAt;
    private String uniqueKey;
    private String email;
    private String department;
    private String entitleNumberOfDays;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEntitleNumberOfDays() {
        return entitleNumberOfDays;
    }

    public void setEntitleNumberOfDays(String entitleNumberOfDays) {
        this.entitleNumberOfDays = entitleNumberOfDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecuitmentEntity that = (RecuitmentEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(middleName, that.middleName) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(age, that.age) &&
                maritalStatus == that.maritalStatus &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(level, that.level) &&
                status == that.status &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(uniqueKey, that.uniqueKey) &&
                Objects.equals(email, that.email) &&
                Objects.equals(department, that.department) &&
                Objects.equals(entitleNumberOfDays, that.entitleNumberOfDays);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, surname, firstName, middleName, sex, age, maritalStatus, phoneNumber, level, status, createdAt, updatedAt, uniqueKey, email, department, entitleNumberOfDays);
    }

    @PrePersist
    public void beforeSave() {
        this.createdAt = new Timestamp(new Date().getTime());
    }

    @PreUpdate
    private void beforeUpdate() {
        this.updatedAt = new Timestamp(new Date().getTime());
    }
}
