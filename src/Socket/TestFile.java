package Socket;

import java.io.*;
import java.util.ArrayList;

public class TestFile {
    public static void main(String[] args) {

        ArrayList<Employees> a = new ArrayList<>();
        a.add(new Employees("001","Le Van Nam",199));
        a.add(new Employees("002","Nguyen Vu Lam",200));
        a.add(new Employees("003","Tran Thi Nhu",201));

        File f = new File("Employees.txt");
        try {
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Employees x: a ){
                pw.println(x.getId()+"," + x.getName()+"," + x.getSalary());
            }
            pw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
