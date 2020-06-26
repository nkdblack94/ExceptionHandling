package triangleException;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException (){
        super("số nhập  không hợp lệ");
    }
    public IllegalTriangleException(String string){
        super(string);
    }
}
