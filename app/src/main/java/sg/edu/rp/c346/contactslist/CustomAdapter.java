package sg.edu.rp.c346.contactslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16003749 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<contact_item> contactList;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<contact_item> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.contactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCode = rowView.findViewById(R.id.textViewCode);
        TextView tvPhone = rowView.findViewById(R.id.textViewPhone);
        contact_item currentItem = contactList.get(position);
        tvName.setText(currentItem.getContact_name());
        tvCode.setText(currentItem.getContact_code());
        tvPhone.setText(String.valueOf(currentItem.getContact_phone()));
        return rowView;



    }
}
