package graciasalle.myappapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

import model.ExchangeModel;


public class FragmentDetail extends Fragment {

    TextView paisOrigen, monedaOrigen, paisDestino, monedaDestino, tauxchange1,tauxchange2,cambio, textViewCoin,
            textViewVisa, textViewHistory;
    ExchangeModel exchange;
    ImageView imageViewCoin;

     @Override
     public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
/*       Bundle args = getArguments();
        //
        if(args!=null){
            exchangeModel  = (ExchangeModel) args.getSerializable(SegundActivity.LIST_TO_SHOW);
           // loadDataInitialToShow(this.getActivity());
        }*/
     }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View v =inflater.inflate(R.layout.fragment_detail,container, false);
        return v;

    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // declaramos las variables del view
        paisOrigen=(TextView) this.getActivity().findViewById(R.id.textViewOrigin);
        monedaOrigen=(TextView) this.getActivity().findViewById(R.id.moneyOrigin);
        paisDestino=(TextView) this.getActivity().findViewById(R.id.detailDestination);
        monedaDestino=(TextView) this.getActivity().findViewById(R.id.detailMoneyDestination);
        tauxchange1=(TextView) this.getActivity().findViewById(R.id.originRate);
        tauxchange2=(TextView) this.getActivity().findViewById(R.id.originDestination);
        cambio=(TextView) this.getActivity().findViewById(R.id.exchange);
        /*data of the visa express to exchange money*/


        exchange=  (ExchangeModel) getArguments().getSerializable("exchange");
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

        // Call the function einother datos on the method of oncreate
        otherData(exchange.getNameCountryDestination());

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
                a=roundTwoDecimals(a);
                calculo= String.valueOf(a);
                cambio.setText(calculo);

        } else {
            if (p1.equals("Congo") && p2.equals("Europe")) {
                tauxchange1.setText("0,000990");
                tauxchange2.setText("1010");
                a=calcule;
                b=0.000990;
                a=a*b;
                a=roundTwoDecimals(a);
                calculo= String.valueOf(a);
                cambio.setText(calculo);

            } else {
                if (p1.equals("Congo") && p2.equals("CEDEAO")) {
                    tauxchange1.setText("0,6494");
                    tauxchange2.setText("1,5393");
                    a=calcule;
                    b=0.06494;
                    a=a*b;
                    a=roundTwoDecimals(a);
                    calculo= String.valueOf(a);
                    cambio.setText(calculo);

                } else {
                    if ((p1.equals("Congo") && p2.equals("Guinea"))) {
                        tauxchange1.setText("8,70");
                        tauxchange2.setText("0,1149");
                        a=calcule;
                        b=0.001358;
                        a=a*b;
                        a=roundTwoDecimals(a);
                        calculo= String.valueOf(a);
                        cambio.setText(calculo);

                    } else {
                        if ((p1.equals("Congo") && p2.equals("Rwanda"))) {
                            tauxchange1.setText("0,8040");
                            tauxchange2.setText("1,24");
                            a=calcule;
                            b=0.08040;
                            a=a*b;
                            a=roundTwoDecimals(a);
                            calculo= String.valueOf(a);
                            cambio.setText(calculo);

                        } else {
                            if ((p1.equals("Congo") && p2.equals("Congo"))) {
                                tauxchange1.setText("1");
                                tauxchange2.setText("1");
                                a=calcule;
                                b=1;
                                a=a*b;
                                a=roundTwoDecimals(a);
                                calculo= String.valueOf(a);
                                cambio.setText(calculo);

                            }
                        }
                    }
                }
            }
        }
    }


   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    //    getMenuInflater().inflate(R.menu.menu_data_exchange, menu);
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
*/

/*Case to show history of country to create the coin*/
//implemente the function of the history coin and the country
    public void otherData(String country){
        //int to index the values
        int index=0, index1=1, index2=2, index3=3, index4=4, index5=5;
        /* update to story values*/
        String [] arrayHistory;
        //Values to get array
        String [] arrayExpensives;
        String [] arrayCoins;
        textViewVisa = (TextView) this.getActivity().findViewById(R.id.idVisaExpenses);
        textViewHistory = (TextView)this.getActivity().findViewById(R.id.idHistoryMoney);
        imageViewCoin = (ImageView) this.getActivity().findViewById(R.id.imageViewCoinCountry);
        textViewCoin = (TextView) this.getActivity().findViewById(R.id.idCreateCoin);
        arrayExpensives = getResources().getStringArray(R.array.expenses_array);
        arrayHistory = getResources().getStringArray(R.array.history_money);
        arrayCoins = getResources().getStringArray(R.array.coinHistorys);
        switch (country){
            case "States of Amercia":
                textViewVisa.setText(""+arrayExpensives[index]);
                textViewHistory.setText(""+arrayHistory[index]);
                imageViewCoin.setImageResource(R.drawable.liberte);
                textViewCoin.setText(""+arrayCoins[index]);
                break;
            case "Europe":
                textViewVisa.setText(""+arrayExpensives[index1]);
                textViewHistory.setText(""+arrayHistory[index1]);
                textViewCoin.setText(""+arrayCoins[index1]);
                imageViewCoin.setImageResource(R.drawable.arc_triomphe);
                break;
            case "CEDEAO":
                textViewVisa.setText(""+arrayExpensives[index2]);
                textViewHistory.setText(""+arrayHistory[index2]);
                textViewCoin.setText(""+arrayCoins[index2]);
                imageViewCoin.setImageResource(R.drawable.basilique);
                break;

            case "Guinea":
                textViewVisa.setText(""+arrayExpensives[index3]);
                textViewHistory.setText(""+arrayHistory[index3]);
                textViewCoin.setText(""+arrayCoins[index3]);
             imageViewCoin.setImageResource(R.drawable.dame);

            break;

            case "Rwanda":
                textViewVisa.setText(""+arrayExpensives[index4]);
                textViewHistory.setText(""+arrayHistory[index4]);
                textViewCoin.setText(""+arrayCoins[index4]);
                imageViewCoin.setImageResource(R.drawable.image);
            break;

            case "Congo":
                textViewVisa.setText(""+arrayExpensives[index5]);
                textViewHistory.setText(""+arrayHistory[index5]);
                textViewCoin.setText(""+arrayCoins[index5]);
                imageViewCoin.setImageResource(R.drawable.statue_congo);
             break;
            default:

            break;
        }
    }
    double roundTwoDecimals(double d){
        DecimalFormat twoDForm = new DecimalFormat("#.#");
        return Double.valueOf(twoDForm.format(d));
    }
   }