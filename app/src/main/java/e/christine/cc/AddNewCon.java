package e.christine.cc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Christine on 7/1/2018.
 */

public class AddNewCon extends AppCompatActivity {

    boolean flag = true;
    EditText conNameField2;
    EditText conCityField2;
    Spinner spinner;
    private DatabaseReference databaseConventions = FirebaseDatabase.getInstance().getReference("Convention");

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_new_con);

        conNameField2 = (EditText) findViewById(R.id.conName2);
        conCityField2 = (EditText) findViewById(R.id.conCity2);


        spinner = (Spinner) findViewById(R.id.stateSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.states_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


    }

    private void addConvention(){
        String cNameText = conNameField2.getText().toString().trim();
        String cCityText= conCityField2.getText().toString().trim();
        String cStateText = spinner.getSelectedItem().toString();

        if(TextUtils.isEmpty(cNameText) || TextUtils.isEmpty(cCityText)) {
            Toast.makeText(this, "No name or city entered", Toast.LENGTH_LONG).show();
        } else {
            String id = databaseConventions.push().getKey();
            Convention convention = new Convention(id, cNameText, cCityText, cStateText);
            databaseConventions.child(id).setValue(convention);
            Toast.makeText(this, "Convention added", Toast.LENGTH_LONG).show();
        }

    }

    public void onAddCon(View v) {
            addConvention();
            Intent intent = new Intent(this, ConResults.class);
            startActivity(intent);
    }
}
