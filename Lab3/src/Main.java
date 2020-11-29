import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Masterpiece m1 = new Masterpiece();
        Brigade b1 = new Brigade();
        Dyscyplina d1 = new Dyscyplina();

        IInterface[] arr = new IInterface[]{m1,b1,d1};
        for(int i =0;i<arr.length;i++){
            arr[i].input();
            arr[i].output();
        }
        ArrayList<Object> arL = new ArrayList<>();
        Masterpiece m2 = new Masterpiece("Статуя","Венера Милосская","Александрос Антиохийский",-130);
        Brigade b2 = new Brigade("13.03.2015",123,"У них был план и они его придерживались","Оно есть");
        Dyscyplina d3 = new Dyscyplina("Физика",15,18,10);

        byte b = 112;
        Byte bWrap = new Byte(b);
        int i = 1831;
        Integer iWrap = new Integer(i);
        char c = 'k';
        Character cWrap = new Character(c);
        arL.add(m2);
        arL.add(b2);
        arL.add(d3);
        arL.add(bWrap);
        arL.add(iWrap);
        arL.add(cWrap);

        for (int j = 0; j < arL.size(); j++) {
            System.out.println(arL.get(j).toString());
            System.out.println(arL.get(j).hashCode());
        }


    }
}
