package com.ahmedelzubair.simplifiedlinkedin.contact_info.domain;

import com.ahmedelzubair.simplifiedlinkedin.user.domain.AppUser;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_contact_info")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserContactInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String phone;
    private String email;
    private String websiteUrl;
    private String twitterUsername;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private AppUser user;

}
