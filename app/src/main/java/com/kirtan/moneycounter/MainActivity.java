package com.kirtan.moneycounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    double total = 0;
    int hundred, fifty, twenty, ten, five, one, quarter, dime, nickel, cent;

    TextView totalDollars, totalButton;
    Button clear;
    EditText hundreds, fiftys, twentys, tens, fives, ones, quarters, dimes, nickels, cents;
    ImageButton increasehun, decreasehun, increasefif, decreasefif,
            increasetwe, decreasetwe, increaseten, decreaseten, increasefiv, decreasefiv,
            increaseone, decreaseone, increasequa, decreasequa, increasedim, decreasedim,
            increasenic, decreasenic, increasecen, decreasecen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalDollars = (TextView) findViewById(R.id.totaldollar);
        totalButton = (TextView) findViewById(R.id.totalbutton);
        clear = (Button) findViewById(R.id.clear);
        hundreds = (EditText) findViewById(R.id.hun);
        fiftys = (EditText) findViewById(R.id.fif);
        twentys = (EditText) findViewById(R.id.twe);
        tens = (EditText) findViewById(R.id.ten);
        fives = (EditText) findViewById(R.id.fiv);
        ones = (EditText) findViewById(R.id.one);
        quarters = (EditText) findViewById(R.id.qua);
        dimes = (EditText) findViewById(R.id.dim);
        nickels = (EditText) findViewById(R.id.nic);
        cents = (EditText) findViewById(R.id.cen);
        increasehun = (ImageButton) findViewById(R.id.increasehunButton);
        decreasehun = (ImageButton) findViewById(R.id.decreasehunButton);
        increasefif = (ImageButton) findViewById(R.id.increasefifButton);
        decreasefif = (ImageButton) findViewById(R.id.decreasefifButton);
        increasetwe = (ImageButton) findViewById(R.id.increasetweButton);
        decreasetwe = (ImageButton) findViewById(R.id.decreasetweButton);
        increaseten = (ImageButton) findViewById(R.id.increasetenButton);
        decreaseten = (ImageButton) findViewById(R.id.decreasetenButton);
        increasefiv = (ImageButton) findViewById(R.id.increasefivButton);
        decreasefiv = (ImageButton) findViewById(R.id.decreasefivButton);
        increaseone = (ImageButton) findViewById(R.id.increaseoneButton);
        decreaseone = (ImageButton) findViewById(R.id.decreaseoneButton);
        increasequa = (ImageButton) findViewById(R.id.increasequaButton);
        decreasequa = (ImageButton) findViewById(R.id.decreasequaButton);
        increasedim = (ImageButton) findViewById(R.id.increasedimButton);
        decreasedim = (ImageButton) findViewById(R.id.decreasedimButton);
        increasenic = (ImageButton) findViewById(R.id.increasenicButton);
        decreasenic = (ImageButton) findViewById(R.id.decreasenicButton);
        increasecen = (ImageButton) findViewById(R.id.increasecenButton);
        decreasecen = (ImageButton) findViewById(R.id.decreasecenButton);


        TextWatcher onChangeListener = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                calculate();
            }
        };

        hundreds.addTextChangedListener(onChangeListener);
        fiftys.addTextChangedListener(onChangeListener);
        twentys.addTextChangedListener(onChangeListener);
        tens.addTextChangedListener(onChangeListener);
        fives.addTextChangedListener(onChangeListener);
        ones.addTextChangedListener(onChangeListener);
        quarters.addTextChangedListener(onChangeListener);
        dimes.addTextChangedListener(onChangeListener);
        nickels.addTextChangedListener(onChangeListener);
        cents.addTextChangedListener(onChangeListener);

        totalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                totalDollars.setText("$0.00");
                hundreds.setText(null);
                fiftys.setText(null);
                twentys.setText(null);
                tens.setText(null);
                fives.setText(null);
                ones.setText(null);
                quarters.setText(null);
                dimes.setText(null);
                nickels.setText(null);
                cents.setText(null);
            }
        });

        increasehun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase("hundreds");
            }
        });

        decreasehun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease("hundreds");
            }
        });

        increasefif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase("fiftys");
            }
        });

        decreasefif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease("fiftys");
            }
        });

        increasetwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase("twentys");
            }
        });

        decreasetwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease("twentys");
            }
        });

        increaseten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase("tens");
            }
        });

        decreaseten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease("tens");
            }
        });

        increasefiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase("fives");
            }
        });

        decreasefiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease("fives");
            }
        });

        increaseone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase("ones");
            }
        });

        decreaseone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease("ones");
            }
        });

        increasequa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase("quarters");
            }
        });

        decreasequa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease("quarters");
            }
        });

        increasedim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase("dimes");
            }
        });

        decreasedim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease("dimes");
            }
        });

        increasenic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase("nickels");
            }
        });

        decreasenic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease("nickels");
            }
        });

        increasecen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase("cents");
            }
        });

        decreasecen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease("cents");
            }
        });
    }

    private void calculate() {
        if(hundreds.getText().toString().equals(""))
        {
            hundred = 0;
        }
        else {
            hundred = Integer.parseInt(hundreds.getText().toString());
        }
        if(fiftys.getText().toString().equals(""))
        {
            fifty = 0;
        }
        else {
            fifty = Integer.parseInt(fiftys.getText().toString());
        }
        if(twentys.getText().toString().equals(""))
        {
            twenty = 0;
        }
        else {
            twenty = Integer.parseInt(twentys.getText().toString());
        }
        if(tens.getText().toString().equals(""))
        {
            ten = 0;
        }
        else {
            ten = Integer.parseInt(tens.getText().toString());
        }
        if(fives.getText().toString().equals(""))
        {
            five = 0;
        }
        else {
            five = Integer.parseInt(fives.getText().toString());
        }
        if(ones.getText().toString().equals(""))
        {
            one = 0;
        }
        else {
            one = Integer.parseInt(ones.getText().toString());
        }
        if(quarters.getText().toString().equals(""))
        {
            quarter = 0;
        }
        else {
            quarter = Integer.parseInt(quarters.getText().toString());
        }
        if(dimes.getText().toString().equals(""))
        {
            dime = 0;
        }
        else {
            dime = Integer.parseInt(dimes.getText().toString());
        }
        if(nickels.getText().toString().equals(""))
        {
            nickel = 0;
        }
        else {
            nickel = Integer.parseInt(nickels.getText().toString());
        }
        if(cents.getText().toString().equals(""))
        {
            cent = 0;
        }
        else {
            cent = Integer.parseInt(cents.getText().toString());
        }
        calculate(hundred, fifty, twenty, ten, five, one, quarter, dime, nickel, cent);
        String money = "$" + total;
        totalDollars.setText(money);
        String temp = totalDollars.getText().toString();
        if(temp.charAt(temp.length()-3) != '.' && !temp.contains("E")){
            temp += "0";
            totalDollars.setText(temp);
        }
    }

    public void calculate(int hun, int fif, int twe, int te, int fiv, int on, int qua, int dim, int nic, int cen)
    {
        total = 0;
        total += 100 * hun;
        total += 50 * fif;
        total += 20 * twe;
        total += 10 * te;
        total += 5 * fiv;
        total += on;
        total += 0.25 * qua;
        total += 0.10 * dim;
        total += 0.05 * nic;
        total += 0.01 * cen;
        total = round(total, 2);
    }

    public double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public void clear()
    {
        total = 0;
        hundred = 0;
        fifty = 0;
        twenty = 0;
        ten = 0;
        five = 0;
        one = 0;
        quarter = 0;
        dime = 0;
        nickel = 0;
        cent = 0;
    }

    public void increase(String currency)
    {
        switch (currency) {
            case "hundreds":
                if (isEmpty(hundreds)) {
                    hundred += 1;
                } else {
                    add(hundreds);
                    hundred += 1;
                }
                break;
            case "fiftys":
                if (isEmpty(fiftys)) {
                    fifty += 1;
                } else {
                    add(fiftys);
                    fifty += 1;
                }
                break;
            case "twentys":
                if (isEmpty(twentys)) {
                    twenty += 1;
                } else {
                    add(twentys);
                    twenty += 1;
                }
                break;
            case "tens":
                if (isEmpty(tens)) {
                    ten += 1;
                } else {
                    add(tens);
                    ten += 1;
                }
                break;
            case "fives":
                if (isEmpty(fives)) {
                    five += 1;
                } else {
                    add(fives);
                    five += 1;
                }
                break;
            case "ones":
                if (isEmpty(ones)) {
                    one += 1;
                } else {
                    add(ones);
                    one += 1;
                }
                break;
            case "quarters":
                if (isEmpty(quarters)) {
                    quarter += 1;
                } else {
                    add(quarters);
                    quarter += 1;
                }
                break;
            case "dimes":
                if (isEmpty(dimes)) {
                    dime += 1;
                } else {
                    add(dimes);
                    dime += 1;
                }
                break;
            case "nickels":
                if (isEmpty(nickels)) {
                    nickel += 1;
                } else {
                    add(nickels);
                    nickel += 1;
                }
                break;
            case "cents":
                if (isEmpty(cents)) {
                    cent += 1;
                } else {
                    add(cents);
                    cent += 1;
                }
                break;
        }
    }

    public void decrease(String currency)
    {
        switch (currency) {
            case "hundreds":
                if (checkZero(hundreds)) {
                    delete(hundreds);
                    hundred -= 1;
                }
                break;
            case "fiftys":
                if (checkZero(fiftys)) {
                    delete(fiftys);
                    fifty -= 1;
                }
                break;
            case "twentys":
                if (checkZero(twentys)) {
                    delete(twentys);
                    twenty -= 1;
                }
                break;
            case "tens":
                if (checkZero(tens)) {
                    delete(tens);
                    ten -= 1;
                }
                break;
            case "fives":
                if (checkZero(fives)) {
                    delete(fives);
                    five -= 1;
                }
                break;
            case "ones":
                if (checkZero(ones)) {
                    delete(ones);
                    one -= 1;
                }
                break;
            case "quarters":
                if (checkZero(quarters)) {
                    delete(quarters);
                    quarter -= 1;
                }
                break;
            case "dimes":
                if (checkZero(dimes)) {
                    delete(dimes);
                    dime -= 1;
                }
                break;
            case "nickels":
                if (checkZero(nickels)) {
                    delete(nickels);
                    nickel -= 1;
                }
                break;
            case "cents":
                if (checkZero(cents)) {
                    delete(cents);
                    cent -= 1;
                }
                break;
        }
    }

    public boolean isEmpty(EditText text)
    {
        boolean check;
        if(text.getText().toString().equals(""))
        {
            String temp = 1 + "";
            text.setText(temp);
            check = true;
        }
        else
        {
            check = false;
        }
        return check;
    }

    public void add(EditText text)
    {
        text.setText(Integer.parseInt(text.getText().toString()) + 1 + "");
    }

    public boolean checkZero(EditText text)
    {
        return !(text.getText().toString().equals("")) && !(text.getText().toString().equals("0"));
    }

    public void delete(EditText text)
    {
        String temp = Integer.parseInt(text.getText().toString()) - 1 + "";
        text.setText(temp);
    }
}
