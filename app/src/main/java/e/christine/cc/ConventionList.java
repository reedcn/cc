package e.christine.cc;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Christine on 7/1/2018.
 */

public class ConventionList extends ArrayAdapter<Convention> {

    private Activity context;
    private List<Convention> conventionList;

        public ConventionList(Activity context, List<Convention> conventionList){
            super(context, R.layout.list_layout, conventionList);
            this.context = context;
            this.conventionList = conventionList;
        }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);

        TextView TVName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView TVLocation = (TextView) listViewItem.findViewById(R.id.textViewLocation);

        Convention convention = conventionList.get(position);
        TVName.setText(convention.getConventionName());
        TVLocation.setText(convention.getConventionCity());

        return listViewItem;
    }
}
