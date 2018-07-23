package sg.edu.rp.c346.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvname;
    TextView tvcode;
    TextView tvphone;
    ListView lvcontact;
    ArrayList<contact_item> alContactList;
    CustomAdapter caContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvname=findViewById(R.id.textViewName);
        tvcode=findViewById(R.id.textViewCode);
        tvphone=findViewById(R.id.textViewPhone);
        lvcontact=findViewById(R.id.listViewContact);
        alContactList = new ArrayList<>();
        contact_item contact_1 = new contact_item("Mary","+65",65442334);
        contact_item contact_2 = new contact_item("Ken","+65",97442437);
        alContactList.add(contact_1);
        alContactList.add(contact_2);
        caContact = new CustomAdapter(this,R.layout.contacts_items,alContactList);
        lvcontact.setAdapter(caContact);


    }
}
