package br.com.digitalhouse.bclip.service.api;

import br.com.digitalhouse.bclip.model.NoticiaFromApiResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NoticiasApi {

    @GET("everything")
    Observable<NoticiaFromApiResponse> getNoticiasFromApi (@Query("api_key") String apiKey,
                                                           @Query("format") String format);


}
