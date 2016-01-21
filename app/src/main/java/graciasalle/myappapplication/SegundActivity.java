package graciasalle.myappapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import model.ExchangeModel;


public class SegundActivity extends ActionBarActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segund);
        setUpdateInterface();

    }

    private void setUpdateInterface() {
        if (this.findViewById(R.id.container) != null) {
            //smartphone
            modeSmartphoneLayout();
        } else {
            //Tablet
            modeTabletLayout();
        }
    }

    private void modeSmartphoneLayout() {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentList fragmentList = new FragmentList();
        //Bundle argsToFragmentList = new Bundle();

        //argsToFragmentList.putSerializable(LIST_TO_SHOW,exchangeModel);
        //fragmentList.setArguments(argsToFragmentList);
        fragmentTransaction.replace(R.id.container, fragmentList).commit();
        //this.getFragmentManager().beginTransaction().add(R.id.container, fragmentList, LIST_FRAGMENT_TAG);

    }

    private void modeTabletLayout() {
        ExchangeModel exchange = new ExchangeModel("States of Amercia", "States of Amercia", "Dollar", "Dollar", "1");
        Bundle parametro = new Bundle();
        parametro.putSerializable("exchange", exchange);

        FragmentList fragmentList = new FragmentList();
        FragmentDetail fragmentDetail = new FragmentDetail();
        fragmentDetail.setArguments(parametro);
        FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container_list_fragment, fragmentList);
        fragmentTransaction.add(R.id.container_detail_fragment, fragmentDetail);
        fragmentTransaction.commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_segund, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.backgroundColorFragment);
        switch(item.getItemId()) {
            case R.id.action_color1:
                linearLayout.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                return true;
            case R.id.action_color:
                linearLayout.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }




}