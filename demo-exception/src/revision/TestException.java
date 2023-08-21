package revision;

public class TestException {

    public static int method(int amount) throws BusinessException {
        if (amount >= 0)
            return amount * 100;
        throw new BusinessException("amount < 0");
    }
        public static int method2(int amount) throws AbcException {
        if (amount >= 0)
            return amount * 100;
        throw new AbcException();
    }
    public static void main(String[] args) {
        // Exception // checked exception
        // Approach 1: handled by try & carch
        try {
            int result = method(2); // once hit error, cannot proceed the rest
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        } // catch (Exception e) { can set many catch code block
            // and Exception and represent any Exception, so try not to use it becuase not specific             
        finally {
            System.out.println("Print no matter what");
        }


        // RuntimeException // unchecked exception
        int a = 10;
        if (a >= 0) {
            int result2 = method2(a); // Don't need to handle runtime exception
        }
    }
}
