/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: mikeross
 *
 * Created on December 21, 2018, 1:31 PM
 */

#include <iostream>
using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int [a]={5,1,10,15,20};
    int i,j,m;
    i=++a[1];
    j=a[1]++;
    m=a[i++];
    printf("%d,%d,%d",i,j,m);
}

