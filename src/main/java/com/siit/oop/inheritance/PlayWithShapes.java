package com.siit.oop.inheritance;

public class PlayWithShapes {

    public static void main(String[] args) {
        // referinta             =  instanta
        Circle cerculetReference = new Circle();  // cream o referinta de tipul Circle care  refentiaza un obiect de tipul Circle
        Shape circleWithShapeReference = new Circle(); // referinta de tipul Shape - instanta Circle
        AbstractShape abstractCircleShapeReference = new Circle(); // referinta de tipul AbstractShape - instanta Circle
        Shape rectangleShapeReference = new Rectangle();// referinta de tipul Shape - instanta Rectangle
        Shape triangleShape = new Triangle();// referinta de tipul Shape - instanta Triangle
        Shape shape = new Shape(); // referinta de tipul Shape - instanta Shape
        Object objectShape = new Shape();// referinta de tipul Object(parintele tuturor obiectelor in Java) - instanta Shape
//        Circle cc = new Shape(); // bad
        cerculetReference.draw();
//
//        System.out.println(cerculet.getColor());
//        cerculet.setColor("Green");
//        System.out.println(cerculet.getColor());
//        System.out.println(circleShape.getColor());

//        circleShape.draw();
//        abstractCircleShape.draw();

        AbstractShape [] shapes = new AbstractShape[6];
        shapes[0] = cerculetReference;
        shapes[1] = circleWithShapeReference;
        shapes[2] = rectangleShapeReference;
        shapes[3] = triangleShape;
        shapes[4] = abstractCircleShapeReference;
        shapes[5] = new Circle();

        System.out.println("Before for.......");
        for (AbstractShape abstractShapeReference : shapes){
            if (abstractShapeReference instanceof Circle) { // daca vrem sa accesam o anumita metoda din clasa mai specifica putem face cast
                // inainte de CAST verificam ca instanta este de tipul dorit cu operatorul "instanceof"
                Circle altCerculet = (Circle) abstractShapeReference;
                altCerculet.draw2();
            }
            System.out.println(abstractShapeReference instanceof Circle);
            System.out.println(abstractShapeReference instanceof Shape);
            abstractShapeReference = shapes[0];
            abstractShapeReference.draw(); // la compilare compilatorul nu stie ce fel de instanta este referentiata de o anume referinta,
            // el verifica ca metoda apelata sa existe in clasa de tipul careia este referinta, la runtime este executata metoda din clasa instantei
            circleWithShapeReference.draw();
            shapes[0].draw();
            cerculetReference.draw();
        }
    }
}
