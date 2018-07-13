package e.christine.cc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christine on 7/1/2018.
 */

public class ConResults extends AppCompatActivity {

        //DatabaseReference databaseConventions;
        ListView listViewConventions;
        List<Convention> conventionList;



    //private DatabaseReference databaseConventions = FirebaseDatabase.getInstance().getReference("Convention");

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        listViewConventions = (ListView) findViewById(R.id.listViewConventions);
        //conventionList = new ArrayList<>();

        //databaseConventions.addValueEventListener(new ValueEventListener() {
           /* @Override
           public void onDataChange(DataSnapshot dataSnapshot) {
            conventionList.clear();
                for (DataSnapshot conventionSnapshot: dataSnapshot.getChildren()){
                    Convention convention = conventionSnapshot.getValue(Convention.class);
                    conventionList.add(convention);
                }

                ConventionList adapter = new ConventionList(ConResults.this, conventionList);
                listViewConventions.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

*/
        setContentView(R.layout.con_results);
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//
//        databaseConventions.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                conventionList.clear();
//                for (DataSnapshot conventionSnapshot: dataSnapshot.getChildren()){
//                    Convention convention = conventionSnapshot.getValue(Convention.class);
//                    conventionList.add(convention);
//                }
//
//                ConventionList adapter = new ConventionList(ConResults.this, conventionList);
//                listViewConventions.setAdapter(adapter);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//    }

    public void onNewCon(View v) {

        Intent intent = new Intent(this, AddNewCon.class);
        startActivity(intent);
    }
}
