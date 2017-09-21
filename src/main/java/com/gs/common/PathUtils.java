package com.gs.common;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by Administrator on 2017/9/8.
 */
public class PathUtils {

    public static String uploadDir(HttpServletRequest request) {
        String rootDir = request.getServletContext().getRealPath("/");
        File file = new File(rootDir, "uploads");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }
}
