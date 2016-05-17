package snru.dechalode.witthawus.snrurun;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Administrator on 16/5/2559.
 */
public class MyAlet {

    public void  myDiaiog (Context context,
                           String strTitle,
                           String strmessage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.doremon48);
        builder.setTitle(strmessage);
        builder.setMessage(strmessage);
        builder.setPositiveButton("OK HA", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();

    }

}   //Main Class
