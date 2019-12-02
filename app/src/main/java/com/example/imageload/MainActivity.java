package com.example.imageload;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image_view_id);

        String url = "https://www.google.com/maps/uv?hl=en&pb=!1s0x3a018264f05cd269%3A0xe99cba5218a4be78!3m1!7e115!4shttps%3A%2F%2Flh5.googleusercontent.com%2Fp%2FAF1QipMadLglPSchLmhEyodfe8VSNoQ52l_-LMFNRHba%3Dw255-h160-k-no!5sSundarban%20National%20Park%20-%20Google%20Search!15sCAQ&imagekey=!1e10!2sAF1QipOsg_rFEUSX-AlryKjOLZl5qe5XWZvc36ovwFMq&sa=X&ved=2ahUKEwjus6jPiZbmAhXNAnIKHXnEDWAQoiowKHoECBEQBg";

        Picasso.get().load(url).into(imageView);
    }
}
