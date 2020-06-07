//
public class FluxoTratado {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    //Para chamar um método que não tem uma referência em mãos ou um objeto criado, ele precisa ser static.
    private static void metodo1() {
        System.out.println("Ini do metodo1");
         try {
         	metodo2();			
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception: " + msg);
		}
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
//            int a = 1/0;
            Conta c = null;
            c.deposita();
            
//            try {
//            	int a = 1/0;
//            } catch (ArithmeticException ex) {
//				System.out.println("ArithmeticException");
//			}
            
        }
        System.out.println("Fim do metodo2");
    }
}
