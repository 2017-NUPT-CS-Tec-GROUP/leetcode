package leetCode;


public class JudgeRouteCircle {

public String reverseWords(String s) {
        String[] s_temp=s.split(" ");
        String Resu="";
        int i=0;
        for(String a:s_temp){
        	StringBuffer sb=new StringBuffer(a);
        	s_temp[i]=String.valueOf(sb.reverse());
        	i++;
        }
	return String.join(" ", s_temp);
    }

public String reverseStr(String s, int k) {
	String res="";
	for(int i=1;(i-1)*2*k<s.length();i++){
		String s_temp=s.substring((i-1)*2*k,i*2*k>s.length()?s.length():i*2*k);
		String a=s_temp.substring(0,k>s_temp.length()?s_temp.length():k);
		String b=s_temp.substring(k>s_temp.length()?s_temp.length():k,s_temp.length());
		StringBuffer bf=new StringBuffer(a);
		String[] s_p={bf.reverse().toString(),b};
		res=res+String.join("", s_p);
	}
	return res;
}
}
