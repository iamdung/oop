package Lab02;

public class PS {
    private int tu , mau ;
    public PS(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }

    public PS() {
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public static int GCD(int a, int b){
        if(a*b==0) return a+b;
        if (b==a) return a;
        return GCD(b%a,a%b);

    }
    public PS cong(PS ps){
        int kqtu, kqm, x;
        kqtu = this.mau * ps.tu + ps.mau * this.tu;
        kqm = this.mau * ps.mau;
        x = GCD(kqtu, kqm);
        return new PS(kqtu/x, kqm/x);
    }
    public PS tru(PS ps){
        int kqtu, kqm, x;
        kqtu = this.mau * ps.tu - ps.mau * this.tu;
        kqm = this.mau * ps.mau;
        x = GCD(kqtu,kqm);
        return  new PS(kqtu/x, kqm/x);
    }
    public PS nhan(PS ps){
        int kqtu, kqm, x;
        kqtu = ps.tu * this.tu;
        kqm = this.mau * ps.mau;
        x = GCD(kqtu,kqm);
        return  new PS(kqtu/x, kqm/x);
    }
    public PS chia(PS ps){
        int kqtu, kqm, x;
        kqtu = ps.mau * this.tu;
        kqm = this.mau * ps.tu;
            x = GCD(kqtu,kqm);
            return  new PS(kqtu/x, kqm/x);
    }



    public boolean equals(PS ps) {
        if (this.tu * ps.mau == this.mau * ps.tu){
            return  true;
        }else{
            return false;
        }
    }
}

