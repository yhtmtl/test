public static void main(String []args){
     String str = "\b\n\t";
        int sz;
        int i =0;
        sz = str.length();
        for (int i = 0; i < sz; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
}
