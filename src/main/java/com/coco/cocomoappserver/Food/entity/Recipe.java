package com.coco.cocomoappserver.Food.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Recipe {
    @Id
    @Column(nullable = false)
    private String Recipename;

    @Column(nullable = false)
    private String Main;

    @Column
    private String sub1;

    @Column
    private String sub2;

    @Column
    private String sub3;

    @Column
    private String RecipeLink;




}
