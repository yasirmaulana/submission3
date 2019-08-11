package id.atsiri.mymoviecatalogue;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

//public class TvShowItems implements Parcelable {
public class TvShowItems {

    private int id;
    private String backdropPath, voteAverage, title, firstAirDate;

    TvShowItems() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBackdropPath() {
        String sbackdropPath = "https://image.tmdb.org/t/p/w342" + backdropPath;
        return sbackdropPath;
//        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public void setFirstAirDate(String firstAirDate) {
        this.firstAirDate = firstAirDate;
    }

    TvShowItems(JSONObject object) {
        try {
            int id = object.getInt("id");
            String backdropPath = object.getString("backdrop_path");
            String voteAverage = object.getString("vote_average");
            String title = object.getString("name");
            String firstAirDate = object.getString("first_air_date");

            this.id = id;
            this.backdropPath = backdropPath;
            this.voteAverage = voteAverage;
            this.title = title;
            this.firstAirDate = firstAirDate;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
