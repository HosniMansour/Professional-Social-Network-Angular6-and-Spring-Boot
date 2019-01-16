package com.tn.isamm.linkedin.entity;
// Generated Oct 21, 2018 10:21:03 AM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.*;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;


/**
 * Publication generated by hbm2java
 */
@Entity
@Table(name="publication"
    ,catalog="linkedin2"
)
public class Publication  implements java.io.Serializable {


     private Integer id;
     private Utilisateur utilisateur;
     private String contenu;
     private Date date;
     private String fichier;
     private Set<JAime> JAimes = new HashSet<JAime>(0);

    public Publication() {
    }


    public Publication(Integer id, Utilisateur utilisateur, String contenu, Date date, String fichier) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.contenu = contenu;
        this.date = date;
        this.fichier = fichier;
    }

    public Publication(Integer id, Utilisateur utilisateur, String contenu, Date date, String fichier, Set<JAime> JAimes) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.contenu = contenu;
        this.date = date;
        this.fichier = fichier;
        this.JAimes = JAimes;
    }

    @Id
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_utilisateur", nullable=false)
    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }
    
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date", length=19, updatable=false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name="fichier", nullable=false, length=300)
    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    @Column(name="contenu", nullable=false, length=10000)
    public String getContenu() {
        return this.contenu;
    }
    
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="publication")
    public Set<JAime> getJAimes() {
        return this.JAimes;
    }
    
    public void setJAimes(Set<JAime> JAimes) {
        this.JAimes = JAimes;
    }




}

