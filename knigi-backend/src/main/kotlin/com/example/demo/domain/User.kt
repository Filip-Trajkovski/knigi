package com.example.demo.domain

import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue(generator = "uuid")
        @Column(name = "id", unique = true, nullable = false, updatable = false)
        val id: String = "",

        @Column(name = "username", unique = true)
        val username: String = "",

        @Column(name = "password")
        val password: String =""
)
