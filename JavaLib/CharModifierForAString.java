
/*
==================================================================================================================
 Name        : Char Modifier For A String
 Author      : Gokhan Gobus
 Version     : 
 Copyright   : Gokhan Gobus
 Description : replace,place or remove a char inside a string
 =================================================================================================================
*/

    public static String replaceCharAt(String s, int pos, char c) {
        return s.substring(0,pos) + c + s.substring(pos+1);
    }

    public static String placeCharAt(String s, int pos, char c) {

        if (pos == 0) {
            return c + s;
        } else if (pos == s.length()) {
            return s + c;
        } else {
            return s.substring(0, pos + 1) + c + s.substring(pos + 1);
        }
    }
    public static String removeCharAt(String s, int pos) {


        if (pos == 0) {
            return s.substring(1);
        } else if (pos == s.length()) {
            return s.substring(0,s.length()-1);
        } else {
            return s.substring(0,pos) + s.substring(pos+1);
        }
    }
