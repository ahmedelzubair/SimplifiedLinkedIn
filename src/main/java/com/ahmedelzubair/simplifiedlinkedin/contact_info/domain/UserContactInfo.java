package com.ahmedelzubair.simplifiedlinkedin.contact_info.domain;

import com.ahmedelzubair.simplifiedlinkedin.common.BaseEntity;
import com.ahmedelzubair.simplifiedlinkedin.users.domain.AppUser;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "user_contact_info")
@Getter
@Setter
@ToString

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserContactInfo extends BaseEntity {

    private String phone;
    private String email;
    private String websiteUrl;
    private String twitterUsername;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private AppUser user;

}
