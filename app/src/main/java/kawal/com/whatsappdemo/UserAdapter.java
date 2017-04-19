package kawal.com.whatsappdemo;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kawaldeep on 4/9/2017.
 */

public class UserAdapter extends ArrayAdapter<UserBean> {
    Context context;
    int resources;
    ArrayList<UserBean> userlist;

    public UserAdapter(@NonNull Context context, @LayoutRes int resources, @NonNull ArrayList<UserBean> objects) {
        super(context, resources, objects);

        this.context = context;
        this.resources = resources;
        userlist = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = null;
        view = LayoutInflater.from(context).inflate(resources,parent,false);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        TextView textName = (TextView)view.findViewById(R.id.textViewName);
        TextView textPhone = (TextView)view.findViewById(R.id.textViewPhone);
        TextView textAge = (TextView)view.findViewById(R.id.textViewAge);

        UserBean userBean = userlist.get(position);
        imageView.setBackgroundResource(userBean.getImage());
        textName.setText(userBean.getName());
        textPhone.setText(userBean.getPhone());
        textAge.setText(String.valueOf(userBean.getAge()));
        return  view;
    }
}
