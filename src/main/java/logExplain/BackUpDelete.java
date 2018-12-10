package logExplain;

import java.io.*;

/**
 * @author siliang.zheng
 * Date : 2018/8/23
 * Describle
 */
public class BackUpDelete {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\11069\\Desktop\\mysql-bin.002244.read");
        StringBuffer deleteSql = new StringBuffer();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        File deleteFile = new File("C:\\Users\\11069\\Desktop\\deleteFile.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(deleteFile));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("### DELETE FROM `kylin_customer`.`ls_customer_customer`")) {
                reader.readLine();
                readMutilLine(reader, 46, deleteSql);
                bufferedWriter.write(deleteSql.toString());
                deleteSql = new StringBuffer();
            }
        }
        bufferedWriter.close();


    }

    private static void readMutilLine(BufferedReader reader, int readCnt, StringBuffer stringBuffer) throws IOException {
        stringBuffer.append("insert into ls_customer_customer values(");
        for (int i = 0; i < readCnt; i++) {
            String line = reader.readLine();
            String value = line.substring(line.indexOf("=") + 1, line.indexOf("/*"));
            if (value.contains("56628")) {
                System.out.println(1);
            }
            if (value.contains("-1") & value.contains("(") & value.contains(")")) {
                value = "-1";
            }
            stringBuffer.append(value);
            if (i < readCnt - 1) {
                stringBuffer.append(",");
            }

        }
        stringBuffer.append(");\n");
    }
}
