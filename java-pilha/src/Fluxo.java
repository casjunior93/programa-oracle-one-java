//
public class Fluxo {

    public static void main(String[] args) throws MinhaExcecao{
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    //Para chamar um m�todo que n�o tem uma refer�ncia em m�os ou um objeto criado, ele precisa ser static.
    private static void metodo1(){
        System.out.println("Ini do metodo1");
         try { 
         	metodo2();			
//		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
         	//pega qualquer excecao
        } catch (Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception: " + msg);
//			ex.printStackTrace();
		}
        System.out.println("Fim do metodo1");
    }

    //checked - erro verificado pelo compilador 
    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        
//        ArithmeticException execption = new ArithmeticException("Deu errado");
        throw new ArithmeticException("Minha exce��o arit!");
        
//        System.out.println("Fim do metodo2");
    }
}
