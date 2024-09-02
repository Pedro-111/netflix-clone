package com.example.netflixclone;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.ContentAdapter;
import Model.Content;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configura el RecyclerView para "Series", "Películas", etc.
        RecyclerView seriesRecyclerView = findViewById(R.id.recycler_view_series);
        seriesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        seriesRecyclerView.setAdapter(new ContentAdapter(getSeriesData()));

        // Repite para las otras secciones...
    }

    // Método para obtener datos de series (deberías reemplazarlo por datos reales)
    private List<Content> getSeriesData() {
        List<Content> seriesList = new ArrayList<>();
        seriesList.add(new Content("Peaky Blinders", "https://www.hola.com/horizon/original_aspect_ratio/f2c16ba136ad-peaky-blinders.jpg"));
        seriesList.add(new Content("Stranger Things", "https://example.com/stranger_things.jpg"));
        seriesList.add(new Content("The Crown", "https://example.com/the_crown.jpg"));
        seriesList.add(new Content("Money Heist", "https://example.com/money_heist.jpg"));
        seriesList.add(new Content("The Witcher", "https://example.com/the_witcher.jpg"));
        seriesList.add(new Content("Ozark", "https://example.com/ozark.jpg"));
        seriesList.add(new Content("Bridgerton", "https://example.com/bridgerton.jpg"));
        seriesList.add(new Content("The Queen's Gambit", "https://example.com/the_queens_gambit.jpg"));
        seriesList.add(new Content("Dark", "https://example.com/dark.jpg"));
        seriesList.add(new Content("Lucifer", "https://example.com/lucifer.jpg"));
        return seriesList;
    }
}
