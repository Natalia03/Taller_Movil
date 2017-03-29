package com.example.android.manillas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText cajaValor;
    private Spinner comboMateriales;
    private ArrayAdapter<String> adapter, adapter2, adapter3;
    private String[] opc, opc2, opc3;
    private Spinner comboDije;
    private Spinner comboTipo;
    private RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaValor = (EditText) findViewById(R.id.Txtvalor);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);

        //Materiales
        comboMateriales = (Spinner) findViewById(R.id.cmbCombo);
        opc = this.getResources().getStringArray(R.array.materiales);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc);
        comboMateriales.setAdapter(adapter);

        //Dije
        comboDije = (Spinner) findViewById(R.id.cmbCombo2);
        opc2 = this.getResources().getStringArray(R.array.dije);
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc2);
        comboDije.setAdapter(adapter2);

        //tipo
        comboTipo = (Spinner) findViewById(R.id.cmbCombo3);
        opc3 = this.getResources().getStringArray(R.array.tipo);
        adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc3);
        comboTipo.setAdapter(adapter3);
    }

    public boolean validar() {
        if (cajaValor.getText().toString().isEmpty()) {
            cajaValor.setError(getResources().getString(R.string.error_1));
            return false;
        }
        return true;
    }


    public void mostrar(View v) {
        int peso;
        int dolar;
        int cantidad = 0;
        String cantida;
        int prod;
        cantida = cajaValor.getText().toString();


        if (r1.isChecked()) {
            if (comboMateriales.getSelectedItem() == 0) {
                if (comboDije.getSelectedItem() == 0) {
                    if (comboTipo.getSelectedItem() == 0) {
                        prod = 100 * cantidad;
                    } else {
                        if (comboTipo.getSelectedItem() == 1) {
                            prod = 100 * cantidad;
                        } else {
                            if (comboTipo.getSelectedItem() == 2) {
                                prod = 80 * cantidad;
                            } else {
                                if (comboTipo.getSelectedItem() == 3) {
                                    prod = 70 * cantidad;
                                }
                            }

                        }
                    }
                } else {
                    if (comboDije.getSelectedItem() == 1) {
                        if (comboTipo.getSelectedItem() == 0) {

                        } else {
                            if (comboTipo.getSelectedItem() == 1) {

                            } else {
                                if (comboTipo.getSelectedItem() == 2) {

                                } else {
                                    if (comboTipo.getSelectedItem() == 3) {

                                    }
                                }
                            }
                        }


                    }
                }
            } else {
                if (comboMateriales.getSelectedItem() == 1) {
                    if (comboDije.getSelectedItem() == 0) {
                        if (comboTipo.getSelectedItem() == 0) {

                        } else {
                            if (comboTipo.getSelectedItem() == 1) {

                            } else {
                                if (comboTipo.getSelectedItem() == 2) {

                                } else {
                                    if (comboTipo.getSelectedItem() == 3) {

                                    }
                                }

                            }
                        }
                    } else {
                        if (comboDije.getSelectedItem() == 1) {
                            if (comboTipo.getSelectedItem() == 0) {

                            } else {
                                if (comboTipo.getSelectedItem() == 1) {

                                } else {
                                    if (comboTipo.getSelectedItem() == 2) {

                                    } else {
                                        if (comboTipo.getSelectedItem() == 3) {

                                        }
                                    }
                                }
                            }


                        }
                    }

                }
            }
        } else {
            if (r2.isChecked()) {

            }
        }

    }
}


