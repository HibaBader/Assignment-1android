package edu.cs.birzeit.movieslibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import edu.cs.birzeit.movieslibrary.model.IMovieDa;
import edu.cs.birzeit.movieslibrary.model.Movie;
import edu.cs.birzeit.movieslibrary.model.MovieFactory;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private EditText input;
    private EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        result = findViewById(R.id.editTextResult);
        input = findViewById(R.id.editTextInput);
        populateSpinner();
    }

    private void populateSpinner() {
        MovieFactory factory = new MovieFactory();
        IMovieDa objMovie =factory.getModel();

        String[] types = objMovie.getTypes();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,types);
        spinner.setAdapter(adapter);

    }

    public void btnGoOnClick(View view) {
        MovieFactory factory = new MovieFactory();
        IMovieDa objMovie =factory.getModel();
        String type="";
        String str ="";
       List<Movie> listOfmovies=new ArrayList<>();

        type = spinner.getSelectedItem().toString();
        List<Movie> movies=objMovie.getMoviesByType(type);
        String name="";
        name=input.getText().toString();
        //List<Movie> movies=objMovie.getMoviesByType(name);

        for (Movie m:movies){
           // listOfmovies.add((Movie) objMovie.getMovies(name));
            if(m.getTitle().contains(name) || m.getYear().equals(name)){
                str+=m.toString();

            }

       }


        //for(Movie movie:listOfmovies){
        //  str+=movie.toString();

       // }
        result.setText(str);
        //Toast.makeText(this,str, Toast.LENGTH_SHORT).show();
    }
}