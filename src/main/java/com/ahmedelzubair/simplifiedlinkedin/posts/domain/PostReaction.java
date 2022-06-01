package com.ahmedelzubair.simplifiedlinkedin.posts.domain;

import com.ahmedelzubair.simplifiedlinkedin.user.domain.AppUser;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "posts_reactions")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostReaction {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private AppUser owner;
    private String type;

    private LocalDate createdAt;
    private LocalDate updatedAt;


}
