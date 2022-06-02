package com.ahmedelzubair.simplifiedlinkedin.jobs.domain;

import com.ahmedelzubair.simplifiedlinkedin.address.domain.Address;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity(name = "companies")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @GenericGenerator(name = "linkedin_uuid", strategy = "uuid2")
    private UUID linkedInUuid;
    private String name;
    private String about;
    private String email;
    @Column(nullable = false, unique = true)
    private String username;
    private String phoneNumber;
    private String profileImageUrl;
    private String coverImageUrl;
    private LocalDate foundedAt;
    @Enumerated(EnumType.STRING)
    private CompanyStatus status;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "id")
    @JoinTable(name = "user_address",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id"))
    private Set<Address> addresses = new HashSet<>();

    private LocalDate createdAt;
    private LocalDate updatedAt;


}