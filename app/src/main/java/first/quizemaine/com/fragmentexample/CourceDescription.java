package first.quizemaine.com.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rahul on 6/5/2016.
 */
public class CourceDescription extends Fragment {


    TextView courceDescription;
    int defaultIndex=0;


    String cource_content[]={"Learn Android","Learn UI Component","Learn View Group","Learn Fragment"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.cource_description,container,false);

        courceDescription=(TextView)view.findViewById(R.id.textView);

          setDisplayDescription(0);


        return view;
    }


    public void setDisplayDescription(int courseIndex)
    {


        courceDescription.setText(cource_content[courseIndex]);

    }
}
