
package com.campuslands.spring_filter.persistence.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
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
@Table(name="customer")
public class Customer {

    @Id
    //@GeneratedValue(strategy = GenerationType.)
    @Column(name = "idcustomer")
    String idcustomer;

    String namecustomer;

    String lastnamecustomer;

    String emailcustomer;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date birthdate;

    float lon;

    float latitud;

    @ManyToOne
    @JoinColumn(name = "codecity")
    //@JsonBackReference
    private City codecitycustomer;

}
