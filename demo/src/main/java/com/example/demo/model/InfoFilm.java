package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

//Adnotari mapare
@Entity
//Se face maparea
@Table(name = "info_film")
//Generez un Sequeance number pentru a retine ultima valoare din baza de date
@SequenceGenerator(name = "info_seq",initialValue = 2, allocationSize = 1000)
//Generez Getter si setters cu adnotarea lomboc, fara sa fiu nevoit sa le declar separat.
@Data
public class InfoFilm {
    //Indica ca e chiere primara
    @Id
    //Indic bazei de date ca generez valorile si sequence numberul generat mai sus
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "info_seq")
    @Column(name = "id_info_film")
    private Integer id;
    @Column(name = "descriere")
    private String descriere;
    @Column(name = "an_aparitie")
    private String an;
    @Column(name = "durata")
    private String durata;
    @Column(name = "gen_film")
    private String gen;
    @Column(name = "actori")
    private String actori;


}
