#include <stdio.h>

int alarusse(int first , int second) {
   int third = 0 ;

   while (first > 0 ){

       if (first % 2 ==1){
           third += second;
       }

       first >>= 1 ;
       second <<= 1;
   }
    return third;
}
int main(){
    int sum = alarusse(45,37);
    printf("%d",sum);
    return 0;
}