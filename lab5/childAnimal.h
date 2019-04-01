//
// Created by Adithya on 2019-04-01.
//

#ifndef CHILD_ANIMAL_H
#define CHILD_ANIMAL_H
#include "animal.h"

class Dog : public Mammal {
public:
    Dog(string n, COLOR c, string owner);
    ~Dog();
    void speak() const;
    void move();
};

class Cat : public Mammal {
public:
    Cat(string n, COLOR c, string owner);
    ~Cat();
    void speak() const;
    void move();
};

class Lion : public Mammal {
public:
    Lion(string n, COLOR c, string owner);
    ~Lion();

    void speak() const;
    void move();
};
#endif