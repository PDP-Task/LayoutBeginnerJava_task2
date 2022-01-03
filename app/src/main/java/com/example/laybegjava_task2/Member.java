package com.example.laybegjava_task2;

import android.os.Parcel;
import android.os.Parcelable;

public class Member implements Parcelable {

    String language;

    public Member(String language) {
        this.language = language;
    }

    protected Member(Parcel in) {
        language = in.readString();
    }

    public static final Creator<Member> CREATOR = new Creator<Member>() {
        @Override
        public Member createFromParcel(Parcel in) {
            return new Member(in);
        }

        @Override
        public Member[] newArray(int size) {
            return new Member[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(language);
    }

    @Override
    public String toString() {
        return "Member{" +
                "language='" + language + '\'' +
                '}';
    }
}
