package com.bzcode.zatcaqrgeneratoroffline;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bzcode.zatcaqrgeneratoroffline.utils.ZatcaDataGenerator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * created by shibin pr
 * */
public class MainActivity extends AppCompatActivity {

    //input fields
    private EditText et_seller, et_vatNumber, et_total, et_vatAmount;

    //image view to display qr data
    private ImageView iv_qrImage;

    //qr generate button
    private Button btn_generate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init views
        et_seller = findViewById(R.id.et_seller);
        et_vatNumber = findViewById(R.id.et_vat_number);
        et_total = findViewById(R.id.et_total);
        et_vatAmount = findViewById(R.id.et_vat_amount);

        //to display qr code
        iv_qrImage = findViewById(R.id.iv_qrImage);

        //qr generate button
        btn_generate = findViewById(R.id.btn_generate);

        //click listener
        btn_generate.setOnClickListener(this::onGenerateButtonClick);

    }

    /**
     * Button click listener
     * step 1 : validate input fields
     * step 2 : generate zatcha base64 string from input data
     * step 3 : generate qr bitmap and display
     * */
    private void onGenerateButtonClick(View view){

        //step 1: validate input fields
        String sellerName = et_seller.getText().toString();
        String vatNumber = et_vatNumber.getText().toString();
        String totalAmount = et_total.getText().toString();
        String vatAmount = et_vatAmount.getText().toString();

        //empty checking
        if(sellerName.isEmpty()) {
            showError(et_seller);
            return;
        }

        if(vatNumber.isEmpty()) {
            showError(et_vatNumber);
            return;
        }

        if(totalAmount.isEmpty()) {
            showError(et_total);
            return;
        }

        if(vatAmount.isEmpty()) {
            showError(et_vatAmount);
            return;
        }

        //current time in milliseconds
        String timeStamp = getDateTimestamp();

        //create zatca base64 data from given parameters
        String zatcaBase64Data = ZatcaDataGenerator.createZatcaQrData(sellerName, vatNumber, timeStamp, totalAmount, vatAmount);

        //use a third party library to generate qr image from zatca data
        generateQrBitmap(zatcaBase64Data);

    }

    /**
     * to generate qr code from zatca base64 string
     * @param base64String
     * */
    private void generateQrBitmap(String base64String){
        try {

            //generate qr code from data and display in bill
            Bitmap bitmap = new BarcodeEncoder().encodeBitmap(base64String, BarcodeFormat.QR_CODE, 400, 400);

            //display qr image in view
            iv_qrImage.setImageBitmap(bitmap);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * To convert the current date time to millisecond
     * */
    private String getDateTimestamp(){
        try {

            Date date = Calendar.getInstance().getTime();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            return formatter.format(date);

        }catch (Exception e){
            e.printStackTrace();
            return "00-00-0000 00:00:00";
        }
    }

    /**
     * to show error in input field
     * */
    private void showError(EditText field){
        field.setError("Please enter value");
        field.requestFocus();
    }

    /**
     * Do not skip the library loading
     * Without this line will throw exception
     */
    //load library  N.B without loading will throw exception
    static {
        System.loadLibrary("chilkat");
    }
}