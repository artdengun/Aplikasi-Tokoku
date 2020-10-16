package com.kpaydeveloper.belajarspring.Dao;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "m_product")
public class Product implements Serializable {

    @Id
    @GeneratedValue
    private Long productId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String description;

    @Column(nullable = false)
    private String vendor;

    @Column(nullable = false)
    private String weight;

    @Column(nullable = false)
    private String price;

}
