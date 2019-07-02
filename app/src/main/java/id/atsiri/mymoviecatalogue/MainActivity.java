package id.atsiri.mymoviecatalogue;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TypedArray dataPoster;
    private TypedArray dataPhoto;
    private String[] dataName;
    private String[] dataMovieDate;
    private String[] dataScore;
    private String[] dataOverview;
    private MovieAdapter adapter;
    private ArrayList<Movie> movies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MovieAdapter(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, movies.get(i).getName(), Toast.LENGTH_SHORT).show();

                Intent movieDetail = new Intent(MainActivity.this, MovieDetail.class);
                movieDetail.putExtra(MovieDetail.EXTRA_MOVIE, movies.get(i));
                startActivity(movieDetail);
            }
        });
    }

    private void prepare() {
        dataPoster = getResources().obtainTypedArray(R.array.data_poster);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
        dataName = getResources().getStringArray(R.array.data_name);
        dataMovieDate = getResources().getStringArray(R.array.data_moviedate);
        dataScore = getResources().getStringArray(R.array.data_score);
        dataOverview = getResources().getStringArray(R.array.data_overview);
    }

    private void addItem() {
        movies = new ArrayList<>();

        for (int i = 0; i < dataName.length; i++) {
            Movie movie = new Movie();
            movie.setPoster(dataPoster.getResourceId(i, -1));
            movie.setPhoto(dataPhoto.getResourceId(i, -1));
            movie.setName(dataName[i]);
            movie.setMovieDate(dataMovieDate[i]);
            movie.setScore(dataScore[i]);
            movie.setOverview(dataOverview[i]);
            movies.add(movie);
        }
        adapter.setMovies(movies);
    }


}
