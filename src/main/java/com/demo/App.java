package com.demo;

import cn.z.id.Id;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        test();
        // none();
        // part();
        // init();
    }

    /**
     * 测试
     */
    static void test() {
        System.out.println("ID为：" + Id.next());
        // [main] INFO cn.z.id.autoconfigure.IdAutoConfiguration -
        // 读取到配置文件，MACHINE_ID为0，MACHINE_BITS为8，SEQUENCE_BITS为14
        // [main] INFO cn.z.id.Id - 预初始化...
        // [main] INFO cn.z.id.Id - 初始化，MACHINE_ID为0，MACHINE_BITS为8，SEQUENCE_BITS为12
        // [main] INFO cn.z.id.Id -
        // 最大机器码MACHINE_ID为255，1ms内最多生成Id数量为4096，时钟最早回拨到2021-01-01
        // 08:00:00.0，可使用时间大约为278年，失效日期为2299-09-27 23:10:22.207
        // [main] INFO cn.z.id.Id - 手动初始化...
        // [main] INFO cn.z.id.Id - 初始化，MACHINE_ID为0，MACHINE_BITS为8，SEQUENCE_BITS为14
        // [main] INFO cn.z.id.Id -
        // 最大机器码MACHINE_ID为255，1ms内最多生成Id数量为16384，时钟最早回拨到2021-01-01
        // 08:00:00.0，可使用时间大约为69年，失效日期为2090-09-07 23:47:35.551
        // [main] INFO com.demo.App - Started App in 0.798 seconds (JVM running for
        // 1.632)
        // ID为：22502074365247488
    }

    /**
     * 没有配置
     */
    static void none() {
        System.out.println("ID为：" + Id.next());
        // [main] INFO com.demo.App - Started App in 0.735 seconds (JVM running for
        // 1.401)
        // [main] INFO cn.z.id.Id - 预初始化...
        // [main] INFO cn.z.id.Id - 初始化，MACHINE_ID为0，MACHINE_BITS为8，SEQUENCE_BITS为12
        // [main] INFO cn.z.id.Id -
        // 最大机器码MACHINE_ID为255，1ms内最多生成Id数量为4096，时钟最早回拨到2021-01-01
        // 08:00:00.0，可使用时间大约为278年，失效日期为2299-09-27 23:10:22.207
        // ID为：5625838540161024
    }

    /**
     * 配置部分属性
     */
    static void part() {
        System.out.println("ID为：" + Id.next());
        // [main] INFO cn.z.id.autoconfigure.IdAutoConfiguration - 读取到配置文件，MACHINE_ID为10
        // [main] INFO cn.z.id.Id - 预初始化...
        // [main] INFO cn.z.id.Id - 初始化，MACHINE_ID为0，MACHINE_BITS为8，SEQUENCE_BITS为12
        // [main] INFO cn.z.id.Id -
        // 最大机器码MACHINE_ID为255，1ms内最多生成Id数量为4096，时钟最早回拨到2021-01-01
        // 08:00:00.0，可使用时间大约为278年，失效日期为2299-09-27 23:10:22.207
        // [main] INFO cn.z.id.Id - 手动初始化...
        // [main] INFO cn.z.id.Id - 初始化，MACHINE_ID为10，MACHINE_BITS为8，SEQUENCE_BITS为12
        // [main] INFO cn.z.id.Id -
        // 最大机器码MACHINE_ID为255，1ms内最多生成Id数量为4096，时钟最早回拨到2021-01-01
        // 08:00:00.0，可使用时间大约为278年，失效日期为2299-09-27 23:10:22.207
        // [main] INFO com.demo.App - Started App in 0.825 seconds (JVM running for
        // 1.509)
        // ID为：5626263803830272
    }

    /**
     * 配置属性后又手动初始化
     */
    static void init() {
        Id.init(20, 6, 10);
        System.out.println("ID为：" + Id.next());
        // [main] INFO cn.z.id.autoconfigure.IdAutoConfiguration -
        // 读取到配置文件，MACHINE_ID为0，MACHINE_BITS为8，SEQUENCE_BITS为6
        // [main] INFO cn.z.id.Id - 预初始化...
        // [main] INFO cn.z.id.Id - 初始化，MACHINE_ID为0，MACHINE_BITS为8，SEQUENCE_BITS为12
        // [main] INFO cn.z.id.Id -
        // 最大机器码MACHINE_ID为255，1ms内最多生成Id数量为4096，时钟最早回拨到2021-01-01
        // 08:00:00.0，可使用时间大约为278年，失效日期为2299-09-27 23:10:22.207
        // [main] INFO cn.z.id.Id - 手动初始化...
        // [main] INFO cn.z.id.Id - 初始化，MACHINE_ID为0，MACHINE_BITS为8，SEQUENCE_BITS为6
        // [main] INFO cn.z.id.Id -
        // 最大机器码MACHINE_ID为255，1ms内最多生成Id数量为64，时钟最早回拨到2021-01-01
        // 08:00:00.0，可使用时间大约为17851年，失效日期为19860-03-05 19:03:41.311
        // [main] INFO com.demo.App - Started App in 0.754 seconds (JVM running for
        // 1.378)
        // [main] WARN cn.z.id.Id - 已经初始化过了，不可重复初始化！
        // ID为：87913675669504
    }

}
