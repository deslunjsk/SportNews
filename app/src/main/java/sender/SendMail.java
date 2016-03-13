package sender;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

import com.develop.deni.sportnews.MainActivity;

/**
 * Created by dslunjski on 8.3.2016..
 */
public class SendMail {


    String  description = "Poruka";
    String tekst_poruke = "OVo je tekst poruke##### posljednji red";

    String send_to = "denodeno6@gmail.com";
    String sender = "testni_mail@.com";



    public  void mail(String odlazni){

        Intent sendermail = new Intent(Intent.ACTION_SEND);

        sendermail.setData(Uri.parse(send_to));
        sendermail.setType("text/plain");

        sendermail.putExtra(Intent.EXTRA_EMAIL, new String[]{send_to});
        sendermail.putExtra(Intent.EXTRA_SUBJECT, description);
        sendermail.putExtra(Intent.EXTRA_TEXT, tekst_poruke);

        Intent.createChooser(sendermail, "Send mail...");

        Log.i("Finished sending mail", "");

        odlazni = "1234";



    };


}
