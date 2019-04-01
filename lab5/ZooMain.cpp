#include <iostream>
#include "animal.h"
#include "childAnimal.h"

int main() {
    int sel = 1;
    int i = 0;
    Mammal *mammals[10];

    while (sel != 4 || sel != 5) {
        cout << "Select the animal to send to Zoo :\n"
                "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit\n" << endl;

        cin >> sel;

        switch (sel) {
            case 1:
                mammals[i] = new Dog("Doggy", Green, "Andy");
                break;
            case 2:
                mammals[i] = new Cat("Cat", White, "Andy");
                break;
            case 3:
                mammals[i] = new Lion("Lion", Blue, "Andy");
                break;
            case 4:
                for (auto & mammal : mammals) {
                    mammal->move();
                    mammal->speak();
                    mammal->eat();
                }
                break;
            default:
                break;
        }
        i++;
    }
    return 0;
}