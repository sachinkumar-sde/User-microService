package com.learing.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.UUID;

@Document
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    @NotNull
    private String userName;
    @NotNull
    private Long mobileNumber;
    @NotNull
    private String emailID;



    public UserEntity(String userName, Long mobileNumber, String emailID) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.emailID = emailID;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    public UserEntity() {

    }

}
