#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;
    
    vector<char> initial(n), rotated(n);
    for (int i = 0; i < n; i++) {
        cin >> initial[i];
    }
    for (int i = 0; i < n; i++) {
        cin >> rotated[i];
    }
    
    int index = -1;
    for (int i = 0; i < n; i++) {
        if (initial[0] == rotated[i]) {
            index = i;
            break;
        }
    }
    
    bool shuffled = false;
    for (int i = 0; i < n; i++) {
        if (initial[i] != rotated[(i + index) % n]) {
            shuffled = true;
            break;
        }
    }
    
    if (shuffled) {
        cout << "Shuffled" << endl;
    } else {
        cout << "Not Shuffled" << endl;
    }
    
    return 0;
}
