package com.example.internetconnectivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    final TextView mTextView = (TextView) findViewById(R.id.text);


    // RequestQueue'yu ilklendirelim
    RequestQueue queue = Volley.newRequestQueue(this);
    String url ="http://www.google.com";

    // verilen adresten bir string yanıt isteyelim
    StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
            new Response.Listener() {
                @Override
                public void onResponse(String response) {
                    // yanıt string'inin ilk 500 karakterini gösterelim
                    mTextView.setText("Gelen yanıt: "+ response.substring(0,500));
                }
            }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            mTextView.setText("Çalışmıyor!");
        }
    });
// İsteği RequestQueue'ya (istek kuyruğu) ekleyelim


// Add the request to the RequestQueue.






}
