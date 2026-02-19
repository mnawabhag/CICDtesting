public class SingletonExecution {

    private static volatile  SingletonExecution instance;

    private SingletonExecution(){}

    public static synchronized SingletonExecution getInstance(){

        if(instance==null){
            synchronized (SingletonExecution.class) {
                if(instance==null){
                    instance=new SingletonExecution();
                }
            }
        }
        return instance;
    }

}
