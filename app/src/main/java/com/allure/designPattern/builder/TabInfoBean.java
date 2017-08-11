package com.allure.designPattern.builder;

/**
 * Created by Allure on 2017/8/11.
 */

public class TabInfoBean {

    private int count;//Tab的个数 必选
    private int currentTab;//默认选中的tab 必选
    private String[] tabText;//文字必选


    private int normalResId;//可选
    private int selectResId;//可选
    private int normalTextColor;//可选
    private int selectTextColor;//可选
    private int normalTextSizeSp;//可选
    private int selectTextSizeSp;//可选


    private TabInfoBean(TabInfoBuilder builder) {
        this.tabText = builder.tabText;
        this.count = builder.count;
        this.currentTab = builder.currentTab;

        this.normalResId = builder.normalResId;
        this.selectResId = builder.selectResId;

        this.normalTextColor = builder.normalTextColor;
        this.selectTextColor = builder.selectTextColor;
        this.normalTextSizeSp = builder.normalTextSizeSp;
        this.selectTextSizeSp = builder.selectTextSizeSp;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCurrentTab() {
        return currentTab;
    }

    public void setCurrentTab(int currentTab) {
        this.currentTab = currentTab;
    }

    public int getNormalResId() {
        return normalResId;
    }

    public void setNormalResId(int normalResId) {
        this.normalResId = normalResId;
    }

    public int getSelectResId() {
        return selectResId;
    }

    public void setSelectResId(int selectResId) {
        this.selectResId = selectResId;
    }

    public int getNormalTextColor() {
        return normalTextColor;
    }

    public void setNormalTextColor(int normalTextColor) {
        this.normalTextColor = normalTextColor;
    }

    public int getSelectTextColor() {
        return selectTextColor;
    }

    public void setSelectTextColor(int selectTextColor) {
        this.selectTextColor = selectTextColor;
    }

    public String[] getTabText() {
        return tabText;
    }

    public void setTabText(String[] tabText) {
        this.tabText = tabText;
    }


    public int getNormalTextSizeSp() {
        return normalTextSizeSp;
    }

    public void setNormalTextSizeSp(int normalTextSizeSp) {
        this.normalTextSizeSp = normalTextSizeSp;
    }

    public int getSelectTextSizeSp() {
        return selectTextSizeSp;
    }

    public void setSelectTextSizeSp(int selectTextSizeSp) {
        this.selectTextSizeSp = selectTextSizeSp;
    }

    public static class TabInfoBuilder {
        private int count;
        private int currentTab;
        private String[] tabText;

        private int normalResId;
        private int selectResId;
        private int normalTextColor;
        private int selectTextColor;
        private int normalTextSizeSp;//可选
        private int selectTextSizeSp;//可选

        public TabInfoBuilder(String[] tabText, int count, int currentTab) {
            this.tabText = tabText;
            this.count = count;
            this.currentTab = currentTab;
        }

        public TabInfoBuilder setNormalResId(int normalResId) {
            this.normalResId = normalResId;
            return this;
        }

        public TabInfoBuilder setSelectResId(int selectResId) {
            this.selectResId = selectResId;
            return this;
        }

        public TabInfoBuilder setNormalTextColor(int normalTextColor) {
            this.normalTextColor = normalTextColor;
            return this;
        }

        public TabInfoBuilder setSelectTextColor(int selectTextColor) {
            this.selectTextColor = selectTextColor;
            return this;
        }

        public TabInfoBuilder setNormalTextSizeSp(int size) {
            this.normalTextSizeSp = size;
            return this;
        }

        public TabInfoBuilder setSelectTextSizeSp(int size) {
            this.selectTextSizeSp = size;
            return this;
        }


        public TabInfoBean build() {
            return new TabInfoBean(this);
        }
    }
}
