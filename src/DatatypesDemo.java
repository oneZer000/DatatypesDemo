public class DatatypesDemo {
    public static void main(String[] args) {
        boolean boolType;
        int intType;
        boolType = true;
        intType = 65;
        boolType = !boolType;
        intType += 5;
        System.out.printf("boolType = %b;\nintType = %d;\nend.", boolType, intType);
    }
}
