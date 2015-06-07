package de.hahn.blog.preferredpackages.view.beans;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

import org.apache.commons.io.FileUtils;


public class FileBean {
    private RichOutputText x;

    public FileBean() {
        super();
    }

    public String getTempDir() {
        return FileUtils.getTempDirectoryPath();
    }

    public void doTempDirectory() {
        FileUtils.getTempDirectory();
        return;
    }

    public void setX(RichOutputText x) {
        this.x = x;
    }

    public RichOutputText getX() {
        return x;
    }
}
