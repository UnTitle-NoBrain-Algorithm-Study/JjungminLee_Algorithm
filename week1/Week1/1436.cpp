#include <iostream>
#include<string>
#include<istream>
 
#include<algorithm>
 
using namespace std;
 
 
int main() {
    int n;
    scanf("%d", &n);
 
    int num = 666;
    string s = "";
 
    int count = 1;
    
    while (count != n) {
        num++;
 
        s = to_string(num);
        if (s.find("666") != std::string::npos) {
            count++;
        }
 
            
 
    }
 
    printf("%d\n", num);
}


