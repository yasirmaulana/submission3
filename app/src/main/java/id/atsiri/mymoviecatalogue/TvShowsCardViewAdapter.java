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

public class TvShowsCardViewAdapter extends RecyclerView.Adapter<TvShowsCardViewAdapter.CardViewViewHolder> {
    private ArrayList<TvShow> listTvShow;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public TvShowsCardViewAdapter(ArrayList<TvShow> list) {
        this.listTvShow = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_tvshow, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        TvShow tvShow = listTvShow.get(position);

        Glide.with(holder.itemView.getContext())
                .load(tvShow.getBanner())
                .into(holder.imgBanner);
        holder.tvTitle.setText(tvShow.getTitle());
        holder.tvUserScore.setText(tvShow.getUserScore());
        holder.tvTvShowDate.setText(tvShow.getTvShowDate());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listTvShow.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listTvShow.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBanner;
        TextView tvTitle, tvUserScore, tvTvShowDate;

        CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBanner = itemView.findViewById(R.id.img_banner_tvshow);
            tvTitle = itemView.findViewById(R.id.tv_title_tvshow);
            tvUserScore = itemView.findViewById(R.id.tv_user_score_tvshow);
            tvTvShowDate = itemView.findViewById(R.id.tv_tvshow_date);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(TvShow data);
    }
}
