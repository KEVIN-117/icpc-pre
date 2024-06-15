#include <iostream>
#include <string>
using namespace std;


int main(){
    string builder = "";
    int n;
    cin>> n;
    int aux = n;
    for (int i = 2; i <= n / 2; i++) {
        while (aux % i == 0) {
            aux /= i;
            builder += "x" + i;
            cout<<builder;
        }
    }

    cout<<builder<<endl;
    if (builder == "") {
        cout<<n<<endl;
    } else {
        cout<<builder;
    }
    return 0;
}
