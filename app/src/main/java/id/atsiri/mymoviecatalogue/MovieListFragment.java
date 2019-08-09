package id.atsiri.mymoviecatalogue;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.ArrayList;

import id.atsiri.mymoviecatalogue.adapter.MovieAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
//public class MovieListFragment extends Fragment implements View.OnClickListener {
public class MovieListFragment extends Fragment {

    private MovieAdapter adapter;
    private ProgressBar progressBar;
    private MovieViewModel movieViewModel;

//    private RecyclerView rvMovies;
//    private ArrayList<MovieItems> list = new ArrayList<>();

    public MovieListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_movie_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        rvMovies = view.findViewById(R.id.rv_movie);
//        rvMovies.setHasFixedSize(true);
//
//        list.addAll(MoviesData.getListData());
//        showRecyclerList();

        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        movieViewModel.getMovies().observe(this, getMovie);

        adapter = new MovieAdapter();
        adapter.notifyDataSetChanged();

        RecyclerView recyclerView = view.findViewById(R.id.rv_movie);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(adapter);

        progressBar = view.findViewById(R.id.progressBar);

        movieViewModel.setMovie();
        showLoading(true);
    }

    private Observer<ArrayList<MovieItems>> getMovie = new Observer<ArrayList<MovieItems>>() {
        @Override
        public void onChanged(@Nullable ArrayList<MovieItems> movieItems) {
            if (movieItems != null) {
                adapter.setData(movieItems);
                showLoading(false);
            }
        }
    };

    View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            movieViewModel.setMovie();
            showLoading(true);
        }
    };

    private void showLoading(Boolean state) {
        if (state) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }

//    private void showSelectedMovie(MovieItems movie) {
//        Intent movieDetail = new Intent(getActivity(), MovieDetailActivity.class);
//        movieDetail.putExtra(MovieDetailActivity.EXTRA_MOVIE, movie);
//        startActivity(movieDetail);
//    }

//    private void showRecyclerList() {
//        rvMovies.setLayoutManager(new LinearLayoutManager(this.getActivity()));
//        MovieAdapter movieCardViewAdapter = new MovieAdapter(list);
//        rvMovies.setAdapter(movieCardViewAdapter);
//
//        movieCardViewAdapter.setOnItemClickCallback(new MovieAdapter.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(MovieItems data) {
//                showSelectedMovie(data);
//            }
//        });
//    }

//    @Override
//    public void onClick(View v) { }

}
