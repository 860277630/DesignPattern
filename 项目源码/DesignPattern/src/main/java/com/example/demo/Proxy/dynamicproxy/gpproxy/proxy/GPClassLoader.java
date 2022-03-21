package com.example.demo.Proxy.dynamicproxy.gpproxy.proxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class GPClassLoader extends ClassLoader{
    private File classPathFile;
    public GPClassLoader(){
        String classPath = GPClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }


    /**
     * LoadClass:
     *          1.查看这个Class是否已经被加载
     *          2.如果没有被加载，继续往下走，查看父类加载器，递归调用loadClass()
     *          3.如果父类加载器是null，说明是启动类加载器，查找对应的Class
     *          4.如果都没有找到，就调用findClass(String)
     * findClass:
     *          1.根据名称或位置加载.class字节码
     *          2.然后使用defineClass,返回class对象
     * defineClass:
     *          1.字节码转成class对象
     * @param name
     * @return
     * @throws ClassNotFoundException
     */

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = GPClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            if (classFile.exists()) {
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1) {
                        out.write(buff, 0, len);
                    }
                    return defineClass(className, out.toByteArray(), 0, out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
