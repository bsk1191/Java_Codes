public class Main
{
public static void main(String[] args) {
int n=7;int count=0;int sum=2;int c=1;
for(int i=1;i<=n;i++){
if(i<=n/2+1){
sum=sum+c;count+=1;
int s=sum;
for(int j=0;j<count;j++){
System.out.print(s–);
}
c=c+1;
}
else{
c=c-1;
sum=sum-c;count-=1;
int s=sum;
for(int j=0;j<count;j++){
System.out.print(s–);
} }
System.out.println();
} }
}
