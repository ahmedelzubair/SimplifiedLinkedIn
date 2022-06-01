package com.ahmedelzubair.simplifiedlinkedin.posts.domain;

import com.ahmedelzubair.simplifiedlinkedin.user.domain.AppUser;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "posts")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String mediaUrls;
    private Long impressions;
    @Enumerated(EnumType.STRING)
    private PostPrivacyType privacyType;
    @Enumerated(EnumType.STRING)
    private PostStatus status;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private AppUser owner;
    private String hashtags;

    private LocalDate createdAt;
    private LocalDate updatedAt;


}
