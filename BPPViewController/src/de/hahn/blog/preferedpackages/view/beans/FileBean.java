package de.hahn.blog.preferedpackages.view.beans;

import org.apache.commons.io.FileUtils;


public class FileBean {
    public FileBean() {
        super();
    }

    public void doTempDirectory() {
        FileUtils.getTempDirectory();
        return;
    }
}
