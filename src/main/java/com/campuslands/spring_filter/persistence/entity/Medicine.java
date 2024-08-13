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
@Table(name="medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    String proceeding;

    String namemedicine;

    String healthregister;

    String description;

    String descriptionShort;
    
    String namerol;

    @ManyToOne
    @JoinColumn(name = "codemodeadmin")
    @JsonBackReference
    private ModeAdministration codemodeadmin;

    @ManyToOne
    @JoinColumn(name = "codeum")
    @JsonBackReference
    private UnitMeasurement codeum;

    @ManyToOne
    @JoinColumn(name = "codelab")
    @JsonBackReference
    private Laboratory codelab;

    @ManyToOne
    @JoinColumn(name = "codeap")
    @JsonBackReference
    private ActivePrinciple codeap;

}