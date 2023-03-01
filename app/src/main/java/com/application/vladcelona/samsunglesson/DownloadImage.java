package com.application.vladcelona.samsunglesson;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.net.URL;

public class DownloadImage extends AsyncTask<String, String, Bitmap> {

    private static final String TAG = "LoadImage";
    @SuppressLint("StaticFieldLeak")
    private final ImageView imageView;

    public DownloadImage(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    protected Bitmap doInBackground(String... strings) {
        String url = strings[0]; Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream(new URL(url).openStream());
        } catch (IOException ioexception) {
            Log.e(TAG, "Error: could not download image");
            ioexception.printStackTrace();
        }

        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }
}
