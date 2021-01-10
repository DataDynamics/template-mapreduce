package io.datadynamics.bigdata.mapreduce.util;

import java.net.URI;

public class HarUtilsTest {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        FileSystem localFileSystem = FileSystem.getLocal(conf);
        localFileSystem.initialize(new URI("file:///"), conf);

        final Path indexPath = new Path(aHarPath, "_index");
        final Path masterIndexPath = new Path(aHarPath, "_masterindex");
    }
}