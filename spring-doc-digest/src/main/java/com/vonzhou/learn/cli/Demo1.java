package com.vonzhou.learn.cli;

import org.apache.commons.cli.*;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @version 2017/4/5.
 */
public class Demo1 {
    public static void main(String[] args) {

//        // create Options object
//        Options options = new Options();
//
//        // add t option
//        options.addOption("t", true, "display current time");
//        options.addOption("arg2", true, "arg2");
//
//        CommandLineParser parser = new DefaultParser();
//
//        CommandLine cmd = null;
//        try {
//            cmd = parser.parse(options, args);
//        } catch (UnrecognizedOptionException e) {
//            System.out.println(e.getOption());
//        } catch (Exception e) {
//
//        }
//
//        System.out.println(cmd.getOptionValue("t"));

//        parsePackArg("-xxx -A a a-2 a3 -a4 -D -E");

        Integer i = 1;
        int j = 1;
        System.out.println(i.equals(j));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(new Date()));
    }

    public static void parsePackArg(String arg) {

        int i = 0, last = 0, len = arg.length();
        String lastOpt = "", lastValue = "";
        int lastOptLen = 0;
        String str = arg;
        String lastStr = "";
        char lastChar = ' ';

        while (i < len) {
            if(i != 0){
                lastChar = str.charAt(i-1);
            }
            lastStr = StringUtils.substring(str, i);
            String opt = startsWithOpt(lastStr, lastChar);
            if (i >= len)
                break;

            if (StringUtils.isNotBlank(opt)) {
                // 处理上一个选项
                lastValue = StringUtils.trimToEmpty(StringUtils.substring(str, last + lastOptLen, i));
                System.out.println(String.format("Opt = %s,  Opt value = %s", lastOpt, lastValue));

                // 当前选项
                lastOptLen = StringUtils.length(opt);
                lastOpt = opt;
                last = i;

                i += lastOptLen;

            } else {
                i++;
            }
        }

        // 最后一个选项特殊处理
        if (StringUtils.isNotBlank(lastOpt) && last < len) {
            lastValue = StringUtils.trimToEmpty(StringUtils.substring(str, last + lastOptLen));
            System.out.println(String.format("Opt = %s,  Opt value = %s", lastOpt, lastValue));
        }
    }

    private static String startsWithOpt(String str, char preChar) {
        if (preChar == ' ' && StringUtils.startsWith(str, "-")) {
            return StringUtils.substringBefore(str, " ");
        }
        return "";
    }

}
