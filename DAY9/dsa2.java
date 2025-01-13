class dsa2 {
    public String[] findWords(String[] words) {
        String[] str=new String[];
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length;j++){
               String m=words[i].charAt(j);
                if(m=q||m=w||m=e||m=r||m=t||m=y||m=u||m=i||m=o||m=p){
                    int set='qwertyuiop';
                }
                else if(m=a||m=s||m=d||m=f||m=g||m=h||m=j||m=k||m=l){
                    int set='asdfghjkl';
                }
                else{
                    int set='zxcvbnm';
                }
            }
            
            for(int k=0;k<words[i].length;k++){
                String m=words[i].charAt(k);
                String[] arr= new String[m.length()];
                for(String w: set){
                    if(m==w){
                        arr[k]=m;
                    }
                    else{
                        arr[]=[];
                        break;
                    }
                }
            }
            if(arr){
str[i]=words[i];
            }
        }
        return str;
    }
}