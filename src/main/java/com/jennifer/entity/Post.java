package com.jennifer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


@Table(name = "Post_Table")

public class Post {


        @Id
        private Long id;
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "username")
        private String username;
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "fb_user_id", nullable = false)
        private FbUser user;

        @Column(nullable = false)
        private String PostContent;

        @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Comment> comment = new ArrayList<>();

        @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Like> likes = new ArrayList<>();

        @Column
        private LocalDateTime timestamp;
        @Column(nullable = false)
        private Integer likeCount = 0;
}





