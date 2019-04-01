//
// Created by Adithya on 2019-04-01.
//
#include "animal.h"
#include <iostream>
#include <string>

using namespace std;

Animal::Animal() : _name("unknown") {
    cout << "constructing Animal object " << _name << endl;
}

Animal::Animal(string n, COLOR c) : _name(n), _color(c) {
    cout << "constructing " << COLOR(_color) << " " << _name << endl;
}

Animal::~Animal() {
    cout << "destructing Animal object " << _name << endl;
}

void Animal::speak() const {
    cout << "Animal speaks " << endl;
}

void Animal::move() {}


void Mammal::eat() const {
    cout << "Mammal eat " << endl;
}

Mammal::Mammal() : Animal() {}

Mammal::Mammal(string n, COLOR c) : Animal(n, c) {}

Mammal::~Mammal() = default;

void Mammal::move() {
    cout << "Mammal moves" << endl;
}


