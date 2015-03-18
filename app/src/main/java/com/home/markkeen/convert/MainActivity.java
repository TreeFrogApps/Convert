package com.home.markkeen.convert;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {

    private Spinner conversionTypesSpinner;
    private Spinner conversionFromSpinner;
    private Spinner conversionToSpinner;
    private EditText leftInputEditText;
    private EditText rightInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialiseAdapters();

        initialiseEditTexts();


    }

    public void initialiseAdapters(){

        conversionTypesSpinner = (Spinner) findViewById(R.id.conversionTypesSpinner);
        conversionFromSpinner = (Spinner) findViewById(R.id.conversionFromSpinner);
        conversionToSpinner = (Spinner) findViewById(R.id.conversionToSpinner);


        ArrayAdapter<CharSequence> conversionTypesAdapter
                = ArrayAdapter.createFromResource(this, R.array.conversion_types, android.R.layout.simple_spinner_item);
        conversionTypesAdapter.setDropDownViewResource(R.layout.spinner_item);
        conversionTypesSpinner.setAdapter(conversionTypesAdapter);

        final ArrayAdapter<CharSequence> conversionFromAdapterTemperature
                = ArrayAdapter.createFromResource(this, R.array.conversion_Temperature, android.R.layout.simple_spinner_item);
        conversionFromAdapterTemperature.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionToAdapterTemperature
                = ArrayAdapter.createFromResource(this, R.array.conversion_Temperature, android.R.layout.simple_spinner_item);
        conversionToAdapterTemperature.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionFromAdapterLength
                = ArrayAdapter.createFromResource(this, R.array.conversion_Length, android.R.layout.simple_spinner_item);
        conversionFromAdapterLength.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionToAdapterLength
                = ArrayAdapter.createFromResource(this, R.array.conversion_Length, android.R.layout.simple_spinner_item);
        conversionToAdapterLength.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionFromAdapterMass
                = ArrayAdapter.createFromResource(this, R.array.conversion_Mass, android.R.layout.simple_spinner_item);
        conversionFromAdapterMass.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionToAdapterMass
                = ArrayAdapter.createFromResource(this, R.array.conversion_Mass, android.R.layout.simple_spinner_item);
        conversionToAdapterMass.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionFromAdapterSpeed
                = ArrayAdapter.createFromResource(this, R.array.conversion_Speed, android.R.layout.simple_spinner_item);
        conversionFromAdapterSpeed.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionToAdapterSpeed
                = ArrayAdapter.createFromResource(this, R.array.conversion_Speed, android.R.layout.simple_spinner_item);
        conversionToAdapterSpeed.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionFromAdapterVolume
                = ArrayAdapter.createFromResource(this, R.array.conversion_Volume, android.R.layout.simple_spinner_item);
        conversionFromAdapterVolume.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionToAdapterVolume
                = ArrayAdapter.createFromResource(this, R.array.conversion_Volume, android.R.layout.simple_spinner_item);
        conversionToAdapterVolume.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionFromAdapterArea
                = ArrayAdapter.createFromResource(this, R.array.conversion_Area, android.R.layout.simple_spinner_item);
        conversionFromAdapterArea.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionToAdapterArea
                = ArrayAdapter.createFromResource(this, R.array.conversion_Area, android.R.layout.simple_spinner_item);
        conversionToAdapterArea.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionFromAdapterFuel
                = ArrayAdapter.createFromResource(this, R.array.conversion_Fuel_Consumption, android.R.layout.simple_spinner_item);
        conversionFromAdapterFuel.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionToAdapterFuel
                = ArrayAdapter.createFromResource(this, R.array.conversion_Fuel_Consumption, android.R.layout.simple_spinner_item);
        conversionToAdapterFuel.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionFromAdapterTime
                = ArrayAdapter.createFromResource(this, R.array.conversion_Time, android.R.layout.simple_spinner_item);
        conversionFromAdapterTime.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionToAdapterTime
                = ArrayAdapter.createFromResource(this, R.array.conversion_Time, android.R.layout.simple_spinner_item);
        conversionToAdapterTime.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionFromAdapterDigitalStorage
                = ArrayAdapter.createFromResource(this, R.array.conversion_Digital_Storage, android.R.layout.simple_spinner_item);
        conversionFromAdapterDigitalStorage.setDropDownViewResource(R.layout.spinner_item);

        final ArrayAdapter<CharSequence> conversionToAdapterDigitalStorage
                = ArrayAdapter.createFromResource(this, R.array.conversion_Digital_Storage, android.R.layout.simple_spinner_item);
        conversionToAdapterDigitalStorage.setDropDownViewResource(R.layout.spinner_item);

        conversionTypesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    conversionFromSpinner.setAdapter(conversionFromAdapterTemperature);
                    conversionToSpinner.setAdapter(conversionToAdapterTemperature);

                } else if (position == 1){

                    conversionFromSpinner.setAdapter(conversionFromAdapterLength);
                    conversionToSpinner.setAdapter(conversionToAdapterLength);

                } else if (position == 2){

                    conversionFromSpinner.setAdapter(conversionFromAdapterMass);
                    conversionToSpinner.setAdapter(conversionToAdapterMass);

                } else if (position == 3){

                    conversionFromSpinner.setAdapter(conversionFromAdapterSpeed);
                    conversionToSpinner.setAdapter(conversionToAdapterSpeed);

                } else if (position == 4){

                    conversionFromSpinner.setAdapter(conversionFromAdapterVolume);
                    conversionToSpinner.setAdapter(conversionToAdapterVolume);

                } else if (position == 5) {

                    conversionFromSpinner.setAdapter(conversionFromAdapterArea);
                    conversionToSpinner.setAdapter(conversionToAdapterArea);

                } else if (position == 6){

                    conversionFromSpinner.setAdapter(conversionFromAdapterFuel);
                    conversionToSpinner.setAdapter(conversionToAdapterFuel);

                } else if (position == 7){

                    conversionFromSpinner.setAdapter(conversionFromAdapterTime);
                    conversionToSpinner.setAdapter(conversionToAdapterTime);

                } else {

                    conversionFromSpinner.setAdapter(conversionFromAdapterDigitalStorage);
                    conversionToSpinner.setAdapter(conversionToAdapterDigitalStorage);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void initialiseEditTexts(){

        leftInputEditText = (EditText) findViewById(R.id.leftInputEditText);
        leftInputEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (leftInputEditText.isFocused()){

                    String leftAmount = leftInputEditText.getText().toString();

                    if (!leftAmount.equals("")){

                        if (conversionToSpinner.getSelectedItem().toString().equals(conversionFromSpinner.getSelectedItem().toString())){

                            rightInputEditText.setText(leftAmount);
                        }

                        else {

                            Double leftAmountAsDouble = Double.parseDouble(leftAmount);

                            String conversionFromType = conversionFromSpinner.getSelectedItem().toString();
                            conversionFromType = conversionFromType.replaceAll(" +", "");
                            String conversionToType = conversionToSpinner.getSelectedItem().toString();
                            conversionToType = conversionToType.replaceAll(" +", "");


                            String myResult = conversionUpdater(leftAmountAsDouble, Quantity.Unit.valueOf(conversionFromType), Quantity.Unit.valueOf(conversionToType));

                            rightInputEditText.setText(myResult);
                        }
                    }
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO
            }
        });

        rightInputEditText = (EditText) findViewById(R.id.rightInputEditText);
        rightInputEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (rightInputEditText.isFocused()){

                    String rightAmount = rightInputEditText.getText().toString();

                    if (!rightAmount.equals("")){

                        if (conversionFromSpinner.getSelectedItem().toString().equals(conversionToSpinner.getSelectedItem().toString())){

                            leftInputEditText.setText(rightAmount);
                        }

                        else {

                            Double rightAmountAsDouble = Double.parseDouble(rightAmount);

                            String conversionFromType = conversionFromSpinner.getSelectedItem().toString();
                            conversionFromType = conversionFromType.replaceAll(" +", "");
                            String conversionToType = conversionToSpinner.getSelectedItem().toString();
                            conversionToType = conversionToType.replaceAll(" +", "");

                            String myResult = conversionUpdater(rightAmountAsDouble, Quantity.Unit.valueOf(conversionToType), Quantity.Unit.valueOf(conversionFromType));

                            leftInputEditText.setText(myResult);

                        }

                    }


                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });




    }

    public String conversionUpdater(double value, Quantity.Unit currentUnit, Quantity.Unit newUnit){

        Quantity currentQuantity = new Quantity(value, currentUnit);

        return currentQuantity.toResult(newUnit).toString();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
