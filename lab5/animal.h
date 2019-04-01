//
// Created by Adithya on 2019-04-01.
//

#ifndef ANIMAL_H
#define ANIMAL_H
#include <iostream>
#include <string>

using namespace std;
enum COLOR {
    Green, Blue, White, Black, Brown
};

class Animal {
public :
    Animal();
    Animal(string n, COLOR c);
    ~Animal();
    virtual void speak() const;
    virtual void move() = 0;

private :
    string _name;
    COLOR _color;
};

class Mammal : public Animal{
private:
    string owner;
public:
    void eat() const;
    Mammal();
    Mammal(string n, COLOR c);
    ~Mammal();
    void move();
};
#endif