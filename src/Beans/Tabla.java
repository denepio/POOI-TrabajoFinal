package Beans;

import java.io.Serializable;

public class Tabla implements Serializable {
    private String pro;
    private String pre;
    private String fdi;
    private String fdv;
    private String imp;
    private String exis;

    public Tabla() {
    }

    public Tabla(String pro, String pre, String fdi, String fdv, String imp, String exis) {
        this.pro = pro;
        this.pre = pre;
        this.fdi = fdi;
        this.fdv = fdv;
        this.imp = imp;
        this.exis = exis;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getFdi() {
        return fdi;
    }

    public void setFdi(String fdi) {
        this.fdi = fdi;
    }

    public String getFdv() {
        return fdv;
    }

    public void setFdv(String fdv) {
        this.fdv = fdv;
    }

    public String getImp() {
        return imp;
    }

    public void setImp(String imp) {
        this.imp = imp;
    }

    public String getExis() {
        return exis;
    }

    public void setExis(String exis) {
        this.exis = exis;
    }

    @Override
    public String toString() {
        return "Tabla{" + "pro=" + pro + ", pre=" + pre + ", fdi=" + fdi + ", fdv=" + fdv + ", imp=" + imp + ", exis=" + exis + '}';
    }
 
}
