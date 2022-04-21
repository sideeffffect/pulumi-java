// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.inputs.LoggingConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Apache Hadoop MapReduce (https://hadoop.apache.org/docs/current/hadoop-mapreduce-client/hadoop-mapreduce-client-core/MapReduceTutorial.html) jobs on Apache Hadoop YARN (https://hadoop.apache.org/docs/r2.7.1/hadoop-yarn/hadoop-yarn-site/YARN.html).
 * 
 */
public final class HadoopJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final HadoopJobArgs Empty = new HadoopJobArgs();

    /**
     * Optional. HCFS URIs of archives to be extracted in the working directory of Hadoop drivers and tasks. Supported file types: .jar, .tar, .tar.gz, .tgz, or .zip.
     * 
     */
    @Import(name="archiveUris")
    private @Nullable Output<List<String>> archiveUris;

    public Optional<Output<List<String>>> archiveUris() {
        return Optional.ofNullable(this.archiveUris);
    }

    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Optional. HCFS (Hadoop Compatible Filesystem) URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for naively parallel tasks.
     * 
     */
    @Import(name="fileUris")
    private @Nullable Output<List<String>> fileUris;

    public Optional<Output<List<String>>> fileUris() {
        return Optional.ofNullable(this.fileUris);
    }

    /**
     * Optional. Jar file URIs to add to the CLASSPATHs of the Hadoop driver and tasks.
     * 
     */
    @Import(name="jarFileUris")
    private @Nullable Output<List<String>> jarFileUris;

    public Optional<Output<List<String>>> jarFileUris() {
        return Optional.ofNullable(this.jarFileUris);
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<LoggingConfigArgs> loggingConfig;

    public Optional<Output<LoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * The name of the driver&#39;s main class. The jar file containing the class must be in the default CLASSPATH or specified in jar_file_uris.
     * 
     */
    @Import(name="mainClass")
    private @Nullable Output<String> mainClass;

    public Optional<Output<String>> mainClass() {
        return Optional.ofNullable(this.mainClass);
    }

    /**
     * The HCFS URI of the jar file containing the main class. Examples: &#39;gs://foo-bucket/analytics-binaries/extract-useful-metrics-mr.jar&#39; &#39;hdfs:/tmp/test-samples/custom-wordcount.jar&#39; &#39;file:///home/usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar&#39;
     * 
     */
    @Import(name="mainJarFileUri")
    private @Nullable Output<String> mainJarFileUri;

    public Optional<Output<String>> mainJarFileUri() {
        return Optional.ofNullable(this.mainJarFileUri);
    }

    /**
     * Optional. A mapping of property names to values, used to configure Hadoop. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site and classes in user code.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private HadoopJobArgs() {}

    private HadoopJobArgs(HadoopJobArgs $) {
        this.archiveUris = $.archiveUris;
        this.args = $.args;
        this.fileUris = $.fileUris;
        this.jarFileUris = $.jarFileUris;
        this.loggingConfig = $.loggingConfig;
        this.mainClass = $.mainClass;
        this.mainJarFileUri = $.mainJarFileUri;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HadoopJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HadoopJobArgs $;

        public Builder() {
            $ = new HadoopJobArgs();
        }

        public Builder(HadoopJobArgs defaults) {
            $ = new HadoopJobArgs(Objects.requireNonNull(defaults));
        }

        public Builder archiveUris(@Nullable Output<List<String>> archiveUris) {
            $.archiveUris = archiveUris;
            return this;
        }

        public Builder archiveUris(List<String> archiveUris) {
            return archiveUris(Output.of(archiveUris));
        }

        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }

        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        public Builder args(String... args) {
            return args(List.of(args));
        }

        public Builder fileUris(@Nullable Output<List<String>> fileUris) {
            $.fileUris = fileUris;
            return this;
        }

        public Builder fileUris(List<String> fileUris) {
            return fileUris(Output.of(fileUris));
        }

        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }

        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            $.jarFileUris = jarFileUris;
            return this;
        }

        public Builder jarFileUris(List<String> jarFileUris) {
            return jarFileUris(Output.of(jarFileUris));
        }

        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }

        public Builder loggingConfig(@Nullable Output<LoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        public Builder loggingConfig(LoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        public Builder mainClass(@Nullable Output<String> mainClass) {
            $.mainClass = mainClass;
            return this;
        }

        public Builder mainClass(String mainClass) {
            return mainClass(Output.of(mainClass));
        }

        public Builder mainJarFileUri(@Nullable Output<String> mainJarFileUri) {
            $.mainJarFileUri = mainJarFileUri;
            return this;
        }

        public Builder mainJarFileUri(String mainJarFileUri) {
            return mainJarFileUri(Output.of(mainJarFileUri));
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public HadoopJobArgs build() {
            return $;
        }
    }

}
