package graciasalle.myappapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import model.ExchangeModel;


public class SegundActivity extends ActionBarActivity {
    ArrayList<String> flag = new ArrayList<String>();

    Spinner paisOrigen;
    Spinner monedaOrigen;
    Spinner paisDestino;
    Spinner monedaDestino;
    ImageView banderapaisorigen;
    ImageView banderapaisdestino;
    EditText moneda ;
    ExchangeModel exchange;
    static int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segund);
        paisOrigen=(Spinner) findViewById(R.id.spinners);
        monedaOrigen=(Spinner) findViewById(R.id.spinnerMoney);
        paisDestino=(Spinner) findViewById(R.id.spinnersDestination);
        monedaDestino=(Spinner) findViewById(R.id.spinnerMoney_2);
        moneda =(EditText) findViewById(R.id.quantity);
        banderapaisorigen = (ImageView) findViewById(R.id.banderaOrigen);
        banderapaisdestino= (ImageView) findViewById(R.id.flag);

        position=0;
        flag.add("States of Amercia");
        flag.add("Europe");
        flag.add("CEDEAO");
        flag.add("Guinea");
        flag.add("Rwanda");
        flag.add("Congo");

        // Create the ArrayAdapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(SegundActivity.this
                ,android.R.layout.simple_spinner_item, flag);

        // Set the Adapter
        paisOrigen.setAdapter(arrayAdapter);
        paisDestino.setAdapter(arrayAdapter);

        paisOrigen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> adapterView,  View view, int i, long l) {
                // TODO Auto-generated method stub

                switch (i)
                {
                    case 0:
                        banderapaisorigen.setImageResource(R.drawable.ic_usa);
                        break;
                    case 1:
                        banderapaisorigen.setImageResource(R.drawable.ic_europa);
                        break;
                    case 2:
                        banderapaisorigen.setImageResource(R.drawable.ic_cedeao);
                        break;
                    case 3:
                        banderapaisorigen.setImageResource(R.drawable.ic_guinea);
                        break;
                    case 4:
                        banderapaisorigen.setImageResource(R.drawable.ic_rwanda);
                        break;
                    case 5:
                        banderapaisorigen.setImageResource(R.drawable.ic_congo);
                        break;
                }



            }

            // If no option selected
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });

        paisDestino.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> adapterView,  View view, int i, long l) {
                // TODO Auto-generated method stub

                switch (i)
                {
                    case 0:
                        banderapaisdestino.setImageResource(R.drawable.ic_usa);
                        break;
                    case 1:
                        banderapaisdestino.setImageResource(R.drawable.ic_europa);
                        break;
                    case 2:
                        banderapaisdestino.setImageResource(R.drawable.ic_cedeao);
                        break;
                    case 3:
                        banderapaisdestino.setImageResource(R.drawable.ic_guinea);
                        break;
                    case 4:
                        banderapaisdestino.setImageResource(R.drawable.ic_rwanda);
                        break;
                    case 5:
                        banderapaisdestino.setImageResource(R.drawable.ic_congo);
                        break;
                }



            }

            // If no option selected
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });


    }


    /*Method to exchange to reset money */
    public void startToResetExchange(View view){
    moneda.setText("");
    paisOrigen.setSelection(position);
    monedaOrigen.setSelection(position);
    paisDestino.setSelection(position);
    monedaDestino.setSelection(position);
    banderapaisorigen.setImageResource(R.drawable.ic_usa);
    banderapaisdestino.setImageResource(R.drawable.ic_usa);
    }

    /*Method to exchange money*/
    public void startToExchange(View view){
        String s=moneda.getText().toString();

       if (s.equals(""))
        {
         Toast.makeText(this,"insert value quantity", Toast.LENGTH_LONG).show();
        } else {
            Intent intend = new Intent(SegundActivity.this, DataExchange.class);
            exchange = new ExchangeModel(paisOrigen.getSelectedItem().toString(),
                    paisDestino.getSelectedItem().toString(),
                    monedaOrigen.getSelectedItem().toString(),
                    monedaDestino.getSelectedItem().toString(),
                    moneda.getText().toString());
            intend.putExtra("exchange", exchange);

            startActivity(intend);
        }
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
