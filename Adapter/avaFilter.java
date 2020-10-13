package com.basePackage_khaled.Adapter;

public class avaFilter implements Filter {
    avaLibarary avaLibarary;
    avaFilter(avaLibarary avaLibarary){
        this.avaLibarary=avaLibarary;
    }
    @Override
    public void apply(Image image) {
            avaLibarary.init();
            avaLibarary.render();
    }
}
