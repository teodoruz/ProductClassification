package com.example.ProdValid.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Produtos")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo do produto")
    private Long Id;
    @Column(name = "Rótulo")
    private String tittle;
    @Column(name = "preço")
    private Double price;
    @Column(name = "numero de estrelas")
    private Double numberStars;
    @Column(name = "classificação")
    @Enumerated(EnumType.STRING)
    private ProductType classfication;

    public Product(ProductDTO productDTO) {
    }
}
