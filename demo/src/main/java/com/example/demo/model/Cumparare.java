package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

//Adnotari mapare
@Entity
//Se face maparea
@Table(name = "cumparare_bilet")
//Generez un Sequeance number pentru a retine ultima valoare din baza de date
@SequenceGenerator(name = "cump_seq",initialValue = 2, allocationSize = 1000)
//Generez Getter si setters cu adnotarea lomboc, fara sa fiu nevoit sa le declar separat.
@Data
public class Cumparare {
    //Indica ca e chiere primara
    @Id
    //Indic bazei de date ca generez valorile si sequence numberul generat mai sus
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cump_seq")
    @Column(name = "id_cumparare_bilet")
    private Integer id;
    @Column(name = "nr_de_bilete")
    private Integer nr_bilete;
    @Column(name = "pret")
    private Integer pret;

    @ManyToOne
    private Rezervare rezervare;


}
