package com.example.demo.domain

import javax.persistence.*


@Entity
@Table(name = "Categories")
data class Category(
        @Id
        @GeneratedValue(generator = "uuid")
        @Column(name = "id", unique = true, updatable = false, nullable = false)
        val id: String = "",

        @Column(name = "name")
        val name: String = "",

        @Column(name = "number_of_books")
        val bookCount: Int
)
