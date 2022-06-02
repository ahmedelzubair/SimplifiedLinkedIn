package com.ahmedelzubair.simplifiedlinkedin.posts.domain;

import com.ahmedelzubair.simplifiedlinkedin.common.BaseEntity;
import com.ahmedelzubair.simplifiedlinkedin.user.domain.AppUser;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity(name = "comments_reactions")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentReaction extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private PostComment post;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private AppUser owner;
    private String type;

    private LocalDate createdAt;
    private LocalDate updatedAt;


}
