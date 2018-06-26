package sample;


import javafx.scene.text.Text;



public class Controller {

    private String x = "";
    private double a;
    private double b;
    private String lastOp = "";
    private String op = "+";

    public Text disp;
    public Text hisdis;


    public void handleClick1(){
        if (x.length()>= 8){x = x.substring(0, 8);}else
        disp.setText(x = x +"1");
    }
    public void handleClick2(){
        if (x.length()>= 8){x = x.substring(0, 8);}else
        disp.setText(x = x + "2");
    }
    public void handleClick3(){
        if (x.length()>= 8){x = x.substring(0, 8);}else
        disp.setText(x = x + "3");
    }
    public void handleClick4(){
        if (x.length()>= 8){x = x.substring(0, 8);}else
        disp.setText(x = x + "4");
    }
    public void handleClick5(){
        if (x.length()>= 8){x = x.substring(0, 8);}else
        disp.setText(x = x + "5");
    }
    public void handleClick6(){
        if (x.length()>= 8){x = x.substring(0, 8);}else
        disp.setText(x = x + "6");
    }
    public void handleClick7(){
        if (x.length()>= 8){x = x.substring(0, 8);}else
        disp.setText(x = x + "7");
    }
    public void handleClick8(){
        if (x.length()>= 8){x = x.substring(0, 8);}else
        disp.setText(x = x + "8");
    }
    public void handleClick9(){
        if (x.length()>= 8){x = x.substring(0, 8);}else
        disp.setText(x = x + "9");
    }
    public void handleClickzero() {
        if (x.length() >= 8) {
            x = x.substring(0, 8);
        } else {
            if (x.equals("0") || x.equals("")) {
            } else {
                disp.setText(x = x + "0");
            }
        }
    }
    public void handleClickerese(){
        disp.setText(x = "");
    }
    public void handleClickpoint(){
        if (x.indexOf('x') < 0) {
            if (x.equals(""))
                disp.setText(x = "0.");
            else
                disp.setText(x = x + ".");
        }
    }

    public void handleClickSwOp(){
        if (op.equals("+")){
            op = "-";
            disp.setText(x = "-" + x);
        }else if (op.equals("-")){
            op = "+";
            disp.setText(x = x.replace("-", ""));
        }
    }


    public void handleClicksum(){
        opCheck();
        hisdis.setText(x = x + " +");
        disp.setText("");
        x = "";
        lastOp = "+";
    }
    public void handleClicksub() {
        opCheck();
        hisdis.setText(x = x + " -");
        disp.setText("");
        x = "";
        lastOp = "-";
    }
    public void handleClickmulti(){
        opCheck();
        hisdis.setText(x = x + " *");
        disp.setText("");
        x = "";
        lastOp = "*";
    }
    public void handleClickdev(){
        opCheck();
        hisdis.setText(x = x + " /");
        disp.setText("");
        x = "";
        lastOp = "/";
    }

    private void opCheck() {
        if (lastOp.equals("")){a = Double.parseDouble(x);}
        else{
            b = Double.parseDouble(x);
            if (lastOp.equals("-")) {
                a -= b;
                x = String.valueOf(a);
            }else if (lastOp.equals("+")){
                a += b;
                x = String.valueOf(a);
            }
            else if (lastOp.equals("*")){
                a *= b;
                x = String.valueOf(a);
            }
            else if (lastOp.equals("/")&& b != 0){
                a /= b;
                x = String.valueOf(a);
            }else {x = "Error";}
            if (x.length()>= 8){x = x.substring(0, 8);}
        }
    }


    public void handleClickres(){
        if (!x.equals("")) {
            opCheck();
            if (x.charAt(x.length()-2)=='.' && x.charAt(x.length()-1)=='0'){
                x = x.substring(0, x.length() - 2);
            }
            hisdis.setText("");
            disp.setText(x);
            lastOp = "";
        }


    }
    public void handleClickback(){
        if (x != null && x.length() > 0) {
            x = x.substring(0, x.length() - 1);
        }
        disp.setText(x);
    }

}
