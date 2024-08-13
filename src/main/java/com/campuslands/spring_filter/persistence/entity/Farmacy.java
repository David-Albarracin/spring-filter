package com.campuslands.spring_filter.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name="farmacy")
public class Farmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfarmacy")
    Long idfarmacy;

    String namefarmacy;

    String addressfarmacy;

    @Column(name= "longfarmacy")
    Long longfarmacy;

    Long latfarmacy;

    @ManyToOne
    @JoinColumn(name = "codecity")
    @JsonBackReference
    private City codecityfarm;
    

    String logofarmacy;



}