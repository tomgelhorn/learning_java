public class Strings {
    public boolean comp(String a, String b) {
        return a.equals(b);
    }

    public boolean cont(String a, String b) {
        return a.contains(b);
    }

    public String builder(){
        String s = new String();
        return s;
    }

    public void playString() {
        String str = "abc";
        str.charAt(0); // return value: ‘a’
        str.concat("str2"); // return value: “abcstr2”
        str.indexOf("b"); // return value: 1
        str.contains("bc"); // return value: true
        str.replace("a", "z"); // return value: “zbc”
        str.split(""); // return value:[“a”,”b”,”c”]
    }


}
