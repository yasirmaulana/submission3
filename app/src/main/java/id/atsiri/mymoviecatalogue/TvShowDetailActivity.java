package id.atsiri.mymoviecatalogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class TvShowDetailActivity extends AppCompatActivity {
    public static final String EXTRA_TVSHOW = "extra_tvshow";
    ImageView imgTsPosterDetail, imgTsPhotoDetail;
    TextView tvTsTitleDetail, tvTsUserScoreDetail, tvTsOverviewDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_show_detail);

        imgTsPosterDetail = findViewById(R.id.img_tvshow_poster_detail);
        imgTsPhotoDetail = findViewById(R.id.img_tvshow_photo_detail);
        tvTsTitleDetail = findViewById(R.id.tv_tvshow_title_detail);
        tvTsUserScoreDetail = findViewById(R.id.tv_tvshow_userscore_detail);
        tvTsOverviewDetail = findViewById(R.id.tv_tvshow_overview);

//        TvShowItems tvShowItems = getIntent().getParcelableExtra(EXTRA_TVSHOW);
//        Glide.with(this).load(tvShowItems.getBanner()).into(imgTsPosterDetail);
//        Glide.with(this).load(tvShowItems.getPhoto()).into(imgTsPhotoDetail);
//        tvTsTitleDetail.setText(tvShowItems.getTitle());
//        tvTsUserScoreDetail.setText(tvShowItems.getUserScore());
//        tvTsOverviewDetail.setText(tvShowItems.getOverview());
    }
}
