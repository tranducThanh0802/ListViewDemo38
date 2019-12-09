package tranthanh.dmt.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<contact> Contact;
    contact Ct1,ct2,ct3,ct4;
    ListView lv1;
    adapter Ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contact=new ArrayList<>();
        lv1= findViewById(R.id.lv123);
        Ct1=new contact("Mar t",833343,"Han hoi",true);
        ct2=new contact("Mar A",833343,"Ha hoi",false);
        ct3=new contact("Mar B",833343,"Ha hoi",false);
        ct4=new contact("Mar C",833343,"Ha hoi",true);

        Contact.add(Ct1);
        Contact.add(ct2);
        Contact.add(ct3);
        Contact.add(ct4);
        Ad= new adapter(Contact);
        lv1.setAdapter(Ad);

    }
}
