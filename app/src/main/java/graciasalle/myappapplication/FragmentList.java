package graciasalle.myappapplication;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

import model.ExchangeModel;

/**
 * Created by Amine Banks on 12/12/2015.
 */
public class FragmentList extends Fragment implements Spinner.OnItemSelectedListener,View.OnClickListener{
    ArrayList<String> flag = new ArrayList<String>();
    public static Spinner countryOrigin,moneyOrigin,countryDestination, moneyDestination;
    ImageView flagCountryOrigin,  flagCountryDestination;
    EditText money ;
    Button bReset,bStart;
    ExchangeModel exchangeModel;
    static int position;
    public static ArrayAdapter<String> arrayAdapter=null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_list,container, false);
        return v;
    }



   @Override
   public void onActivityCreated(Bundle savedInstanceState) {
       super.onActivityCreated(savedInstanceState);
       countryOrigin=(Spinner) this.getActivity().findViewById(R.id.spinners);
       moneyOrigin=(Spinner)this.getActivity(). findViewById(R.id.spinnerMoney);
       countryDestination=(Spinner) this.getActivity().findViewById(R.id.spinnersDestination);
       moneyDestination=(Spinner) this.getActivity().findViewById(R.id.spinnerMoney_2);
       money =(EditText) this.getActivity().findViewById(R.id.quantity);
       flagCountryOrigin = (ImageView) this.getActivity().findViewById(R.id.banderaOrigen);
       flagCountryDestination= (ImageView) this.getActivity().findViewById(R.id.flag);
       bReset =(Button) this.getActivity().findViewById(R.id.reset);
       bStart = (Button) this.getActivity().findViewById(R.id.start);
       bReset.setOnClickListener(this);
       bStart.setOnClickListener(this);


       position=0;
       flag.add("States of Amercia");
       flag.add("Europe");
       flag.add("CEDEAO");
       flag.add("Guinea");
       flag.add("Rwanda");
       flag.add("Congo");
       // Create the ArrayAdapter
       arrayAdapter = new ArrayAdapter<String>(this.getActivity()
               ,android.R.layout.simple_spinner_item, flag);

       // Set the Adapter
       countryOrigin.setAdapter(arrayAdapter);
       countryDestination.setAdapter(arrayAdapter);
       /*event to listener*/
       countryOrigin.setOnItemSelectedListener(this);
       countryDestination.setOnItemSelectedListener(this);

   }

       /*Method to exchange to reset money */
    private void startToResetExchange(View view)
    {

            money.setText("");
            countryOrigin.setSelection(position);
            moneyOrigin.setSelection(position);
            countryDestination.setSelection(position);
            moneyDestination.setSelection(position);
            flagCountryOrigin.setImageResource(R.drawable.ic_usa);
            flagCountryDestination.setImageResource(R.drawable.ic_usa);
       ExchangeModel   exchange = new ExchangeModel(countryOrigin.getSelectedItem().toString(),
                    countryDestination.getSelectedItem().toString(),
                    moneyOrigin.getSelectedItem().toString(),
                    moneyDestination.getSelectedItem().toString(),
                    "1");

        FragmentDetail fragmentDetail = new FragmentDetail();
        Bundle parametro= new Bundle();
        parametro.putSerializable("exchange", exchange);
        FragmentDetail fragment = new FragmentDetail();
        fragment.setArguments(parametro);
        FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container_detail_fragment,fragment);
        fragmentTransaction.commit();

    }



    /*Method to exchange money*/
    public void startToExchange(View view){
        String s=money.getText().toString();
        ExchangeModel exchange;
        if (s.equals(""))
        {
           exchange = new ExchangeModel(countryOrigin.getSelectedItem().toString(),
                    countryDestination.getSelectedItem().toString(),
                    moneyOrigin.getSelectedItem().toString(),
                    moneyDestination.getSelectedItem().toString(),"1");


            //   Toast.makeText(this,"insert value quantity", Toast.LENGTH_LONG).show();
        } else {
            exchange = new ExchangeModel(countryOrigin.getSelectedItem().toString(),
                    countryDestination.getSelectedItem().toString(),
                    moneyOrigin.getSelectedItem().toString(),
                    moneyDestination.getSelectedItem().toString(),
                    money.getText().toString());
        }
        FragmentDetail fragmentDetail = new FragmentDetail();
            Bundle parametro= new Bundle();
            parametro.putSerializable("exchange", exchange);
            FragmentDetail fragment = new FragmentDetail();
            fragment.setArguments(parametro);
            FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container_detail_fragment,fragment);
            fragmentTransaction.commit();

    }

    //this part of the code is not working yet
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (position)
        {
            case 0:
                if (parent.getId()==R.id.spinners)
                    flagCountryOrigin.setImageResource(R.drawable.ic_usa);
                else
                    flagCountryDestination.setImageResource(R.drawable.ic_usa);
                break;
            case 1:
                if (parent.getId()==R.id.spinners)
                    flagCountryOrigin.setImageResource(R.drawable.ic_europa);
                else
                    flagCountryDestination.setImageResource(R.drawable.ic_europa);
                break;
            case 2:
                if (parent.getId()==R.id.spinners)
                    flagCountryOrigin.setImageResource(R.drawable.ic_cedeao);
                else
                    flagCountryDestination.setImageResource(R.drawable.ic_cedeao);
                break;
            case 3:
                if (parent.getId()==R.id.spinners)
                    flagCountryOrigin.setImageResource(R.drawable.ic_guinea);
                else
                    flagCountryDestination.setImageResource(R.drawable.ic_guinea);
                break;
            case 4:
                if (parent.getId()==R.id.spinners)
                    flagCountryOrigin.setImageResource(R.drawable.ic_rwanda);
                else
                    flagCountryDestination.setImageResource(R.drawable.ic_rwanda);
                break;
            case 5:
                if (parent.getId()==R.id.spinners)
                    flagCountryOrigin.setImageResource(R.drawable.ic_congo);
                else
                    flagCountryDestination.setImageResource(R.drawable.ic_congo);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.reset)
        {
            startToResetExchange(v);
        }
           else{
            startToExchange(v);
        }

    }
}
