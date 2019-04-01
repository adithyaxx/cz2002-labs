//
// Created by Adithya on 2019-04-01.
//

#include "childAnimal.h"
#include <iostream>
#include <string>

using namespace std;

Dog::Dog(string n, COLOR c, string owner) : Mammal(n, c) {
    owner = owner;
}

Dog::~Dog() = default;

void Dog::speak() const {
    cout << "Woof" << endl;
}

void Dog::move() {
    cout << "Dog moves" << endl;
}


Cat::Cat(string n, COLOR c, string owner) : Mammal(n, c) {
    owner = owner;
}

Cat::~Cat() = default;

void Cat::speak() const {
    cout << "Meow" << endl;
}

void Cat::move() {
    cout << "Cat moves" << endl;
}

Lion::Lion(string n, COLOR c, string owner) : Mammal(n, c) {
    owner = owner;
}

Lion::~Lion() = default;

void Lion::speak() const {
    cout << "Roar" << endl;
}

void Lion::move() {
    cout << "Lion moves" << endl;
}
