package id.atsiri.mymoviecatalogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MovieDetail extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";
    ImageView imgPhotoDetail;
    TextView tvTittle;
    TextView tvOverview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        imgPhotoDetail = findViewById(R.id.img_photo_detail);
        tvTittle = findViewById(R.id.txt_name_detail);
        tvOverview = findViewById(R.id.txt_description_detail);

        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
        Glide.with(this).load(movie.getPhoto()).into(imgPhotoDetail);
        tvTittle.setText(movie.getName());
        tvOverview.setText(movie.getDescription());
    }
}
