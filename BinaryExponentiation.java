
//recursive
long binpow(long a ,long b){
    if(b==0)return 1;
    long res = binpow(a,b/2);
    if(b%2==1){
        return res*res*a;
    }
    else{
        return res*res;
    }
}
//iterative
long binpow(long a, long b){
    long res =1;
    while(b>0){
        if(b&1==1){
            res = res * a;
        }
        a = a*a;
        b>>=1;
    }
    return res;
}
//for large numbers modulo
long binpow(long a, long b, long m){
    a%=m;
    long res = 1;
    while(b>0){
        if(b&1==1){
            res = res * a % m;
        }
        a = a * a % m;
        b>>=1;
    }
    return res;
}
