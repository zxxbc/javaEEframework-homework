 class test4 {

    @Annotation(value = " 1")
    public void function1() {
        // 方法体
        System.out.println("方法1被调用");
    }

    @Annotation(value = " 2")
    public void function2() {
        // 方法体、
        System.out.println("方法2被调用");
    }

    public static void main(String[] args) {
        ReflectionDemo4 processor = new ReflectionDemo4();
        test4 testObject = new test4();

        ReflectionDemo4.processAnnotations(testObject);
    }
}
