package com.ahmedelzubair.simplifiedlinkedin.posts.domain;

import com.ahmedelzubair.simplifiedlinkedin.user.domain.AppUser;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "comments")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostComment {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String mediaUrls;
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private AppUser owner;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
    private String hashtags;

    private LocalDate createdAt;
    private LocalDate updatedAt;


}
