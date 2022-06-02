package com.ahmedelzubair.simplifiedlinkedin.connections.domain;

import com.ahmedelzubair.simplifiedlinkedin.common.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_connections")
@Getter
@Setter
@ToString

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserConnection extends BaseEntity {

    @Column(name = "user_connections")
    private String userConnections;
    /*
        list of user connections in json format.
         can be a list of user connections, with many-to-many relationship,
         but we will get huge table, and it may have billions of records.

         so we will use a json array to store the list of user connections.
         and we will deal with manipulating the json array in the application code.
         like getting its count, getting ids for fetching its elements, etc.

         (( --no one size fits all-- )).
    */


}
