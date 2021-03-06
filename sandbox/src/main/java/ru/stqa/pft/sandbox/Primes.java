package ru.stqa.pft.sandbox;

/**
 * Created by vity on 20.04.2016.
 */
public class Primes {

  static public boolean isPrime(int n){
    for (int i =2;i<n; i++)
    {
      if(n%i==0){
        return false;
      }

    }
return  true;
  }

  static public boolean isPrimeWhile(int n){
    int i=2;
    while(i<n && n%i!=0){
      i++;
    }
    return   i==n;
  }


  static public boolean isPrime(long n){
    for (long i =2;i<n; i++)
    {
      if(n%i==0){
        return false;
      }

    }
    return  true;
  }


  static public boolean isPrimeFast(int n){
    int m =(int)Math.sqrt(n);
    for (int i =2;i<m; i++)
    {
      if(n%i==0){
        return false;
      }

    }
    return  true;
  }
}
