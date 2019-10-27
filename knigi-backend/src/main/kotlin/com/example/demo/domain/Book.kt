package com.example.demo.domain

import javax.persistence.*

@Entity
@Table(name = "books")
data class Book(
        @Id
        @GeneratedValue(generator = "uuid")
        @Column(name = "id", unique = false, nullable = false, updatable = false)
        val id: String = "",

        @ManyToOne
        @JoinColumn(name = "category_id", nullable = false)
        val category: Category,

        @Column(name = "title")
        val title: String = "",

        @Column(name = "author")
        val author: String = "",

        @Column(name = "description")
        val description: String = "",

        @Column(name = "available_items")
        val numberOfItems: Int
)
