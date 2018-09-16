import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // 文件名
        String filePath = "test/test.js";
        // 读取文件
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            int rowNum = 0; // 行数
            String strRow = ""; // 每行字符串
            Block curBlock = null; // 当前 block
            ArrayList<String> strRowList = new ArrayList<String>(); // 行字符串数组
            ArrayList<Block> blockList = new ArrayList<Block>(); // 块数组
            String strFile = ""; // 文件总的字符串

            // 每一行
            while ((strRow = in.readLine()) != null) {
                // 行数++
                rowNum++;
                // 放入行字符串数组
                strRowList.add(strRow);
                // 放到整个文件里
                strFile += strRow + "\n";
                System.out.println("第" + rowNum + "行，" + strRow);

                // 判断是否匹配
                Matcher m = Pattern.compile("\\.state").matcher(strRow);
                if (m.find()) {
                    // 有
                    System.out.println("MATCH m.start = " + m.start() + ", m.end = " + m.end());

                    // 新建一个 block
                    Block block = new Block(strRow, rowNum);
                    // 添加到 block list 里
                    blockList.add(block);
                    // 设置为当前 block
                    curBlock = block;

                } else {
                    // 没有
                    System.out.println("NO MATCH");

                    if (curBlock != null) {
                        curBlock.setStr(curBlock.getStr() + strRow + "\n");
                    }
                }

                System.out.println("\n");
            }

            // 遍历 blockList
            for (Block a : blockList) {
                System.out.println(a.startRowNum + ", str = " + a.str);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
