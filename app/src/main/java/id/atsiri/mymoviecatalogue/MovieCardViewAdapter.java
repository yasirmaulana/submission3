package id.atsiri.mymoviecatalogue;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MovieCardViewAdapter extends RecyclerView.Adapter<MovieCardViewAdapter.ListViewHolder> {
    private ArrayList<Movie> movieList;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public MovieCardViewAdapter(ArrayList<Movie> list) {
        this.movieList = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_movie, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Movie movie = movieList.get(position);

        Glide.with(holder.itemView.getContext())
                .load(movie.getBanner())
                .into(holder.imgPhoto);

        holder.tvName.setText(movie.getName());
        holder.tvMovieDate.setText(movie.getMovieDate());
        holder.tvMovieScore.setText(movie.getScore());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(movieList.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvMovieDate, tvMovieScore;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_photo);
            tvName = itemView.findViewById(R.id.tv_tittle);
            tvMovieDate = itemView.findViewById(R.id.tv_movie_date);
            tvMovieScore = itemView.findViewById(R.id.tv_user_score);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Movie data);
    }
}
