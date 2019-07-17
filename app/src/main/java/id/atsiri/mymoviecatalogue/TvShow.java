package id.atsiri.mymoviecatalogue;

import android.os.Parcel;
import android.os.Parcelable;

public class TvShow implements Parcelable {
    private String photo, banner, title, userScore, tvShowDate, overview;


    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserScore() {
        return userScore;
    }

    public void setUserScore(String userScore) {
        this.userScore = userScore;
    }

    public String getTvShowDate() {
        return tvShowDate;
    }

    public void setTvShowDate(String tvShowDate) {
        this.tvShowDate = tvShowDate;
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
        dest.writeString(this.photo);
        dest.writeString(this.banner);
        dest.writeString(this.title);
        dest.writeString(this.userScore);
        dest.writeString(this.tvShowDate);
        dest.writeString(this.overview);
    }

    TvShow() {
    }

    private TvShow(Parcel in) {
        photo = in.readString();
        banner = in.readString();
        title = in.readString();
        userScore = in.readString();
        tvShowDate = in.readString();
        overview = in.readString();
    }

    public static final Parcelable.Creator<TvShow> CREATOR = new Parcelable.Creator<TvShow>() {
        @Override
        public TvShow createFromParcel(Parcel in) {
            return new TvShow(in);
        }

        @Override
        public TvShow[] newArray(int size) {
            return new TvShow[size];
        }
    };

}
