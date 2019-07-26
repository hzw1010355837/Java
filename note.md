* Java基础

  * `.class`是`.java`编译之后出来的字节码文件
    * 字节:数据的最小单位,8位一个字节

* 面向对象&面向过程

  * 面向过程:当实现一个功能时,每一个具体的步骤都要亲历亲为,详细处理每一个细节
  * 面向对象:当实现一个功能时,不关心具体的步骤,找一个已经具有该功能的人,来帮我做事

* API(Application Programming Interface):应用程序编程接口

  
> * 封装\继承\多态
>   * 封装性:方法就是一种封装,关键字private也是一种封装 **将细节信息隐藏起来,对于外界不可见**
>   * 继承性:继承是多态的前提,没有继承就没有多态: 解决问题:共性抽取 extends
>   * 多态性:
>
> * 抽象:python是用多继承实现抽象和接口
>
>   * 在抽象类中定义抽象方法,具体实现在子类中实现.ep:`动物抽象类中有eat方法,具体实现在dog,cat中调用`
>
>     ```java
>     public abstract class Animal { // 定义一个抽象类
>         public abstract void eat(); // 在抽象类中定义抽象方法
>         public void normalMethod(){ // 这是普通成员方法
>         }
>     }
>     ```
>
>     * 1,不能直接new抽象类对象~~Animal cat = new Animal();~~  2,必须用一个子类来继承抽象类 3,子类必须**覆盖重写抽象父类中所有抽象方法**:即**覆盖重写(实现),子类去掉abstract关键字,补上方法体大括号**  4, 创建子类对象进行使用
>     * python:JAVA由于不支持多继承,故创造了接口这个概念来解决这个问题.而Python本身是支持多继承的,故在Python中,没有接口这种类,只有这个概念而已,只不过Python中的接口实现,是通过多继承实现的.
>       * *metaclass=ABCMeta,以及@abstractclassmethod 其作用是检查子类中的方法是否按父类的名称书写,否则将报错误来提醒程序员*
>
> * 接口:引用类型(**抽象方法**)   类的公共规范标准
>
>   * ```java
>     public interface DemoInterface { // 定义接口
>     }
>     public class DemoClass { // 定义类
>     }
>     ```
>
>   * 高版本JDK中,接口中可以包含以下:常量,默认方法,抽象方法,静态方法,私有方法
>
>     * `public default void three() {}`接口中创建默认方法: 解决接口升级  (解释:当有多个实现类已经实现接口类时,新建的实现类又想在接口内定义新方法时使用)
>       * 实现类可以重写默认方法,创建的实现类对象调用的是重写后的
>
>   * 接口不能直接使用,必须有实现类(类似子类)来实现(extends)该接口 `public class 实现类名称 implement 接口类名称 {}`
>
>     * 与子类一样,实现类必须覆盖重写接口类中所有抽象方法

> * 关键字
>
>   * private(__name):私有化,本类中仍可以随意访问, 超出本类范围,不能直接访问**get/set**
>
>   * this(self):成员方法内优先使用**局部变量**,this修饰表示使用的是成员变量
>
>   * void:无返回值
>
>   * static:静态,一旦用了static关键字,**static修饰的内容不再属于对象,而属于类,凡是本类的对象共享同一份**
>
>     * static修饰成员变量(实例属性)-->类属性:**类对象** 所拥有的属性,它被 **该类的所有实例对象所共有**
>
>       * python:**类属性只能通过类对象修改，不能通过实例对象修改**
>
>         * ```python
>           class F:
>           	b = None
>               @classmethod
>               def a(cls, num):
>                   cls.b = num # 只能通过类对象对象修改类属性
>           c = F()
>           c.b # None
>           c.a(2)
>           c.b # 2
>           ```
>
>       * java:**类属性可以通过实例对象修改(ide不推荐)**
>
>     * static修饰成员方法(实例方法)-->类方法: 作用,**不用创建实例对象,直接使用类对象就能使用**
>
>       * python:当方法中**需要使用类对象** (如访问私有类属性等)时,定义类方法  类对象,实例对象都可调用
>         * 当形参不需要使用类对象cls.或者实例对象self时,可以定义成静态方法-->**取消不需要的参数传递**,有利于**减少不必要的内存占用和性能消耗**
>       * java:可以用类对象,实例对象调用(**编译后实际上还是类对象调用**)  推荐使用类对象
>         * java中静态不能直接访问非静态:内存中先有静态,后有非静态
>         * 可以理解为类方法
>         * java中静态内容存放在静态区(方法区)
>
>     * static修饰代码块:  静态代码块只执行一次,构造方法执行多次也是一样.同时静态代码块比构造方法先执行
>
>       * 典型用途:用来一次性对静态成员变量进行赋值
>
>     * static修饰接口中方法:静态方法:将abstract或default替换成static,并带上方法体
>
>       * 与类中的static类似,接口中的静态方法调用: `接口名.静态方法`
>
>   * super:子类构造可以通过super关键字调用父类重载构造
>
>     * 用法:1子类成员方法中,访问父类成员变量或成员方法 2子类构造方法中,访问父类构造方法
>
>       
>
> * Others:
>
>   * 构造方法**专门用来创建对象的方法new**:python的`__new__`和`__init__`
>
>     1. 构造方法名称必须和所在类名称完全一样
>     2. 构造方法不要写返回值类型,连void都不用写
>     3. 构造方法不能return一个具体的返回值
>     4. 如果没有些构造方法,编译器默认已经有一个构造方法,没有参数\方法体,什么事情都不做
>     5. 构造方法也可以实现**重载**
>
>   * 重载(@Override):多个方法名称一样,参数列表不一样
>
>     1. 参数个数不同(char & char,char)
>     2. 参数类型不同(int,int & float,float)
>     3. 参数多类型顺序不同(int,double & double,int)
>
>   * 成员变量:实例属性
>
>   * 成员方法:实例方法
>
>   * 类变量**必须声明static类型**:类属性
>
>   * 类方法:类中static申明的方法
>
>   * 基本类型:4类8
>
>     * 整数类型:默认值为0
>     * 浮点类型:默认值为0.0
>     * 字符类型:默认值为'\u0000'
>     * 布尔整数类型:默认值为false
>
>   * 引用类型:默认值为null
>
>     * 数组:1,引用数据类型 2,数组当中的多个数据,类型必须统一 3,数组长度在程序运行时不可改变
>
>       * ```java
>          int array = new int[3]; // 动态创建:指定长度
>          int array = new int[] {10, 20, 30}; // 静态创建:指定内容
>          int array = {10, 20, 30} // 静态省略写法
>          ```
>
>       * 空指针异常:NullPointerException:忘了new
>
>       * ```java
>          int len = array.length; // python:len(array)
>          ```
>
>       * 对象数组:`Person[] array = new Person[3];`也就是数组里也可存放对象
>
>     * String
>
>   * java内存划分成5个部分:
>
>     1. 栈**Stack**:存放的都是方法中的局部变量
>
>        *  局部变量:方法的参数,或者是方法**{}**内部的变量
>        * 作用域:一旦超出作用域,以可从占内存当中消失
>
>     2. 堆**Heap**:凡是new出来的东西,都在堆当中
>
>        * 堆内存里面的东西都有一个地址值:16进制
>        * 堆内存里面的数据,都有默认值
>
>     3. 方法区**Method Area**:存储`.class`相关信息,包含方法的信息 
>
>     4. 本地方法栈**Native Method Stack**: 与操作系统相关
>
>     5. 寄存器**pc Register**: 与CPU相关
>
>        * example:一个数组
>
>          * ```java
>             public static void main(String[] args) {
>              	int[] array = new int[3];
>              	array[0] = 10;
>              	array[1] = 20;
>             array[2] = 30;
>             System.out.printLn(array)
>              }
>              /*
>              栈:main(String[] args) 为main方法开辟一块内存空间
>              	int[] array:局部变量
>              堆:new出来的东西都在堆内存
>              new int[3]--->地址值:0x666
>              10	[0]
>              20	[1]
>              30	[2]
>              方法区(存放方法):public static void main(String[] args)  从方法区看方法信息,然后将信息加载到栈内存
>              进栈(调用方法时):从方法区看方法信息,然后将信息加载到栈内存,为main方法开辟一块内存空间. 
>              main方法之后的方法叫压栈
>              new出来的数组在堆当中,名称(变量)在栈当中存储的是地址值
>              */
>             ```

> * API:
>
>   * Scanner:键盘输入类
>
>     * ```java
>        Scanner sc = new Scanner(System.in);
>         int num = sc.nextInt(); // 从键盘接收的字符串转换成int
>         String str = sc.next(); // 默认接收全都是字符串
>        ```
>    ```
>   
>   * Random:产生随机数字类
>   
>     * ```java
>    Random r= new Random();
>    int num = r.nextInt(); // 获取随机数int,范围int所有范围,有正负
>    Random r= new Random(10); //0~9随机数
>    ```
>
>   * ArrayList<E>:ArrayList集合的长度是可以随意改变的
>
>     * <E>代表泛型:也就是装在集合当中的所有元素,全都是同一类型 **泛型只能时引用类型**
>
>     * ```java
>        ArrayList<String> list = new ArrayList<>(); // 创建集合list
>        list.add("字符串1"); // 添加元素,有返回值(boolean)代表添加成功或者失败
>        list.get(0); // 返回0索引元素
>        list.remove(0); // 返回被删除元素
>        list.size(); // 得到list长度
>         /* 需要存储基本类型时,必须使用基本类型对应的"包装类"
>         byte 		Byte
>         int			Interger **
>         short		Short
>         long 		Long
>         float 		Float
>         double		Double
>         char		Character **
>         boolean		Boolean
>         */
>        ArrayList<Interger> arrayA = new ArrayList<>();
>        arrayA.add(100);
>        arrayA.get(100);
>        ```
>
>
>     * 对于ArrayList来说,直接打印得到的不是地址值,而是内容,内容空则为[]
>    
>     * 需要存储基本类型时,必须使用基本类型对应的"包装类" 
>    
>       * 自动装箱:基本类型 --> 包装类型
>       * 自动拆箱:包装类型 --> 基本类型
>
>   * String类:字符串,所有双引号字符串,都是String类的对象.**字符串内容永不可变** 
>
>     * 字符串效果上相当于时char[]字符数组,但是底层原理时byte[]字节数组 
>
>     * ```java
>        String str = new String("abc"); // abc
>        char[] charArray = {'A', 'B', 'C'};
>        String str1 = new String(charArray); // ABC
>        byte[] byteArray = {97, 98, 99};
>        String str2 = new String(byteArray); // abc
>        String str3 = "abc"; // 在字符串常量池中
>        ```
>
>        ```java
>        // 字符串中相关方法
>        str1.equals(str2); // 返回true&false ,如果比较双方有常量时,推荐将常量放前面 原因:空指针异常
>        str1.equalsIgnoreCase(str2); // 忽略大小写, 只有英文区分大小写
>        str1.length(); // 返回字符串长度
>        str1.concat(str2); // 字符串拼接,返回新的字符串
>        str1.charAt(1); // 获取指定索引单个字符
>        str1.indexOf("B");// 查找匹配字符串第一次索引, 返回索引值,没有则返回-1
>        // 字符串截取 两种重载
>        str1.substring(1); // 返回新字符串 "BC"
>        str1.substring(0,3); // 左闭右开 "ABC"
>        
>        char[] charArray = "Hello".toCharAyyay(); // 将字符串拆分成为字符数组作为返回值
>        byte[] charArray = "Hello".getBytes(); // 将字符串拆分成为字节数组作为返回值
>        String str11 = "How do you do?";
>        String str22 = str1.replace("o", "*"); // 替换
>        String str33 = str1.split(" "); // 以.分割时-->\\.转义
>        ```
>
>     * 字符串常量池:位于堆内存中
>
>       * 双引号直接写的字符串在常量池中,new的不在池中
>       * 对于引用类型来说,==进行的是地址值的比较
>
>   * Arrays
>
>     * 提供大量静态方法,实现数组常见操作
>
>     * ```java
>       int[] array = {10, 20, 30};
>       String str = Arrays.toString(array); // [10, 20, 30]
>       Arrays.sort(array);
>       ```