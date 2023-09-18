// 抽象工厂接口

//抽象工厂模式将多个相关的工厂抽象成一个工厂族，每个工厂族可以生产一系列相关的产品，客户端使用工厂族来创建产品。
public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

