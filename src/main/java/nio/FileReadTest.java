package nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Objects;
import java.util.UUID;

/**
 * @author siliang.zheng
 * Date : 2018/10/18
 * Describle
 */
public class FileReadTest {
    public static void main(String[] args) throws IOException {
        //RandomAccessFile file = new RandomAccessFile("C:\\Users\\11069\\Desktop\\企业账号导入.txt", "rw");
        //FileChannel channel = file.getChannel();
        //ByteBuffer buffer = ByteBuffer.allocate(64);
        //int byteRead;
        //while ((byteRead = channel.read(buffer)) != -1) {
        //    buffer.flip();
        //    while (buffer.hasRemaining()){
        //        char c = (char) buffer.get();
        //        System.out.print(c);
        //    }
        //    buffer.clear();
        //}
        //file.close();
        //
        //RandomAccessFile fromFile = new RandomAccessFile("C:\\Users\\11069\\Desktop\\企业账号导入.txt", "rw");
        //FileChannel      fromChannel = fromFile.getChannel();
        //
        //RandomAccessFile toFile = new RandomAccessFile("C:\\Users\\11069\\Desktop\\copy.txt", "rw");
        //FileChannel      toChannel = toFile.getChannel();
        //
        //long position = 0;
        //long count    = fromChannel.size();
        //
        //toChannel.transferFrom(fromChannel, position, count);

        BigDecimal b=new BigDecimal("0");
        System.out.println(Objects.equals(b,new BigDecimal(0)));
        System.out.println(Objects.equals(b,BigDecimal.ZERO));
        System.out.println(Objects.equals(b,BigDecimal.valueOf(0)));
        System.out.println(b.compareTo(BigDecimal.ZERO)==0);

        //UUID uuid = UUID.randomUUID();
        //System.out.println(uuid);
        //System.out.println(uuid.toString().length());
        //System.out.println(compressUUID(uuid));
    }

    public static String compressUUID(UUID uuid) {
        StringBuilder resultBuilder = new StringBuilder();
        String uuidStr = uuid.toString();
        boolean isFirst = false;
        int tmp = 0;
        for (int i = 0; i < 36; i++) {
            if (i == 8 || i == 13 || i == 18 || i == 23) {
                continue;
            }
            char c = uuidStr.charAt(i);
            short shortValue = Short.valueOf(String.valueOf(c), 16);
            if (!isFirst) {
                tmp += shortValue;
                isFirst = true;
            } else {
                tmp = tmp << 4;
                tmp += shortValue;
                resultBuilder.append((char) tmp);
                tmp = 0;
                isFirst = false;
            }
        }
        return resultBuilder.toString();
    }
}
