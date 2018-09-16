public class Block {
    // 块字符串
    public String str = "";
    // 起始行数
    public int startRowNum = 0;

    public Block() {
    }

    public Block(int startRowNum) {
        this.startRowNum = startRowNum;
    }

    public Block(String str, int startRowNum) {
        this.str = str;
        this.startRowNum = startRowNum;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getStartRowNum() {
        return startRowNum;
    }

    public void setStartRowNum(int startRowNum) {
        this.startRowNum = startRowNum;
    }
}
