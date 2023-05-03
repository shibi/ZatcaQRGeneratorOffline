package com.bzcode.zatcaqrgeneratoroffline.utils;

import com.chilkatsoft.CkBinData;

/**
 * created by shibin pr
 *
 * Class to generate zatca base64 string data from bill details
 * This class will only generate the string final output.
 * Need to use a third party library to generate qr image,  with the output zatca data from the method below.
 * */
public class ZatcaDataGenerator {

    /**
     *  To create the final zatca base64 string from the provided parameters
     *  The output will a string which can be passed to a third party library to generate qr
     * @param _sellerName Name of the vendor
     * @param _vatNumber vat number of the seller
     * @param _timeStamp date and time as timestamp
     * @param _invoiceTotal total bill amount
     * @param _vatTotal total vat amount
     */
    public static String createZatcaQrData(String _sellerName, String _vatNumber, String _timeStamp, String _invoiceTotal, String _vatTotal){
        try{

            // This example requires the Chilkat API to have been previously unlocked.
            // See Global Unlock Sample for sample code.

            // In Step 1, we applied a signature to an e-invoice Zakat, Tax and Customs Authority (ZATCA) of Saudi Arabia
            // This example is Step 2, where we compose the TLV encoding of the QR code, apply the ECDSA signature, and then insert into the signed XML without disturbing the signed XML.

            // Construct TLV (Tag-Length-Value) encoding of the QR data.
            // We have 5 pieces of data: Seller Name, VAT Number, Time Stamp, Invoice Total, and VAT Total.

            String sellerName = _sellerName;
            String vatNumber = _vatNumber;
            String timeStamp = _timeStamp;
            String invoiceTotal = _invoiceTotal;
            String vatTotal = _vatTotal;

            // TLV encode into a Chilkat BinData object.
            CkBinData bdTlv = new CkBinData();

            String charset = "utf-8";

            int tag = 1;
            bdTlv.AppendByte(tag);
            bdTlv.AppendCountedString(1,false,sellerName,charset);
            tag = tag+1;
            // This is tag 2
            bdTlv.AppendByte(tag);
            bdTlv.AppendCountedString(1,false,vatNumber,charset);
            tag = tag+1;
            // This is tag 3
            bdTlv.AppendByte(tag);
            bdTlv.AppendCountedString(1,false,timeStamp,charset);
            tag = tag+1;
            // This is tag 4
            bdTlv.AppendByte(tag);
            bdTlv.AppendCountedString(1,false,invoiceTotal,charset);
            tag = tag+1;
            // This is tag 5
            bdTlv.AppendByte(tag);
            bdTlv.AppendCountedString(1,false,vatTotal,charset);


            String qr_base64 = bdTlv.getEncoded("base64");
            System.out.println("ssssQR: " + qr_base64);
            return qr_base64;

        }catch (Exception e){
            e.printStackTrace();
            return "EMPTY";
        }
    }
}
