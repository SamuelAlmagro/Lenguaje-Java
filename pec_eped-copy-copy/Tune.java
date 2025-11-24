/* Representación de una canción                                             */
public class Tune implements TuneIF {

    String Title;//titulo cancion
    String Author;//autor cancion
    String Genre;//genero cancion
    String Album;//nombre album
    int Year;//año cancion
    int Duration;//duracion cancion en seg
  
    //constructor
    public Tune(String Title, String Author, String Genre, String Album, int Year, int Duration){
        //comprueba que todos los atributos estan llenos y que el año y duracion es no negativo
        if(Title==null || Title.isEmpty() || Author==null || Author.isEmpty() || Genre==null || Genre.isEmpty() || Album==null || Album.isEmpty() || Year <= 0 || Duration <= 0){
            throw new IllegalArgumentException("todos los atributos deben ser validos y positivos");
        }
        //establece los valores de la cancion
        this.Title=Title;
        this.Author=Author;
        this.Genre=Genre;
        this.Album=Album;
        this.Year=Year;
        this.Duration=Duration;
    }
  
  /* Dado un objeto QueryIF conteniendo unos criterios de búsqueda, devuelve */
  /* un valor de verdad indicando si la canción los cumple o no los cumple   */
  /* @param   -un objeto QueryIF con unos criterios de búsqueda              */
  /* @return  -si la canción cumple TODOS los criterios, devolverá verdadero */
  /*          -si la canción incumple algún criterio, devolverá falso        */
  public boolean match(QueryIF q){
        Query query = (Query) q;//downcast
        if(!query.Title.isEmpty() && !Title.equalsIgnoreCase(query.Title)){return false;}
        if(!query.Author.isEmpty() && !Author.equalsIgnoreCase(query.Author)){return false;}
        if(!query.Genre.isEmpty() && !Genre.equalsIgnoreCase(query.Genre)){return false;}
        if(!query.Album.isEmpty() && !Album.equalsIgnoreCase(query.Album)){return false;}
        if(query.Max_year != -1 && Year > query.Max_year){return false;}
        if(query.Min_year != -1 && Year < query.Min_year){return false;}
        if(query.Min_duration != -1 && Duration > query.Min_duration){return false;}
        if(query.Min_duration != -1 && Duration < query.Min_duration){return false;}
    return true;
    }
}


