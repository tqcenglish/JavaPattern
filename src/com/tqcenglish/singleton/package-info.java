/**
 *  单例模式.
 *  <p>单例模式是自己创建自己的唯一实例，所有需要调用的对象都只调用这一实例。<br>
 *  </br>
 *  单例模式依靠私有的构造方法达到外部不能创建实例，然后才有反射的方式可以让单例失效。
 *  <br>
 *  单例的三种模式:懒汉式单例，饿汉式单例，登记式单例
 *  </br>
 *  {@link http://devbean.blog.51cto.com/448512/203501/}}
/**
 * @author tqcenglish
 *
 */
package com.tqcenglish.singleton;