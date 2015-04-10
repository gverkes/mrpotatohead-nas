package nl.mprog.apps.mrpotatohead;
/**
 * Created by Govert on 4/8/15.
 * Mr. Potatohead, Main Activity
 */

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends FragmentActivity {
    private final static String TAG = "mrpotatohead";

    // Create constant arrays containing ImageView IDs and CheckBox IDs
    private final static int[] IDS_IMG_FEATURES =
            {R.id.img_arms, R.id.img_ears,  R.id.img_eyebrows, R.id.img_eyes,
             R.id.img_glasses, R.id.img_hat, R.id.img_mouth, R.id.img_mustache,
             R.id.img_nose, R.id.img_shoes};
    private final static int[] IDS_CHK_FEATURES =
            {R.id.chk_arms, R.id.chk_ears,  R.id.chk_eyebrows, R.id.chk_eyes,
             R.id.chk_glasses, R.id.chk_hat, R.id.chk_mouth, R.id.chk_mustache,
             R.id.chk_nose, R.id.chk_shoes};
    public final static int NO_OF_FEATURES = IDS_IMG_FEATURES.length;

    ImageView[] imgFeatures = new ImageView[NO_OF_FEATURES];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Locate the ViewPager in activity_main.xml
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        // Set the ViewPagerAdapter into ViewPager
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

        // Initialize all ImageViews objects
        for (int i = 0; i < NO_OF_FEATURES; i++) {
            imgFeatures[i] = (ImageView) findViewById(IDS_IMG_FEATURES[i]);
        }

    }

    public void itemClicked(View v) {

        // Check which CheckBox is clicked and change visibility of corresponding ImageView
        for (int i = 0; i < NO_OF_FEATURES; i++) {
            if (v.getId() == IDS_CHK_FEATURES[i]) {
                if (((CheckBox) v).isChecked()) {
                    imgFeatures[i].setVisibility(View.VISIBLE);
                } else {
                    imgFeatures[i].setVisibility(View.INVISIBLE);
                }
                // Break out of loop when matching checkbox is found
                break;
            }
        }
    }
}
