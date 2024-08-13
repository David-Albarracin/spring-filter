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
@Table(name="city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "codecity")
    String codecity;

    String namecity;

    @ManyToOne
    @JoinColumn(name = "codereg")
    @JsonBackReference
    private Region codereg;


}
