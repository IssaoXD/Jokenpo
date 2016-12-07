package com.jpc.issao.jokenpo;

        import android.content.DialogInterface;
        import android.content.Intent;
        import android.media.AudioManager;
        import android.preference.DialogPreference;
        import android.preference.Preference;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;
        import android.media.SoundPool;
        import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {


    int placarGamer = 0;
    int placarPc = 0;

    MediaPlayer mp = new MediaPlayer();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telainicial);

        mp=MediaPlayer.create(this, R.raw.robo);
        mp.start();
        mp.setLooping(true);

    }
    public void start (View View){
        setContentView(R.layout.telajogo);
    }

    public void sobre (View View){
        setContentView(R.layout.telasobre);
    }

    public void voltar (View View) {setContentView(R.layout.telainicial);}




    public void sair (View View){
        mp.stop();
        finish();

    }



    public void voltar2 (View View){
        setContentView(R.layout.telainicial);


    }

    public void pedra (View view){
        int escolhaPc = (int) (Math.random()*3)+1;

        if(escolhaPc == 1){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);
            Toast.makeText(MainActivity.this, "Deu empate seu bosta", Toast.LENGTH_LONG).show();
        }else if(escolhaPc == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);
            placarPc++;
            TextView pontos = (TextView) findViewById(R.id.placarPc);
            pontos.setText(String.valueOf(this.placarPc));
        }else if(escolhaPc == 3){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);
            placarGamer++;
            TextView pontos = (TextView) findViewById(R.id.placarGamer);
            pontos.setText(String.valueOf(this.placarGamer));
        }
    }
    public void papel (View view){
        int escolhaPc = (int) (Math.random()*3)+1;

        if(escolhaPc == 1){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);
            placarGamer++;
            TextView pontos = (TextView) findViewById(R.id.placarGamer);
            pontos.setText(String.valueOf(this.placarGamer));
        }else if(escolhaPc == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);
            Toast.makeText(MainActivity.this, "Deu empate seu bosta", Toast.LENGTH_LONG).show();
        }else if(escolhaPc == 3){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);
            placarPc++;
            TextView pontos = (TextView) findViewById(R.id.placarPc);
            pontos.setText(String.valueOf(this.placarPc));
        }
    }
    public void tesoura (View view){
        int escolhaPc = (int) (Math.random()*3)+1;

        if(escolhaPc == 1){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);
            placarPc++;
            TextView pontos = (TextView) findViewById(R.id.placarPc);
            pontos.setText(String.valueOf(this.placarPc));
        }else if(escolhaPc == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);
            placarGamer++;
            TextView pontos = (TextView) findViewById(R.id.placarGamer);
            pontos.setText(String.valueOf(this.placarGamer));
        }else if(escolhaPc == 3){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);
            Toast.makeText(MainActivity.this, "Deu empate seu bosta", Toast.LENGTH_LONG).show();
        }
    }

}
