package com.sj.spring.jpa.springJPA.model;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import lombok.*;

@Entity
@Data
public class UserMaster extends AuditModel{
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Size(min = 3, max = 80)
    private String name;

    @NotBlank
    @Size(min = 10, max = 10)
    private String mobile;
    
    @NotBlank
    @Size(min = 5, max = 100)
    private String email;
    
    @NotBlank
    @Size(min = 6, max = 100)
    private String password;
    
      
    @Transient
    //@NotBlank
    @Size(min = 6, max = 100)
    private String mPassword;
    
    private Long entityId;
    
    @NotBlank
    @Size(min = 6, max = 6)
    private String pin;
    
    @Column(name="country", columnDefinition="Varchar(20) default 'IN'")
    private String country;
    
    private String state;
    private String district;
    private String town;
    private String address;
    
    
    @Past
    private Date dob;
    
    @Enumerated
    @Column(columnDefinition = "smallint default 0")
    private UserStatusEnum status;
    
    @Enumerated
    @Column(columnDefinition = "character default 'Y'")
    private FirstLoginFlagEnum firstLoginFlag;

    @Column(columnDefinition = "smallint default 0")
    private int incorrectAttemptCount;

    private Timestamp lastAccessDateTime;

    
    
    
    


	

}
