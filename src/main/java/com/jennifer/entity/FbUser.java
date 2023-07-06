package com.jennifer.entity;

import com.jennifer.enums.Gender;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@AllArgsConstructor
@Getter
@Setter
@ToString

@NoArgsConstructor
@Entity
@Table(name = "User_Table")

public class FbUser {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, length = 100)
        private String fullName;

        @Column(nullable = false, unique = true,length = 100)
        private String email;

        @Column(nullable = false, length = 15)
        private String phoneNo;

        @Column(nullable = false, length = 100)
        private String passWord;

        @Column(nullable = false)
        private Gender gender;

//        @Column(nullable = false)
//        private LocalDateTime regTime;

//        @OneToMany(mappedBy = "users")
//        private List<Comment> comments;
//
//        @OneToMany(mappedBy = "user")
//        private List<Like> likes;


        public FbUser(String fullName, String email, String phoneNo, String passWord, Gender gender) {
                this.fullName = fullName;
                this.email = email;
                this.phoneNo = phoneNo;
                this.passWord = passWord;
                this.gender = gender;
        }


}



