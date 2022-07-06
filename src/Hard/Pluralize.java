package Hard;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Given a list of words in the singular form, return a set of those words in the plural form if they
// appear more than once in the list.
public class Pluralize {
    public static String[] pluralize(String[] s) {
        String[]res=new String[s.length];
        for(int i=0;i<s.length;i++){
            for (int j=i;j<s.length;j++){
                if(s[i].equals(s[j])){
                    res[i]=s[i].concat("s");
                }else
                    res[i]=s[i];
            }
        }
        Set<String> set_str=new LinkedHashSet<>(List.of(res));
        return set_str.toArray(new String[0]);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pluralize(new String[]{"cow", "pig", "cow", "cow"})));
        // ["cows", "pig"]
        System.out.println(Arrays.toString(pluralize(new String[]{"table", "table", "table"})));
        // ["tables"]
        System.out.println(Arrays.toString(pluralize(new String[]{"chair", "pencil", "arm"})));
        // ["chair", "pencil", "arm"], but my result: ["chair", "pencil", "arms"]

    }
}
