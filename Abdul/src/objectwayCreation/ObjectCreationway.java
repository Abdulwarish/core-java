package objectwayCreation;

public class ObjectCreationway {

}


/*
A. Using new keyword
This is the most common way to create an object in java. Almost 99% of objects are created in this way.

 MyObject object = new MyObject();
B. Using Class.forName()
If we know the name of the class & if it has a public default constructor we can create an object in this way.

MyObject object = (MyObject) Class.forName("subin.rnd.MyObject").newInstance();
C. Using clone()
The clone() can be used to create a copy of an existing object.

MyObject anotherObject = new MyObject();
MyObject object = (MyObject) anotherObject.clone();
D. Using object deserialization
Object deserialization is nothing but creating an object from its serialized form.

ObjectInputStream inStream = new ObjectInputStream(anInputStream );
MyObject object = (MyObject) inStream.readObject();
*/
 