package com.shopee.customer.modal;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@Table(name = "tbl_users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends AbstractEntity<Long> {

    @Column(name = "username", nullable = false)
    String username;
    @Column(name = "password", nullable = false)
    String password;
    @Column(name = "email", length = 100)
    String email;
    @Column(name = "email", length = 100)
    String phoneNumber;
    @Column(name = "email", length = 100)
    List<Address> address;
    @Column(name = "email", length = 100)
    String fullName;
    @Column(name = "email", length = 100)
    String avatarUrl;

}
