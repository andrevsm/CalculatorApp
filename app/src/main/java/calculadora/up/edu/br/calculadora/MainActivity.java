package calculadora.up.edu.br.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int operacao;
    Double valor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView resultado = (TextView)findViewById(R.id.resultado);

        Button button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.append("0");
            }
        });

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.append("1");
            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.append("2");
            }
        });

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.append("3");
            }
        });

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.append("4");
            }
        });

        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.append("5");
            }
        });

        Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.append("6");
            }
        });

        Button button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.append("7");
            }
        });

        Button button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.append("8");
            }
        });

        Button button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.append("9");
            }
        });

        Button buttonDiv = (Button)findViewById(R.id.buttonDiv);
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Double.valueOf(resultado.getText().toString());
                resultado.setText("");
                operacao = 1;
            }
        });

        Button buttonMult = (Button)findViewById(R.id.buttonMult);
        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Double.valueOf(resultado.getText().toString());
                resultado.setText("");
                operacao = 2;
            }
        });

        Button buttonSub = (Button)findViewById(R.id.buttonSub);
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Double.valueOf(resultado.getText().toString());
                resultado.setText("");
                operacao = 3;
            }
        });

        Button buttonSum = (Button)findViewById(R.id.buttonSum);
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Double.valueOf(resultado.getText().toString());
                resultado.setText("");
                operacao = 4;
            }
        });

        Button buttonEq = (Button)findViewById(R.id.buttonEq);
        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valor2 = Double.valueOf(resultado.getText().toString());
                Double resultadoOperacao = 0.0;
                if (operacao == 1) {
                    resultadoOperacao = valor1 / valor2;
                } else {
                    if(operacao == 2) {
                        resultadoOperacao = valor1 * valor2;
                    } else {
                        if (operacao == 3) {
                            resultadoOperacao = valor1 - valor2;
                        } else {
                            if(operacao == 4) {
                                resultadoOperacao = valor1 + valor2;
                            }
                        }
                    }
                }

                resultado.setText(resultadoOperacao.toString());
            }
        });
    }
}
