package ke.co.gitata.ibake;

import android.content.Context;
import android.util.Log;

import androidx.room.Room;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import ke.co.gitata.ibake.database.AppDatabase;
import ke.co.gitata.ibake.database.RecipeDao;
import ke.co.gitata.ibake.database.RecipeEntity;
import ke.co.gitata.ibake.utilities.SampleData;

@RunWith(AndroidJUnit4.class)
public class DatabaseTest {
    public static final String TAG = "Junit";
    private AppDatabase mDb;
    private RecipeDao mDao;

    @Before
    public void createDb() {
        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        mDb = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        mDao = mDb.recipeDao();
        Log.i(TAG, "createDb");
    }

    @After
    public void closeDb() {
        mDb.close();
        Log.i(TAG, "closeDb");
    }

    @Test
    public void createAndRetrieveNotes() {
        mDao.insertAll(SampleData.getRecipes());
        int count = mDao.getCount();
        Log.i(TAG, "createAndRetrieveNotes: count = " + count);
        assertEquals(SampleData.getRecipes().size(), count);
    }

    @Test
    public void compareStrings() {
        mDao.insertAll(SampleData.getRecipes());
        RecipeEntity original = SampleData.getRecipes().get(0);
        RecipeEntity fromDb = mDao.getRecipeById(1);
        assertEquals(original.getName(), fromDb.getName());
        assertEquals(1, fromDb.getId());
    }
}
