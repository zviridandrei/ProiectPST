package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

//Adnotari mapare
@Entity
//Se face maparea
@Table(name = "rating")
//Generez un Sequeance number pentru a retine ultima valoare din baza de date
@SequenceGenerator(name = "rating_seq",initialValue = 2, allocationSize = 1000)
//Generez Getter si setters cu adnotarea lomboc, fara sa fiu nevoit sa le declar separat.
@Data
public class Rating {
    //Indica ca e chiere primara
    @Id
    //Indic bazei de date ca generez valorile si sequence numberul generat mai sus
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rating_seq")
    @Column(name = "id_rating")
    private Integer id;
    @Column(name = "acordare_nota")
    private String nota;

    @ManyToOne
    private Filme filme;


}
