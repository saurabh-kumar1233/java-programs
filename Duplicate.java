public class Duplicate {
    
    public static int removeduplication(string str, int idex, strongbulider newstring , boolian map[])
    {
        if(idex==str.length())
        System.out.println(str);
        return;
    }

    char curr = str.charat(idex);
    if(map[curr]-'a'== true)

    {
        removeduplication(str,idex+1,new str,map);
    }
    else

    map[curr-'a'= true]
    {
        removeduplication(str, idex+1,newstr.append,map);
    }
    public static void main(String args[]){

string str="apnnacollaga";

System.out.println(removeduplication(str, 0);
    }
}
