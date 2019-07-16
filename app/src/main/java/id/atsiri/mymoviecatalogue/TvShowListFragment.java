package id.atsiri.mymoviecatalogue;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowListFragment extends Fragment  {
    private RecyclerView rvTvShows;

    public TvShowListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tv_show_list, container, false);

        rvTvShows = view.findViewById(R.id.rv_tvshow);

//        ListAdapter listAdapter = new TvShowsAdapter();
//        rvTvShows.setAdapter(listAdapter);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        rvTvShows.setLayoutManager(layoutManager);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
