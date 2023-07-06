package com.jennifer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Table(name = "Like_Table")
public class Like {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        @ManyToOne()
        @JoinColumn(referencedColumnName = "id", nullable = false)
        private FbUser fbUser;

        @ManyToOne()
        @JoinColumn(referencedColumnName = "id")
        private Post post;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "comment_id")
        private Comment  comment;

    }


