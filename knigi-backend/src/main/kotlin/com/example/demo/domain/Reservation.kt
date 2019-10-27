package com.example.demo.domain

import javax.persistence.*

@Entity
@Table(name = "reservations")
data class Reservation(
        @Id
        @GeneratedValue(generator = "uuid")
        @Column(name = "id", unique = true, nullable = false, updatable = false)
        val id: String = "",

        @ManyToOne
        @JoinColumn(name = "book_id", nullable = false)
        val book: Book,

        @ManyToOne
        @JoinColumn(name = "user_id", nullable = false)
        val user: User,

        @Column(name = "num_of_ordered_books")
        val numOfOrderedBooks: Int
)
