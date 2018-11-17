import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class Main {
    public static void main(String args[]){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")

                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);

        ////////Criar nova Tarefa//////////////
        try {
            Task post = new Task ();
            post.setStatus(true);
            Call<Task> call = api.addTask(post);
            post.setDescription("*Tarefa*");

            Response<Task> r = call.execute();

            Task t = r.body();

            System.out.println("Tarefa criada : "+ t +"\n");

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        ///////////////FIM Criar nova tarefa///////////////////

        ///////////////Listar TODAS Tarefa///////////////////

        try {
            Call<Task> call = api.getTask();

            Response<Task> r = call.execute();

            List<Task> t = (List<Task>) r.body();

            System.out.println("Tarefas! : \n"+t+"\n");

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        ///////////////FIM Listar TODAS Tarefa///////////////////

        ///////////////Listar Tarefa ID///////////////////
        try {
            Task listById = new Task ();
            Call<Task> call = api.getTaskID(1427);

            Response<Task> r = call.execute();

            Task t = r.body();

            System.out.println("Tarefa ID : \n"+t+"\n");

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        ///////////////FIM Listar Tarefa ID///////////////////

        ///////////////Alterar Tarefa ID///////////////////
        try {
            Task updateById = new Task ();
            Call<Task> call = api.alterTaskID(1428, "TAREFA ALTERADA TESTE");
            Response<Task> r = call.execute();

            Task t = r.body();

            System.out.println("Tarefa Alterada : \n"+t+"\n");

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        ///////////////FIM Alterar Tarefa ID///////////////////

        ///////////////Excluir/Deletar Tarefa ID///////////////////
        try {
            Task deleteById = new Task ();
            Call<Void> call = api.deleteTaskID(1427);

            Response<Void> r = call.execute();

            Void t = r.body();

            System.out.println("A tarefa foi deletada: \n"+t+"\n");

        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
