package com.ahmedelzubair.simplifiedlinkedin.posts.domain;

import com.ahmedelzubair.simplifiedlinkedin.common.BaseEntity;
import com.ahmedelzubair.simplifiedlinkedin.users.domain.AppUser;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "posts")
@Getter
@Setter
@ToString

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post extends BaseEntity {

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
