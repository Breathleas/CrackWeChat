package com.yukar1z0e.crackwechat;

import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.MotionEvent;

import java.util.Collections;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

import static de.robv.android.xposed.XposedHelpers.callMethod;
import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import static de.robv.android.xposed.XposedHelpers.findAndHookConstructor;

public class crackmain implements IXposedHookLoadPackage{
    @Override
    public void handleLoadPackage(final XC_LoadPackage.LoadPackageParam lpparam){
        Log.d("INIT","Test Xposed");
        if (lpparam.packageName.contains("com.tencent.mm")){
            Log.d("Begin","Xposed Hooked"+lpparam.packageName);
        }
    }
}
