# ApplicationLifecycle
监听应用程序生命周期的示例

# 如何使用？
1. 将 AppLifecycleHandler.java 文件拷贝到你的项目中；
2. 在 Application 中注册（注意不要忘记将它添加到AndroidManifest.xml文件中）
```Java
    public class MyApplication extends Application {
        @Override
        public void onCreate() {
            super.onCreate();
            registerActivityLifecycleCallbacks(new AppLifecycleHandler());
        }
    }
```

3. 在 AppLifecycleHandler 的applicationDidBecomeActive和applicationDidEnterBackground方法写业务处理：

```Java
    public void applicationDidBecomeActive() {
        android.util.Log.w("test", "程序进入前台");
        //TODO:
    }

    public void applicationDidEnterBackground() {
        android.util.Log.w("test", "程序进入后台");
        //TODO:
    }
```
