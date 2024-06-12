package exception;

public class ClienteNaoEncontradoDoisExcpetion extends Exception{
    public ClienteNaoEncontradoDoisExcpetion(String msg, Throwable e){
        super(msg,e);
    }
}
