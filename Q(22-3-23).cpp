#include <iostream>
#include <string>

using namespace std;
string op(string str,int num) {
    string new_string,reverse;
    new_string="";
    reverse=string(str.rbegin(),str.rend());
    for (int i=1 ; i<=num ;i ++) {
        if (i%2!=0) new_string+=reverse;
        else new_string+=str;
    }
    return new_string;
}

int main() {
    string s,garland;
    cin>>s;
    garland="";
    for (auto it=s.begin() ; it!=s.end() ;it ++) {
        if (isalpha(*it)) garland.push_back(*it);
        
        else if (isdigit(*it)) garland+=op(garland,(int)*it-'0');
    }
        
     cout<<garland;
    
}
