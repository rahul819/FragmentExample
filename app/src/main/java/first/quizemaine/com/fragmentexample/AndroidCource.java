package first.quizemaine.com.fragmentexample;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import java.util.zip.Inflater;

/**
 * Created by rahul on 6/5/2016.
 */
public class AndroidCource extends Fragment implements View.OnClickListener {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.android_cource,container,false);


        setupClickListeners(view);

        return view;

    }


    private  void setupClickListeners(View view)
    {
      setupClickListner(view,R.id.radioButton);
        setupClickListner(view,R.id.radioButton2);
        setupClickListner(view,R.id.radioButton3);
        setupClickListner(view,R.id.radioButton4);


    }



    private  void setupClickListner(View view,int childViewInt)
    {
        View childView=view.findViewById(childViewInt);

        childView.setOnClickListener(this);

    }


    int translateIdToIndex(int id)
    {
        int index=0;

        switch (id)
        {
            case R.id.radioButton:
        {
            index=0;
            break;
        }
            case R.id.radioButton2:
            {
                index=1;
                break;
            }
            case R.id.radioButton3:
            {
                index=2;
                break;
            }
            case R.id.radioButton4:
            {
                index=3;
                break;
            }


        }


        return index;
    }


    @Override
    public void onClick(View v) {

       int id=v.getId();



    int index=translateIdToIndex(id);

        Activity thActivity=getActivity();

        MainActivity main= (MainActivity) thActivity;

        //CourseFragmentCoordinator coordinator=(CourseFragmentCoordinator)thActivity;
        main.onSelectedCourseChanged(index);



    }
}
