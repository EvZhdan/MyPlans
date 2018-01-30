package ru.drivermql.myaffairs;

import android.app.Activity;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by dkmngkfj on 27.01.2018.
 */

public class Ads {
    public static void showBanner(final Activity activity){
        final AdView banner = (AdView) activity.findViewById(R.id.banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        banner.loadAd(adRequest);

        banner.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                setupContentViewPadding(activity,banner.getHeight());
            }
        });
    }

    public static void setupContentViewPadding(Activity activity, int padding){
        View view = activity.findViewById(R.id.coordinator);
        view.setPadding(view.getPaddingLeft(),view.getPaddingTop(),view.getPaddingRight(),padding);
    }
}
