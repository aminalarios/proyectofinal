package graciasalle.myappapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import model.ExchangeModel;


public class DataExchange extends ActionBarActivity {
    TextView paisOrigen;
    TextView monedaOrigen;
    TextView paisDestino;
    TextView monedaDestino;
    TextView tauxchange1;
    TextView tauxchange2;
    TextView cambio;
    ExchangeModel exchange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_exchange);
        // declaramos las variables del view
        paisOrigen=(TextView) findViewById(R.id.textViewOrigin);
        monedaOrigen=(TextView) findViewById(R.id.moneyOrigin);
        paisDestino=(TextView) findViewById(R.id.detailDestination);
        monedaDestino=(TextView) findViewById(R.id.detailMoneyDestination);
        tauxchange1=(TextView) findViewById(R.id.originRate);
        tauxchange2=(TextView) findViewById(R.id.originDestination);
        cambio=(TextView) findViewById(R.id.exchange);


        exchange=  (ExchangeModel) getIntent().getSerializableExtra("exchange");



        paisOrigen.setText(exchange.getNameCountryOrigin());
        monedaOrigen.setText(exchange.getMoneyCountryOrigin());
        paisDestino.setText(exchange.getNameCountryDestination());
        monedaDestino.setText(exchange.getMoneyCountryDestination());

       Conversion (exchange.getNameCountryOrigin(),exchange.getNameCountryDestination(),Double.parseDouble(exchange.getQuantityMoney()));
        Conversion1 (exchange.getNameCountryOrigin(),exchange.getNameCountryDestination(),Double.parseDouble(exchange.getQuantityMoney()));
        Conversion2 (exchange.getNameCountryOrigin(),exchange.getNameCountryDestination(),Double.parseDouble(exchange.getQuantityMoney()));
        Conversion3 (exchange.getNameCountryOrigin(),exchange.getNameCountryDestination(),Double.parseDouble(exchange.getQuantityMoney()));
        Conversion4 (exchange.getNameCountryOrigin(),exchange.getNameCountryDestination(),Double.parseDouble(exchange.getQuantityMoney()));
        Conversion5 (exchange.getNameCountryOrigin(),exchange.getNameCountryDestination(),Double.parseDouble(exchange.getQuantityMoney()));


        }




    public void Conversion (String p1, String p2, double calcule){
       String calculo;
       double a,b;

       if (p1.equals("States of Amercia") && p2.equals("States of Amercia"))
       {
            tauxchange1.setText("1");
            tauxchange2.setText("1");
            calculo= String.valueOf(calcule);
            cambio.setText(calculo);
        }
        else {
            if (p1.equals("States of Amercia") && p2.equals("Europe")) {
                tauxchange1.setText("0,90");
                tauxchange2.setText("1,10");
                a=calcule;
                b=0.90 ;
                a=a*b;
                calculo= String.valueOf(a);
                cambio.setText(calculo);
            } else {
                        if (p1.equals("States of Amercia") && p2.equals("CEDEAO")) {
                            tauxchange1.setText("584,385");
                            tauxchange2.setText("0,00171");
                             a= calcule;
                             b=584.385;
                            a=a*b;
                            calculo= String.valueOf(a);
                            cambio.setText(calculo);
                } else {
                    if ((p1.equals("States of Amercia") && p2.equals("Guinea"))) {
                        tauxchange1.setText("7895");
                        tauxchange2.setText("0,000126");
                        a=calcule;
                        b=7895;
                        a=a*b;
                        calculo= String.valueOf(a);
                        cambio.setText(calculo);
                    } else {
                        if ((p1.equals("States of Amercia") && p2.equals("Rwanda"))) {
                            tauxchange1.setText("735,980");
                            tauxchange2.setText("0,001358");
                            a=calcule;
                            b=735.980;
                            a=a*b;
                            calculo= String.valueOf(a);
                            cambio.setText(calculo);
                        } else {
                            if ((p1.equals("States of Amercia") && p2.equals("Congo"))) {
                                tauxchange1.setText("916");
                                tauxchange2.setText("0,001091");
                                a=calcule;
                                b=916;
                                a=a*b;
                                calculo= String.valueOf(a);
                                cambio.setText(calculo);
                            }
                        }
                    }
                }
            }
            }
    }
    public void Conversion1 (String p1, String p2, double calcule) {
        String calculo ;
        double a,b;
        if (p1.equals("Europe") && p2.equals("States of Amercia")) {
            tauxchange1.setText("1,1");
            tauxchange2.setText("0,90");
            a=calcule;
            b=1.1;
            a=a*b;
            calculo= String.valueOf(a);
            cambio.setText(calculo);
        } else {
            if (p1.equals("Europe") && p2.equals("Europe")) {
                tauxchange1.setText("1");
                tauxchange2.setText("1");
                a=calcule;
                b=1;
                a=a*b;
                calculo= String.valueOf(a);
                cambio.setText(calculo);
            } else {
                if (p1.equals("Europe") && p2.equals("CEDEAO")) {
                    tauxchange1.setText("655,957");
                    tauxchange2.setText("0,00152");
                    a=calcule;
                    b=655.957;
                    a=a*b;
                    calculo= String.valueOf(a);
                    cambio.setText(calculo);
                } else {
                    if ((p1.equals("Europe") && p2.equals("Guinea"))) {
                        tauxchange1.setText("8789");
                        tauxchange2.setText("0,0001137");
                        a=calcule;
                        b=8789;
                        a=a*b;
                        calculo= String.valueOf(a);
                        cambio.setText(calculo);
                    } else {
                        if ((p1.equals("Europe") && p2.equals("Rwanda"))) {
                            tauxchange1.setText("812,199");
                            tauxchange2.setText("0,001231");
                            a=(calcule);
                            b=812.199;
                            a=a*b;
                            calculo= String.valueOf(a);
                            cambio.setText(calculo);
                        } else {
                            if ((p1.equals("Europe") && p2.equals("Congo"))) {
                                tauxchange1.setText("1010");
                                tauxchange2.setText("0,00090");
                                a=calcule;
                                b=1010;
                                a=a*b;
                                calculo= String.valueOf(a);
                                cambio.setText(calculo);
                            }
                        }
                    }
                }
            }
        }
    }
    public void Conversion2 (String p1, String p2, double calcule) {
        String calculo;
        double a,b;
        if (p1.equals("CEDEAO") && p2.equals("States of Amercia")) {
            tauxchange1.setText("0,0017112");
            tauxchange2.setText("584,389");
            a=calcule;
            b=0.0017112;
            a=a*b;
            calculo= String.valueOf(a);
            cambio.setText(calculo);
        } else {
            if (p1.equals("CEDEAO") && p2.equals("Europe")) {
                tauxchange1.setText("0,001524");
                tauxchange2.setText("655,957");
                a=(calcule);
                b=0.001524;
                a=a*b;
                calculo= String.valueOf(a);
                cambio.setText(calculo);
            } else {
                if (p1.equals("CEDEAO") && p2.equals("CEDEAO")) {
                    tauxchange1.setText("1");
                    tauxchange2.setText("1");
                    a=(calcule);
                    b=Float.parseFloat("1");
                    a=a*b;
                    calculo= String.valueOf(a);
                    cambio.setText(calculo);
                } else {
                    if ((p1.equals("CEDEAO") && p2.equals("Guinea"))) {
                        tauxchange1.setText("13,40");
                        tauxchange2.setText("0,07462");
                        a=calcule;
                        b=13.40;
                        a=a*b;
                        calculo= String.valueOf(a);
                        cambio.setText(calculo);
                    } else {
                        if ((p1.equals("CEDEAO") && p2.equals("Rwanda"))) {
                            tauxchange1.setText("1,238");
                            tauxchange2.setText("0,8076");
                            a=calcule;
                            b=1.238;
                            a=a*b;
                            calculo= String.valueOf(a);
                            cambio.setText(calculo);
                        } else {
                            if ((p1.equals("CEDEAO") && p2.equals("Congo"))) {
                                tauxchange1.setText("1,5397");
                                tauxchange2.setText("0,6494");
                                a=calcule;
                                b=1.5397;
                                a=a*b;
                                calculo= String.valueOf(a);
                                cambio.setText(calculo);
                            }
                        }
                    }
                }
            }
        }
    }
    public void Conversion3 (String p1, String p2, double calcule){
        String calculo ;
        double a,b;
        if (p1.equals("Guinea") && p2.equals("States of Amercia")){
            tauxchange1.setText("0,000126");
            tauxchange2.setText("7895");
            a=calcule;
            b=0.000126;
            a=a*b;
            calculo= String.valueOf(a);
            cambio.setText(calculo);
        } else {
            if (p1.equals("Guinea") && p2.equals("Europe")) {
                tauxchange1.setText("0,0001137");
                tauxchange2.setText("8789");
                a=calcule;
                b=0.0001137;
                a=a*b;
                calculo= String.valueOf(a);
                cambio.setText(calculo);
            } else {
                if (p1.equals("Guinea") && p2.equals("CEDEAO")) {
                    tauxchange1.setText("0,07462");
                    tauxchange2.setText("13,4");
                    a=calcule;
                    b=0.06462;
                    a=a*b;
                    calculo= String.valueOf(a);
                    cambio.setText(calculo);
                } else {
                    if ((p1.equals("Guinea") && p2.equals("Guinea"))) {
                        tauxchange1.setText("1");
                        tauxchange2.setText("1");
                        a=calcule;
                        b=1;
                        a=a*b;
                        calculo= String.valueOf(a);
                        cambio.setText(calculo);
                    } else {
                        if ((p1.equals("Guinea") && p2.equals("Rwanda"))) {
                            tauxchange1.setText("0,0924");
                            tauxchange2.setText("10,82");
                            a=calcule;
                            b=0.0924;
                            a=a*b;
                            calculo= String.valueOf(a);
                            cambio.setText(calculo);
                        } else {
                            if ((p1.equals("Guinea") && p2.equals("Congo"))) {
                                tauxchange1.setText("0,1149");
                                tauxchange2.setText("8,70");
                                a=calcule;
                                b=0.1149;
                                a=a*b;
                                calculo= String.valueOf(a);
                                cambio.setText(calculo);
                            }
                        }
                    }
                }
            }
        }
    }

    public void Conversion4 (String p1, String p2, double calcule)
    {
        String calculo;
        double a,b;
        if (p1.equals("Rwanda") && p2.equals("States of Amercia")){
                tauxchange1.setText("0,001358");
                tauxchange2.setText("735,980");
                a=calcule;
                b=0.001358;
                a=a*b;
                calculo= String.valueOf(a);
                cambio.setText(calculo);

        } else {
            if (p1.equals("Rwanda") && p2.equals("Europe")) {
                tauxchange1.setText("0,001231");
                tauxchange2.setText("812,199");
                a = calcule;
                b = 0.001231;
                a = a * b;
                calculo = String.valueOf(a);
                cambio.setText(calculo);
            } else {
                if (p1.equals("Rwanda") && p2.equals("CEDEAO")) {
                    tauxchange1.setText("0,8076");

                        tauxchange2.setText("1,238");
                        a = calcule;
                        b = 0.8076;
                        a = a * b;
                        calculo = String.valueOf(a);
                        cambio.setText(calculo);
                    }else
                    {
                        if ((p1.equals("Rwanda") && p2.equals("Guinea"))) {

                            tauxchange1.setText("0,0924");
                            tauxchange2.setText("12,82");
                            a =calcule;
                            b = 0.0924;
                            a = a * b;
                            calculo = String.valueOf(a);
                            cambio.setText(calculo);
                        } else {
                            if ((p1.equals("Rwanda") && p2.equals("Rwanda"))) {

                                tauxchange1.setText("1");
                                tauxchange2.setText("1");
                                a = calcule;
                                b = 1;
                                a = a * b;
                                calculo = String.valueOf(a);
                                cambio.setText(calculo);
                            } else {
                                if ((p1.equals("Rwanda") && p2.equals("Congo"))) {

                                    tauxchange1.setText("1,24");
                                    tauxchange2.setText("0,8040");
                                    a = calcule;
                                    b = 1.24;
                                    a = a * b;
                                    calculo = String.valueOf(a);
                                    cambio.setText(calculo);
                                }
                            }
                        }
                    }
                }
            }
        }

    public void Conversion5 (String p1, String p2, double calcule){

        String calculo ;
        double a,b;
        if (p1.equals("Congo") && p2.equals("States of Amercia")){
                tauxchange1.setText("0,001091");
                tauxchange2.setText("916");
                a=calcule;
                b=0.001091;
                a=a*b;
                calculo= String.valueOf(a);
                cambio.setText(calculo);

        } else {
            if (p1.equals("Congo") && p2.equals("Europe")) {
                tauxchange1.setText("0,000990");
                tauxchange2.setText("1010");
                a=calcule;
                b=0.000990;
                a=a*b;
                calculo= String.valueOf(a);
                cambio.setText(calculo);

            } else {
                if (p1.equals("Congo") && p2.equals("CEDEAO")) {
                    tauxchange1.setText("0,6494");
                    tauxchange2.setText("1,5393");
                    a=calcule;
                    b=0.06494;
                    a=a*b;
                    calculo= String.valueOf(a);
                    cambio.setText(calculo);

                } else {
                    if ((p1.equals("Congo") && p2.equals("Guinea"))) {
                        tauxchange1.setText("8,70");
                        tauxchange2.setText("0,1149");
                        a=calcule;
                        b=0.001358;
                        a=a*b;
                        calculo= String.valueOf(a);
                        cambio.setText(calculo);

                    } else {
                        if ((p1.equals("Congo") && p2.equals("Rwanda"))) {
                            tauxchange1.setText("0,8040");
                            tauxchange2.setText("1,24");
                            a=calcule;
                            b=0.08040;
                            a=a*b;
                            calculo= String.valueOf(a);
                            cambio.setText(calculo);

                        } else {
                            if ((p1.equals("Congo") && p2.equals("Congo"))) {
                                tauxchange1.setText("1");
                                tauxchange2.setText("1");
                                a=calcule;
                                b=1;
                                a=a*b;
                                calculo= String.valueOf(a);
                                cambio.setText(calculo);

                            }
                        }
                    }
                }
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_data_exchange, menu);
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
