/* Representación de los criterios de búsqueda                               */
public class Query implements QueryIF{
    String Title;
    String Author;
    String Genre;
    String Album;
    int Min_year;
    int Max_year;
    int Max_duration;
    int Min_duration;
  /* Devuelve el criterio título                                             */
  /* @return  -una cadena de caracteres con el título de la canción buscada  */
  public String getTitle(){
    return Title;
    }

  /* Devuelve el criterio autor                                              */
  /* @return  -una cadena de caracteres con el autor de la canción buscada   */
  public String getAuthor(){
    return Author;
    }

  /* Devuelve el criterio género                                             */
  /* @return  -una cadena de caracteres con el género de la canción buscada  */
  public String getGenre(){
    return Genre;
    }

  /* Devuelve el criterio álbum                                              */
  /* @return  --una cadena de caracteres con el álbum al que pertenece la    */
  /*          canción buscada                                                */
  public String getAlbum(){
    return Album;
    }

  /* Devuelve el criterio año mínimo                                         */
  /* @return  -un entero con el primer año del intervalo en el que se grabó  */
  /*          la canción a buscar                                            */
  public int getMin_year(){
    return Min_year;
    }

  /* Devuelve el criterio año máximo                                         */
  /* @return  -un entero con el último año del intervalo en el que se grabó  */
  /*          la canción a buscar                                            */
  public int getMax_year(){
    return Max_year;
    }

  /* Devuelve el criterio duración mínima                                    */
  /* @return  -un entero con la duración mínima de la canción a buscar       */
  public int getMin_duration(){
    return Min_duration;
    }

  /* Devuelve el criterio duración máxima                                    */
  /* @return  -un entero con la duración máxima de la canción a buscar       */
  public int getMax_duration(){
    return Max_duration;
    }
    
}

