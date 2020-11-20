package Singleton;

public class SingletonThreadSafe {
	private static volatile SingletonThreadSafe singletonInstance;
    
    private SingletonThreadSafe() {}
    
    public static SingletonThreadSafe getInstance() {
        if(singletonInstance == null) {
            synchronized(SingletonThreadSafe.class) {
                if(singletonInstance == null) {
                    singletonInstance = new SingletonThreadSafe();
                }
            }
        }
        return singletonInstance;
    }
}
