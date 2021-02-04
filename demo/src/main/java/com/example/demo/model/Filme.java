package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

//Adnotari mapare
@Entity
//Se face maparea
@Table(name = "filme")
//Generez un Sequeance number pentru a retine ultima valoare din baza de date
@SequenceGenerator(name = "filme_seq",initialValue = 2, allocationSize = 1000)
//Generez Getter si setters cu adnotarea lomboc, fara sa fiu nevoit sa le declar separat.
@Data
public class Filme {
    //Indica ca e chiere primara
    @Id
    //Indic bazei de date ca generez valorile si sequence numberul generat mai sus
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "filme_seq")
    @Column(name = "id_filme")
    private Integer id;
    @Column(name = "titlu_film")
    private String titlu;
    @Column(name = "gen_film")
    private String gen;

    @ManyToOne
    private InfoFilm infofilm;


}
