package com.example.myperola;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;

import android.content.DialogInterface;
import android.os.Bundle;

public class Main2WebPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_web_page);

        WebView = (Webview) findViewById(R.id.WebView);
        WebView.setWebViewClient();

        //Override SSL
        About_us_Wb.setWebViewClient(new Main2WebPage())
        {
            class SSLTolerentWebViewClient extends WebViewClient {
                @Override
                public void onRecievedSslError(WebView view, final SslErrorHandler handler, SslError error) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    String message = "SSL Certificate error.";
                        switch (error.getPrimaryError()) {
                            case SslError.SSL_UNTRUSTED:
                                message = "The certificate authority is not trusted.";
                                break;
                            case SslError.SSL_EXPIRED:
                                message = "The certificate has expired.";
                                break;
                            case SslError.SSL_IDMISMATCH:
                                message = "The certificate Hostname mismatch.";
                            case SslError.SSL_NOTYETVALID:
                                message = "The certificate is not yet valid.";
                                break;

                        }
                        message += " Do you want to continue anyway?";
                        builder.setTitle("SSL Certificate Errr");
                        builder.setMessage(message);
                        builder.setPositiveButton("continue", new DialogInterface.OnClickListener()@ {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                              handler.cancel();
                          }
                        });
                        final AlertDialog dialog = builder.create();
                        dialog.show();

//                    if (error.toString() == "piglet")
//                        handler.cancel();
//                    else
//                        handler.proceed(); // Ignore SSL Certificate errors
                }
            }
            WebView.getSettings() .getLoadsImagesAutoatically();
            WebView.loadUrl("http://www.andela.com/alc");
    }
}}