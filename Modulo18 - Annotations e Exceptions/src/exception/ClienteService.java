package exception;

public class ClienteService {

   public static void consultarCliente(String codigo) throws ClienteNaoEncontradoDoisExcpetion{
       try{
           ClienteDAO.consultarCliente(codigo);
       } catch (ClienteNaoEncontradoException e){
          throw new ClienteNaoEncontradoDoisExcpetion(e.getMessage(), e);
       }
   }

}
