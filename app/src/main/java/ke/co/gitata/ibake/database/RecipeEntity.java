package ke.co.gitata.ibake.database;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "recipes")
public class RecipeEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String description;
    private int time;
    private double calories;
    private String difficulty;
    private List<String> ingredients;
    private List<String> instructions;
    private List<String> nutrition;

    @Ignore
    public RecipeEntity() {

    }

    @Ignore
    public RecipeEntity(String name, String description, int time, double calories, String difficulty, List<String> ingredients, List<String> instructions, List<String> nutrition) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.calories = calories;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.nutrition = nutrition;
    }


    public RecipeEntity(int id, String name, String description, int time, double calories, String difficulty, List<String> ingredients, List<String> instructions, List<String> nutrition) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.time = time;
        this.calories = calories;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
        this.instructions = instructions;
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

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

    public List<String> getNutrition() {
        return nutrition;
    }

    public void setNutrition(List<String> nutrition) {
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
                ", instructions=" + instructions +
                ", nutrition=" + nutrition +
                '}';
    }
}