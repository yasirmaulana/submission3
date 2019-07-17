package id.atsiri.mymoviecatalogue;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MovieListFragment extends Fragment implements View.OnClickListener {
    private RecyclerView rvMovies;
    private ArrayList<Movie> list = new ArrayList<>();

    public MovieListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_movie_list, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvMovies = view.findViewById(R.id.rv_movie);
        rvMovies.setHasFixedSize(true);

        list.addAll(MoviesData.getListData());
        showRecyclerList();

    }

    private void showSelectedMovie(Movie movie) {
        Toast.makeText(getActivity(), "title " + movie.getName(), Toast.LENGTH_SHORT).show();

        Intent movieDetail = new Intent(getActivity(), MovieDetailActivity.class);
        movieDetail.putExtra(MovieDetailActivity.EXTRA_MOVIE, movie);
        startActivity(movieDetail);

    }

    private void showRecyclerList() {
        rvMovies.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        MovieListAdapter movieListAdapter = new MovieListAdapter(list);
        rvMovies.setAdapter(movieListAdapter);

        movieListAdapter.setOnItemClickCallback(new MovieListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Movie data) {
                showSelectedMovie(data);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
