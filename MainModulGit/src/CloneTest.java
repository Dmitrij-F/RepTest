
public class CloneTest implements Cloneable{
    public Cloneable clone() throws CloneNotSupportedException {
        return (CloneTest) super.clone();
    }
}
