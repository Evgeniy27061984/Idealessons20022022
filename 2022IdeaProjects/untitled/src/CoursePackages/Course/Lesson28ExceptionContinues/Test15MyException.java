package CoursePackages.Course.Lesson28ExceptionContinues;

public class Test15MyException   {
    void marathon(int airTemperature, int tempRun) throws TuckFootException {
        if (airTemperature > 32) {
            throw new ContractedMuscleException("airTemperature is big");
        }
        if (tempRun > 12) {
            throw new TuckFootException("Temp run is big " + tempRun);
        }
        System.out.println("You win");

    }

    public static void main(String[] args) {
        Test15MyException t = new Test15MyException();
        try {
            t.marathon(10, 28);
        }catch (TuckFootException e ) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally1");
        }

    }
}

class TuckFootException extends Exception{
    public TuckFootException(String message) {
        super(message);
    }
    public TuckFootException() {

    }
}
class ContractedMuscleException extends RuntimeException{
    public ContractedMuscleException(String message) {
        super(message);
    }
    public ContractedMuscleException() {

    }
}
