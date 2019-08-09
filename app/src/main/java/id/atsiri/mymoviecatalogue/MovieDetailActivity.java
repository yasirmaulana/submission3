package id.atsiri.mymoviecatalogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MovieDetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";
    ImageView imgPosterDetail;
    ImageView imgPhotoDetail;
    TextView tvTittleDetail;
    TextView tvUserScoreDetail;
    TextView tvOverview;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_movie_detail);
//
//        imgPosterDetail = findViewById(R.id.img_poster_detail);
//        imgPhotoDetail = findViewById(R.id.img_photo_detail);
//        tvTittleDetail = findViewById(R.id.tv_tittle_detail);
//        tvUserScoreDetail = findViewById(R.id.tv_user_score_detail);
//        tvOverview = findViewById(R.id.tv_overview);
//
//        MovieItems movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
//        Glide.with(this).load(movie.getPoster()).into(imgPhotoDetail);
//        Glide.with(this).load(movie.getBanner()).into(imgPosterDetail);
//        tvTittleDetail.setText(movie.getName());
//        tvUserScoreDetail.setText(movie.getScore());
//        tvOverview.setText(movie.getOverview());
//    }
}
