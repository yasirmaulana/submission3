package id.atsiri.mymoviecatalogue.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import id.atsiri.mymoviecatalogue.MovieItems;
import id.atsiri.mymoviecatalogue.R;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private ArrayList<MovieItems> mData = new ArrayList<>();

//    private OnItemClickCallback onItemClickCallback;
//
//    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
//        this.onItemClickCallback = onItemClickCallback;
//    }

//    public MovieAdapter(ArrayList<MovieItems> list) {
//        this.movieList = list;
//    }

    public void setData(ArrayList<MovieItems> items) {
        mData.clear();
        mData.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
//        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_items, viewGroup, false);
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_movie, viewGroup, false);
        return new MovieViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder movieViewHolder, int position) {
        movieViewHolder.bind(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

//    class ListViewHolder extends RecyclerView.ViewHolder {
//        ImageView imgPhoto;
//        TextView tvName, tvMovieDate, tvMovieScore;
//
//        ListViewHolder(View itemView) {
//            super(itemView);
//            imgPhoto = itemView.findViewById(R.id.img_photo);
//            tvName = itemView.findViewById(R.id.tv_tittle);
//            tvMovieDate = itemView.findViewById(R.id.tv_movie_date);
//            tvMovieScore = itemView.findViewById(R.id.tv_user_score);
//        }
//    }


//    @Override
//    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
//        MovieItems movie = movieList.get(position);
//
//        Glide.with(holder.itemView.getContext())
//                .load(movie.getBanner())
//                .into(holder.imgPhoto);
//
//        holder.tvName.setText(movie.getName());
//        holder.tvMovieDate.setText(movie.getMovieDate());
//        holder.tvMovieScore.setText(movie.getScore());
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onItemClickCallback.onItemClicked(movieList.get(holder.getAdapterPosition()));
//            }
//        });
//
//    }

    class MovieViewHolder extends RecyclerView.ViewHolder {
        ImageView ivBackdropPath;
        TextView textViewVoteAverage;
        TextView textViewTitle;
        TextView textViewReleaseDate;

        MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            ivBackdropPath = itemView.findViewById(R.id.img_photo);
            textViewVoteAverage = itemView.findViewById(R.id.tv_user_score);
            textViewTitle = itemView.findViewById(R.id.tv_title);
            textViewReleaseDate = itemView.findViewById(R.id.tv_movie_date);
        }

        void bind(MovieItems movieItems) {
            textViewVoteAverage.setText(movieItems.getVoteAvarage());
            textViewTitle.setText(movieItems.getTitle());
            textViewReleaseDate.setText(movieItems.getReleaseDate());

            Glide.with(itemView.getContext())
                    .load(movieItems.getBackdropPath())
                    .into(ivBackdropPath);

        }

    }

//    public interface OnItemClickCallback {
//        void onItemClicked(MovieItems data);
//    }

}
