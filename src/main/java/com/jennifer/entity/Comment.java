package com.jennifer.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Comment_Table")
public class Comment {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, length = 300 )
        private String commentContent;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(referencedColumnName = "fbUser_id", nullable = false)
        private FbUser users;

        @ManyToOne()
        @JoinColumn(referencedColumnName = "post_id",nullable = false)
        private Post post;

        @Column(nullable = false)
        private LocalDateTime commentDate;


        @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Like> likes = new ArrayList<>();

        public Comment(String commentContent, FbUser users, Post post) {
                this.commentContent = commentContent;
                this.users = users;
                this.post = post;
        }
}


