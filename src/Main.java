public class Main {
    public static void main(String[] args) throws AnException {
        try {
            System.out.println("Primeito print");
            shouldThrowAnException();
            System.out.println("Segundo print");
        } catch (Exception e) {
            throw new AnException("Exceção da AnException");
        } finally {
            System.out.println("Mensagem do finally");
        }
    }

    static Boolean shouldThrowAnException() throws AnException {
        throw new AnException("Exception chamada de dentro do método");
    }

    static Boolean shouldThrowAnotherException(String message) throws AnotherException {
        return true;
    }
}

