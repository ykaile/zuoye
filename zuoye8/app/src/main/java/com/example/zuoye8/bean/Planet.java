package com.example.zuoye8.bean;

import com.example.zuoye8.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = {R.drawable.canon, R.drawable.iphone, R.drawable.nikon,
            R.drawable.oppo, R.drawable.sanxing, R.drawable.vr,R.drawable.huaweip40pro,R.drawable.huawei};
    private static String[] nameArray = { "Canon", "Apple12", "Nikon", "OPPO 双模5G", "三星", "微软全息AR眼镜","华为 P40 Pro","华为笔记本"};
    private static String[] descArray = {
            "佳能 高档全画幅 单反相机 3000万高清画质，每一个像素都是有效像素，让画面更加清晰",
            "Apple12 双摄5G 手机 流畅运行，双摄系统。A14仿生芯片流畅运行，降低延迟，操作跟手，玩游戏时也能更爽快",
            "尼康 8K全画幅 相机 搭载约4575万有效像素，呈现清晰锐利的图像效果，每秒7幅的快速连拍让您轻松捕捉动作画面",
            "OPPO 双模5G 手机 支持双模5G网络，采用全面曲面屏。一体化设计，支持SA/NSA双模式5G网络，网络快速稳定",
            "三星 光学防抖 手机 120Hz刷新率，5G网络。光学防抖技术，拍摄时无惧手抖，让你随手一拍就是高清大片",
            "微软全息AR眼镜 这款AR眼镜专为混合现实而设计。它内置高级光学传感器，可实时提供全息3D投影",
            "华为 P40 Pro 四摄变焦拍照手机 #高变焦远景也清晰#后置超清四摄，支持5倍光学变焦、10倍混合变焦与50倍数字变焦",
            "华为 全面屏 笔记本 华为笔记本，金属化一体机身采用4.4微边框屏幕，屏幕占比高达88%，使用带来更加宽广的浏览视野"


    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}
