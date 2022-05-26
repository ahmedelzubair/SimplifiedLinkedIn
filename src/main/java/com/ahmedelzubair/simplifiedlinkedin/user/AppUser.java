package com.ahmedelzubair.simplifiedlinkedin.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {@Parameter(name = "uuid_gen_strategy_class",
                    value = "org.hibernate.id.uuid.CustomVersionOneStrategy")})
    @Column(name = "uuid", updatable = false, nullable = false)
    private UUID linkedInId;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "username", nullable = false, unique = true)
    private String username;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "profile_image_url")
    private String profileImageUrl;
    @Column(name = "cover_image_url")
    private String coverImageUrl;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "status")
    private Long status;
    @Column(name = "addressId")
    private Long addressId;
    @Column(name = "about")
    private String about;
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Column(name = "updated_at")
    private LocalDate updatedAt;


}
