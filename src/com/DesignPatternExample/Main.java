package com.DesignPatternExample;
import java.awt.color.ColorSpace;

public class Main {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
/*      Abstract Factory
        AbstractFactory shapeFactory= FactoryProvider.getFactory(true);
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();
        System.out.println("Testing.......");

*//*    Builder
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
*/
/*      prototype
        ShapeCache.loadCache();
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
        System.out.println("Shape : " + clonedShape.getId());
        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        System.out.println("Shape : " + clonedShape2.getId());
        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
        System.out.println("Shape : " + clonedShape3.getId());*/

/*        Object pool
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb: //localhost/mydb",
                "sa", "password");

        // Get a connection:
        Connection con = pool.takeOut();
        // Return the connection:
        pool.takeIn(con);*/
     /* Singleton
        SingletonClassExample singletonClassExample= SingletonClassExample.getInstance();
        singletonClassExample.getX();*/

/*  Adapter
      AudioPlayer audioPlayer = new AudioPlayer();
      audioPlayer.play("mp3", "beyond the horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far far away.vlc");
      audioPlayer.play("avi", "mind me.avi");*/
/*        Bridge
      Shapes redCircle = new Circle(100,100, 10, new RedCircle());
      Shapes greenCircle = new Circle(100,100, 10, new GreenCircle());

      redCircle.draw();
      greenCircle.draw();*/

    /*  Composite
        Department salesDepartment = new SalesDepartment(
                1, "Sales department");
        Department financialDepartment = new FinancialDepartment(
                2, "Financial department");

        HeadDepartment headDepartment = new HeadDepartment(
                3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();*/

/*     Decorator
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();*/
/*  Facade
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();*/

       /* Flyweight
            for(int i=0; i < 20; ++i) {
                FlyweightCircle circle = (FlyweightCircle)FlyweightShapeFactory.getCircle(getRandomColor());
                circle.setX(getRandomX());
                circle.setY(getRandomY());
                circle.setRadius(100);
                circle.draw();*/

        /* Private class Data
         var stew = new Stew(1, 2, 3, 4);
        stew.mix();
        stew.mix();
        var immutableStew = new ImmutableStew(2, 4, 3, 6);
        immutableStew.mix();*/
        /* Proxy
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();*/

    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

}
