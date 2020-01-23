package ke.co.gitata.ibake.model;

import java.util.ArrayList;

public class RecipeEntity {
    private int id;
    private String name;
    private String description;
    private int time;
    private double calories;
    private String difficulty;
    private ArrayList<String> ingredients;
    private ArrayList<String> nutrition;

    public RecipeEntity() {
    }

    public RecipeEntity(int id, String name, String description, int time, double calories, String difficulty, ArrayList<String> ingredients, ArrayList<String> nutrition) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.time = time;
        this.calories = calories;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
        this.nutrition = nutrition;
    }

    public RecipeEntity(String name, String description, int time, double calories, String difficulty, ArrayList<String> ingredients, ArrayList<String> nutrition) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.calories = calories;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
        this.nutrition = nutrition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getNutrition() {
        return nutrition;
    }

    public void setNutrition(ArrayList<String> nutrition) {
        this.nutrition = nutrition;
    }

    @Override
    public String toString() {
        return "RecipeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", time=" + time +
                ", calories=" + calories +
                ", difficulty='" + difficulty + '\'' +
                ", ingredients=" + ingredients +
                ", nutrition=" + nutrition +
                '}';
    }
}
