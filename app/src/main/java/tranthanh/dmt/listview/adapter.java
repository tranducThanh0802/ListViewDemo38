package tranthanh.dmt.listview;

import android.nfc.FormatException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapter extends BaseAdapter {
    List<contact> contactList;


    public adapter(List<contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int i) {
        return contactList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater =LayoutInflater.from(viewGroup.getContext());
        View view1 =inflater.inflate(R.layout.itemcontact,viewGroup,false);

        TextView txtname =view1.findViewById(R.id.txtHT);
        TextView txtDc=view1.findViewById(R.id.txtdc);
        TextView txtSDT=view1.findViewById(R.id.txtDT);

        contact Ct=contactList.get(i);
        txtname.setText(Ct.getName());
        txtDc.setText(Ct.getDiachi());
        try {
            txtSDT.setText(Ct.getNumber()+"");
        }catch (Exception e){

        }
        if(Ct.inconAvatar==true){
            ImageView img=view1.findViewById(R.id.img);

        }
        return view1;
    }
}
