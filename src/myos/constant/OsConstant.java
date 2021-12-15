package myos.constant;

public class OsConstant {
    /**
     * 磁盘相关
     */
    public  static final String DISK_FILE ="resources/disk.txt";//模拟磁盘文件
    public static final int DISK_BLOCK_SIZE = 64;//物理块大小
    public static final int DISK_BLOCK_QUNTITY = 128;//物理块数量
    /**
     * 内存相关
     */
    public static final int USER_AREA_SIZE=512;//用户区512字节
    public static final int PCB_COUNT=10;//PCB数量
    /**
     * 进程相关
     */
    public static final int PROCESS_MAX=10;//最大进程数

}
