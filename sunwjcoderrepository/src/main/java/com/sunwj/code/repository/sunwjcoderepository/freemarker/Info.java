package com.sunwj.code.repository.sunwjcoderepository.freemarker;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2020/11/9 4:03 下午
 */
public class Info {

    private String prodname;
    private Integer relay;
    private Integer contain;
    private Integer used;

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public Integer getRelay() {
        return relay;
    }

    public void setRelay(Integer relay) {
        this.relay = relay;
    }

    public Integer getContain() {
        return contain;
    }

    public void setContain(Integer contain) {
        this.contain = contain;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }
}
