package com.coco.cocomoappserver.Food.dto;

import com.coco.cocomoappserver.Food.entity.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RecipeResponseDto {

    private String recipename;
    private String main;
    private String sub1;
    private String sub2;
    private String sub3;
    private String recipeLink;

    public RecipeResponseDto(Recipe entity){
        this.recipename = entity.getRecipename();
        this.main = entity.getMain();
        this.sub1 = entity.getSub1();
        this.sub2 = entity.getSub2();
        this.sub3 = entity.getSub3();
        this.recipeLink = entity.getRecipeLink();

    }
}
