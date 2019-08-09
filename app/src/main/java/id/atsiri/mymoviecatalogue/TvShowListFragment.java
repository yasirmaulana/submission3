package id.atsiri.mymoviecatalogue;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.atsiri.mymoviecatalogue.adapter.TvShowsAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowListFragment extends Fragment implements View.OnClickListener {
    private RecyclerView rvTvShows;
    private ArrayList<TvShow> list = new ArrayList<>();

    public TvShowListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_tv_show_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvTvShows = view.findViewById(R.id.rv_tvshow);
        rvTvShows.setHasFixedSize(true);

        list.addAll(TvShowsData.getListData());
        showRecyclerList();
    }

    private void showSelectedTvShow(TvShow tvShow) {
        Intent tvShowDetail = new Intent(getActivity(), TvShowDetailActivity.class);
        tvShowDetail.putExtra(TvShowDetailActivity.EXTRA_TVSHOW, tvShow);
        startActivity(tvShowDetail);
    }

    private void showRecyclerList() {
        rvTvShows.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        TvShowsAdapter tvShowsCardViewAdapter = new TvShowsAdapter(list);
        rvTvShows.setAdapter(tvShowsCardViewAdapter);

        tvShowsCardViewAdapter.setOnItemClickCallback(new TvShowsAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(TvShow data) {
                showSelectedTvShow(data);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
