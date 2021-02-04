package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

//Adnotari mapare
@Entity
//Se face maparea
@Table(name = "rezervare_loc")
//Generez un Sequeance number pentru a retine ultima valoare din baza de date
@SequenceGenerator(name = "rez_seq",initialValue = 2, allocationSize = 1000)
//Generez Getter si setters cu adnotarea lomboc, fara sa fiu nevoit sa le declar separat.
@Data
public class Rezervare {
    //Indica ca e chiere primara
    @Id
    //Indic bazei de date ca generez valorile si sequence numberul generat mai sus
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rez_seq")
    @Column(name = "id_rezervare_loc")
    private Integer id;
    @Column(name = "locuri")
    private Integer locuri;

    @ManyToOne
    private User user;

    @ManyToOne
    private Filme filme;


}
