import retrofit2.Call;
import retrofit2.http.*;

public interface TesteApi{

  /*  @GET("b206bb74df045344b585959729d68aa2/raw/cf60ebe7ff869da7aa39f4637f4555b14949554c/wee.json")
    Call<List<wwe>> getwwe();*/

  @Headers("Student:1144002589")
    @POST("tasks")
    Call<Task> addTask(@Body Task task);

  @Headers("Student:1144002589")
  @GET("tasks")
  Call<Task> getTask();

    @Headers("Student:1144002589")
    @GET("tasks/{id}")
    Call<Task> getTaskID(@Path("id") int id);


    @Headers("Student:1144002134")
  @DELETE("tasks/{id}")
  Call<Void> deleteTaskID (@Path("id") int id);

  @Headers("Student:1144002134")
  @PUT("tasks/{id}")
  Call<Task> alterTaskID(@Path("id") int id, @Body String description);

}