package first.quizemaine.com.fragmentexample;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements  CourseFragmentCoordinator{

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    @Override
    public void onSelectedCourseChanged(int index) {


        android.app.FragmentManager fragmentManger=getFragmentManager();

        CourceDescription courseDescriptionFrag=(CourceDescription)fragmentManger.findFragmentById(R.id.course_description);

        courseDescriptionFrag.setDisplayDescription(index);


    }
}
