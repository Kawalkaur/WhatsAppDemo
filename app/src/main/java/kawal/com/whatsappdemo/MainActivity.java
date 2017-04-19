package kawal.com.whatsappdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    ArrayList<UserBean> userList;
    UserAdapter userAdapter;

    void initViews(){
        listView = (ListView)findViewById(R.id.listView);
        userList = new ArrayList<>();

        UserBean u1 = new UserBean(R.drawable.user,"John Watson","98765 98765",(byte)20);
        UserBean u2 = new UserBean(R.drawable.user,"Jennie Watson","98765 98765",(byte)30);
        UserBean u3 = new UserBean(R.drawable.user,"Jack Watson","98765 98765",(byte)40);
        UserBean u4 = new UserBean(R.drawable.user,"Jim Watson","98765 98765",(byte)25);
        UserBean u5 = new UserBean(R.drawable.user,"Joe Watson","98765 98765",(byte)60);

        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);
        userList.add(u5);

        userAdapter = new UserAdapter(this,R.layout.list_item,userList);
        listView.setAdapter(userAdapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

        UserBean userBean = userList.get(i);
        Toast.makeText(this, "You Clicked:"+userBean.getName(), Toast.LENGTH_SHORT).show();

    }


}
