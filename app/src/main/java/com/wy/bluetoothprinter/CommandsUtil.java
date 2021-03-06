package com.wy.bluetoothprinter;

import java.util.LinkedHashMap;

/**
 * Created by qs on 2016/10/17.
 */

public class CommandsUtil {

    public static final String[] ITEMS = {
            "复位打印机",
            "标准ASCII字体",
            "压缩ASCII字体",
            "字体不放大",
            "宽高加倍",
            "取消加粗模式",
            "选择加粗模式",
            "取消倒置打印",
            "选择倒置打印",
            "取消黑白反显",
            "选择黑白反显",
            "取消顺时针旋转90°",
            "选择顺时针旋转90°" };
    public static final byte[][] BYTE_COMMANDS = {
            { 0x1b, 0x40 },// 复位打印机
            { 0x1b, 0x4d, 0x00 },// 标准ASCII字体
            { 0x1b, 0x4d, 0x01 },// 压缩ASCII字体
            { 0x1d, 0x21, 0x00 },// 字体不放大
            { 0x1d, 0x21, 0x11 },// 宽高加倍
            { 0x1b, 0x45, 0x00 },// 取消加粗模式
            { 0x1b, 0x45, 0x01 },// 选择加粗模式
            { 0x1b, 0x7b, 0x00 },// 取消倒置打印
            { 0x1b, 0x7b, 0x01 },// 选择倒置打印
            { 0x1d, 0x42, 0x00 },// 取消黑白反显
            { 0x1d, 0x42, 0x01 },// 选择黑白反显
            { 0x1b, 0x56, 0x00 },// 取消顺时针旋转90°
            { 0x1b, 0x56, 0x01 },// 选择顺时针旋转90°
    };

}
