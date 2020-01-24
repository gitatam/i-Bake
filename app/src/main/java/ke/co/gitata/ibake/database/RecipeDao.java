package ke.co.gitata.ibake.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RecipeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertRecipe(RecipeEntity recipeEntity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<RecipeEntity> recipes);

    @Delete
    void deleteRecipe(RecipeEntity recipeEntity);

    @Query("SELECT * FROM recipes WHERE id = :id")
    RecipeEntity getRecipeById(int id);

    @Query("SELECT * FROM recipes ORDER BY name ASC")
    LiveData<List<RecipeEntity>> getAll();

    @Query("DELETE FROM recipes")
    int deleteAll();

    @Query("SELECT COUNT(*) FROM recipes")
    int getCount();


}
