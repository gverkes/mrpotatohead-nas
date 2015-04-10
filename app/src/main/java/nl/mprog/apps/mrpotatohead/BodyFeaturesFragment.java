package nl.mprog.apps.mrpotatohead;

/**
 * Created by Govert on 4/8/15.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BodyFeaturesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Get the features bodyparts view
        View view = inflater.inflate(R.layout.fragment_features_bodyparts, container, false);
        return view;

    }


}