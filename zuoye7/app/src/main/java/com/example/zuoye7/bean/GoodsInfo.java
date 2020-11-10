package com.example.zuoye7.bean;

import com.example.zuoye7.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "Canon", "Apple12", "Nikon", "OPPO 双模5G", "三星", "微软全息AR眼镜","华为 P40 Pro","华为笔记本"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "佳能 高档全画幅 单反相机 3000万高清画质，每一个像素都是有效像素，让画面更加清晰",
            "Apple12 双摄5G 手机 流畅运行，双摄系统。A14仿生芯片流畅运行，降低延迟，操作跟手，玩游戏时也能更爽快",
            "尼康 8K全画幅 相机 搭载约4575万有效像素，呈现清晰锐利的图像效果，每秒7幅的快速连拍让您轻松捕捉动作画面",
            "OPPO 双模5G 手机 支持双模5G网络，采用全面曲面屏。一体化设计，支持SA/NSA双模式5G网络，网络快速稳定",
            "三星 光学防抖 手机 120Hz刷新率，5G网络。光学防抖技术，拍摄时无惧手抖，让你随手一拍就是高清大片",
            "微软全息AR眼镜 这款AR眼镜专为混合现实而设计。它内置高级光学传感器，可实时提供全息3D投影",
            "华为 P40 Pro 四摄变焦拍照手机 #高变焦远景也清晰#后置超清四摄，支持5倍光学变焦、10倍混合变焦与50倍数字变焦",
            "华为 全面屏 笔记本 华为笔记本，金属化一体机身采用4.4微边框屏幕，屏幕占比高达88%，使用带来更加宽广的浏览视野"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {22788, 6299, 18299, 2799, 4999, 49800, 6488, 4899};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.canon_s, R.drawable.iphone_s, R.drawable.nikon_s,
            R.drawable.oppo_s, R.drawable.sanxing_s, R.drawable.vr_s,
            R.drawable.huaweip40pro_s,R.drawable.huawei_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.canon, R.drawable.iphone, R.drawable.nikon,
            R.drawable.oppo, R.drawable.sanxing, R.drawable.vr,
            R.drawable.huaweip40pro,R.drawable.huawei
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
