package id.atsiri.mymoviecatalogue;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private int poster;
    private int photo;
    private String name;
    private String score;
    private String movieDate;
    private String overview;

    public int getPoster() { return poster; }
    public void setPoster(int poster) { this.poster = poster; }

    public int getPhoto() {
        return photo;
    }
    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getScore() { return score; }
    public void setScore(String score) { this.score = score; }

    public String getMovieDate() { return movieDate; }
    public void setMovieDate(String movieDate) { this.movieDate = movieDate; }

    public String getOverview() { return overview; }
    public void setOverview(String overview) { this.overview = overview; }

    public Movie() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.poster);
        dest.writeInt(this.photo);
        dest.writeString(this.name);
        dest.writeString(this.score);
        dest.writeString(this.movieDate);
        dest.writeString(this.overview);
    }

    protected Movie(Parcel in) {
        this.poster = in.readInt();
        this.photo = in.readInt();
        this.name = in.readString();
        this.score = in.readString();
        this.movieDate = in.readString();
        this.overview = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
