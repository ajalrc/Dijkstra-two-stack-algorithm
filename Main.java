import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String s="(2+3)";
        int total=0;
        String[] strings=s.split("");

        Stack<Integer> value=new Stack<>();
        Stack<String> operators= new Stack<>();
        for(String num:strings){
            //System.out.println("I am working with "+num);
            if(num.equals("(")){
                //System.out.println("I ignored (");
                continue;
            }
            else if(num.equals(")")){
                int a=value.pop();
                int b=value.pop();
                String operator=operators.pop();
                if (operator.equals("+") ) {
                    total=a+b;
                    value.push(total);
                }
                if (operator.equals("-")) {
                    total=a-b;
                    value.push(total);
                }
                if (operator.equals("*")) {
                    total=a*b;
                    value.push(total);
                }
                if (operator.equals("/")) {
                    total=a/b;
                    value.push(total);
                }
            }

            else if(num.equals("+") || num.equals("-") || num.equals("*") || num.equals("/") ){
                //System.out.println("I pushed the operator "+num);
                operators.push(num);
            }
            else {

                int push=Integer.parseInt(num);
                value.push(push);
            }
        }

        System.out.println("The total sum is "+total);
    }
}

