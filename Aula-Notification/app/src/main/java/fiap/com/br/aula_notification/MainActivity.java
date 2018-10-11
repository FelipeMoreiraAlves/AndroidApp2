    package fiap.com.br.aula_notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void exibirNotificacao(View view) {
            NotificationManager notificationManager =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.0){
                String channlid = "alertas";

                NotificationChannel notificationChannel =
                        new NotificationChannel(
                                channlid,
                                "Minha notificação",
                                NotificationManager.IMPORTANCE_DEFAULT
                        );
                notificationChannel.setDescription("Notificações de exemplo para a aula");
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(Color.RED);
                notificationChannel.setVibrationPattern(new long[]{0,1000,500,1000});
                notificationChannel.enableVibration(true);

                notificationManager.createNotificationChannel(notificationChannel);

                NotificationCompat.Builder notification =
                        new NotificationCompat.Builder(this, channlid);

                notification.setContentTitle("Alerta");
                notification.setContentText("Não foi possivel realizar o download");
                notification.setSmallIcon(R.mipmap.ic_launcher);
                notification.setChannelId(channlid);


                notification.setContentIntent (
                        PendingIntent.getActivity(this,
                                99,
                                new Intent(this, MainActivity.class),
                                PendingIntent.FLAG_UPDATE_CURRENT
                        )

                );

                notificationManager.notify(10, notification.build());
            }
        }
    }
