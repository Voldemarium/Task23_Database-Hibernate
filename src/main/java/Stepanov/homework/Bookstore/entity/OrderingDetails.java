package Stepanov.homework.Bookstore.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "ordering_details")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class OrderingDetails {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn
    private Ordering ordering;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "book_id", referencedColumnName = "id"),
            @JoinColumn(name = "price", referencedColumnName = "price")
    })
    private Book book;

    @Column
    private Integer quantity;

}
