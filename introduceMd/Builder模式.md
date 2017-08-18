# [Builder模式](https://github.com/Allure0/AndroidDesignPattern/blob/master/app/src/main/java/com/allure/designPattern/builder/BuilderActivity.java)

-----

Builder模式使用链式结构创建复杂对象，将过程与结果分开，创建过程中可以自行组合。

### 使用场景
- 一个对象，不同组合,不同顺序生成不同的结果

优点：封装性更规范，程序调用不用关系内部细节，注重结果即可
缺点：如果builder对象过多，会加大内存消耗

```
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

```

### 调用方式

```

  String[] name={"我","是","谁"};
        TabInfoBean.TabInfoBuilder tabInfoBuilder=new TabInfoBean.TabInfoBuilder(name,5,0);
       /* TabInfoBean tabInfoBean=tabInfoBuilder
                .setNormalResId()
                .setSelectResId()
                .setNormalTextColor()
                .setSelectTextColor()
                .setNormalTextSizeSp()
                .setSelectTextSizeSp()
                .build();*/
                
```
