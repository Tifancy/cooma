package com.oldratlee.cooma.ext2.impl;

import com.oldratlee.cooma.Configs;
import com.oldratlee.cooma.ext2.Ext2;
import com.oldratlee.cooma.ext2.UrlHolder;

/**
 * @author oldratlee
 *
 */
public class Ext2Impl2 implements Ext2 {
    public String echo(UrlHolder holder, String s) {
        return "Ext2Impl2-echo";
    }
    
    public String yell(Configs config, String s) {
        return "Ext2Impl2-yell";
    }

    public String bang(Configs config, int i) {
        return "bang2";
    }
    
}