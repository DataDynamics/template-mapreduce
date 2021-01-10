package io.datadynamics.bigdata.mapreduce.util;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.HarFileSystem;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HarUtils {

    public static HarFileSystem get(FileSystem fs, String harPath) throws IOException, URISyntaxException {
        HarFileSystem harFs = new HarFileSystem(fs);
        String hdfsPath = fs.getConf().get("fs.default.name");
        String harScheme = StringUtils.replace(hdfsPath, "hdfs", "har");
        URI uri = new URI(harScheme + harPath);
        harFs.initialize(uri, fs.getConf());
        return harFs;
    }

}
