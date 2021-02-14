import java.util.ArrayList;

public class Gnome{

    public Gnome(){}

    
    /** 
     * @param list
     * @return Comparable[]
     */
    public Comparable[] gnomesort(Comparable[] list){
        int i=1;
        int j=2;
        Comparable temporal;

        while(i<list.length){
            if(list[i-1].compareTo(list[i])>0){
                temporal = list[i-1];
                list[i-1] =list[i];
                list[i--] = temporal;
                i = (i==0) ? j++:i;
            }else{
                i = j; j++;
            }
        }
        return list;
    }
}