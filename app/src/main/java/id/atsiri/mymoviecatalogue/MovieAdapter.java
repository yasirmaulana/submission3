package id.atsiri.mymoviecatalogue;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Movie> movies;

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    MovieAdapter(Context context) {
        this.context = context;
        movies = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int i) {
        return movies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_movie, viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        Movie movie = (Movie) getItem(i);
        viewHolder.bind(movie);
        return view;
    }

    private class ViewHolder {
        private ImageView imgPhoto;
        private TextView tvTittle;
        private TextView tvMovieDate;
        private TextView tvScore;

        ViewHolder(View view) {
            imgPhoto = view.findViewById(R.id.img_photo);
            tvTittle = view.findViewById(R.id.tv_tittle);
            tvMovieDate = view.findViewById(R.id.tv_movie_date);
            tvScore = view.findViewById(R.id.tv_user_score);
        }

        void bind(Movie movie) {
            imgPhoto.setImageResource(movie.getPhoto());
            tvTittle.setText(movie.getName());
            tvMovieDate.setText(movie.getMovieDate());
            tvScore.setText(movie.getScore());
        }
    }
}
