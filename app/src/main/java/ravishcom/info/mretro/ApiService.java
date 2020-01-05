package ravishcom.info.mretro;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Akshay Raj on 05/02/18.
 * akshay@snowcorp.org
 * www.snowcorp.org
 */

public interface ApiService {
    String BASE_URL = "https://cartrustindia.com/index.php/en/account/";

    @Multipart
    @POST("addcarApi")
    Call<ResponseBody> uploadMultiple(
            @Part("car_type") RequestBody description,
            @Part List<MultipartBody.Part> files);
}
