package id.atsiri.mymoviecatalogue;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    private String banner;
    private String poster;
    private String name;
    private String score;
    private String movieDate;
    private String overview;

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.poster);
        dest.writeString(this.banner);
        dest.writeString(this.name);
        dest.writeString(this.score);
        dest.writeString(this.movieDate);
        dest.writeString(this.overview);
    }

    Movie() {
    }

    private Movie(Parcel in) {
        this.poster = in.readString();
        this.banner = in.readString();
        this.name = in.readString();
        this.score = in.readString();
        this.movieDate = in.readString();
        this.overview = in.readString();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

}
