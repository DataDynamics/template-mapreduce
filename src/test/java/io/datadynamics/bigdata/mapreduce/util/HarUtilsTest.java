package io.datadynamics.bigdata.mapreduce.util;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.HarFileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HarUtilsTest {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Configuration conf = new Configuration();
        FileSystem localFileSystem = FileSystem.getLocal(conf);
        localFileSystem.initialize(new URI("file:///"), conf);

        String harPath = "D:/Projects/template-mapreduce/src/test/resources/test.har";

        HarFileSystem harFs = HarUtils.get(localFileSystem, harPath);
        System.out.println(harFs.getHarVersion());

        System.out.println(harFs.exists(new Path(harPath + "/dir1")));
    }
}