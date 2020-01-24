package ke.co.gitata.ibake;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ke.co.gitata.ibake.model.RecipeEntity;
import ke.co.gitata.ibake.ui.RecipesAdapter;
import ke.co.gitata.ibake.utilities.SampleData;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.my_recycler_view)
    RecyclerView mRecyclerView;
    @OnClick(R.id.tv_display_name)
    void onDispNameClickHandler() {
        Intent intent = new Intent(this, RecipeDetailsActivity.class);
        startActivity(intent);
    }

    private List<RecipeEntity> recipeData = new ArrayList<>();
    private RecipesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);

        ButterKnife.bind(this);
        initRecyclerView();

        recipeData.addAll(SampleData.getRecipes());
        for (RecipeEntity recipe : recipeData) {
            Log.i("iBake", recipe.toString());
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    private void initRecyclerView() {
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mAdapter = new RecipesAdapter(recipeData, this);
        mRecyclerView.setAdapter(mAdapter);

    }
}
