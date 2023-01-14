package com.parking.system.GooglePay.database.entity;

public class QRCode {
    private Long id;
    private String data;
    private Long userId;

    //generateQRCode
        //if entry does not exist in the QRCODE table
            // for the user then generate from QR code generation service
        //if already exist just fetch from db
}
