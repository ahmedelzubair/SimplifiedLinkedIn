package com.ahmedelzubair.simplifiedlinkedin.user.domain;

import com.ahmedelzubair.simplifiedlinkedin.address.domain.Address;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity(name = "users")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @GenericGenerator(name = "linkedin_uuid", strategy = "uuid2")
    private UUID linkedInUuid;
    private String firstName;
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    private String password;
    @Column(nullable = false, unique = true)
    private String username;
    private String phoneNumber;
    private String profileImageUrl;
    private String coverImageUrl;
    private LocalDate dateOfBirth;
    private Long status;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "id")
    @JoinTable(name = "user_address",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id"))
    private Set<Address> addresses = new HashSet<>();
    private String about;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AppUser appUser = (AppUser) o;
        return id != null && Objects.equals(id, appUser.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
