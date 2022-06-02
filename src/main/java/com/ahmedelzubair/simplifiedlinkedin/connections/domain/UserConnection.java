package com.ahmedelzubair.simplifiedlinkedin.connections.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_connections")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserConnection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_connections")
    private String userConnections;
    /*
        list of user connections in json format.
         can be a list of user connections, with many-to-many relationship,
         but we will get huge table, and it may have billions of records.

         so we will use a json array to store the list of user connections.
         and we will deal with manipulating the json array in the application code.
         like getting its count, getting its elements, etc.

         (( --no one size fits all-- )).
    */


}
