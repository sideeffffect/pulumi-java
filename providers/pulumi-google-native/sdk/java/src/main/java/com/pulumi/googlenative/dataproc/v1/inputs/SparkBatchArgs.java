// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A configuration for running an Apache Spark (https://spark.apache.org/) batch workload.
 * 
 */
public final class SparkBatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final SparkBatchArgs Empty = new SparkBatchArgs();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris")
    private @Nullable Output<List<String>> archiveUris;

    /**
     * @return Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    public Optional<Output<List<String>>> archiveUris() {
        return Optional.ofNullable(this.archiveUris);
    }

    /**
     * Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    /**
     * @return Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    @Import(name="fileUris")
    private @Nullable Output<List<String>> fileUris;

    /**
     * @return Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    public Optional<Output<List<String>>> fileUris() {
        return Optional.ofNullable(this.fileUris);
    }

    /**
     * Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
     * 
     */
    @Import(name="jarFileUris")
    private @Nullable Output<List<String>> jarFileUris;

    /**
     * @return Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
     * 
     */
    public Optional<Output<List<String>>> jarFileUris() {
        return Optional.ofNullable(this.jarFileUris);
    }

    /**
     * Optional. The name of the driver main class. The jar file that contains the class must be in the classpath or specified in jar_file_uris.
     * 
     */
    @Import(name="mainClass")
    private @Nullable Output<String> mainClass;

    /**
     * @return Optional. The name of the driver main class. The jar file that contains the class must be in the classpath or specified in jar_file_uris.
     * 
     */
    public Optional<Output<String>> mainClass() {
        return Optional.ofNullable(this.mainClass);
    }

    /**
     * Optional. The HCFS URI of the jar file that contains the main class.
     * 
     */
    @Import(name="mainJarFileUri")
    private @Nullable Output<String> mainJarFileUri;

    /**
     * @return Optional. The HCFS URI of the jar file that contains the main class.
     * 
     */
    public Optional<Output<String>> mainJarFileUri() {
        return Optional.ofNullable(this.mainJarFileUri);
    }

    private SparkBatchArgs() {}

    private SparkBatchArgs(SparkBatchArgs $) {
        this.archiveUris = $.archiveUris;
        this.args = $.args;
        this.fileUris = $.fileUris;
        this.jarFileUris = $.jarFileUris;
        this.mainClass = $.mainClass;
        this.mainJarFileUri = $.mainJarFileUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkBatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkBatchArgs $;

        public Builder() {
            $ = new SparkBatchArgs();
        }

        public Builder(SparkBatchArgs defaults) {
            $ = new SparkBatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(@Nullable Output<List<String>> archiveUris) {
            $.archiveUris = archiveUris;
            return this;
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(List<String> archiveUris) {
            return archiveUris(Output.of(archiveUris));
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }

        /**
         * @param args Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        /**
         * @param args Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
         * 
         * @return builder
         * 
         */
        public Builder args(String... args) {
            return args(List.of(args));
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(@Nullable Output<List<String>> fileUris) {
            $.fileUris = fileUris;
            return this;
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(List<String> fileUris) {
            return fileUris(Output.of(fileUris));
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            $.jarFileUris = jarFileUris;
            return this;
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(List<String> jarFileUris) {
            return jarFileUris(Output.of(jarFileUris));
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }

        /**
         * @param mainClass Optional. The name of the driver main class. The jar file that contains the class must be in the classpath or specified in jar_file_uris.
         * 
         * @return builder
         * 
         */
        public Builder mainClass(@Nullable Output<String> mainClass) {
            $.mainClass = mainClass;
            return this;
        }

        /**
         * @param mainClass Optional. The name of the driver main class. The jar file that contains the class must be in the classpath or specified in jar_file_uris.
         * 
         * @return builder
         * 
         */
        public Builder mainClass(String mainClass) {
            return mainClass(Output.of(mainClass));
        }

        /**
         * @param mainJarFileUri Optional. The HCFS URI of the jar file that contains the main class.
         * 
         * @return builder
         * 
         */
        public Builder mainJarFileUri(@Nullable Output<String> mainJarFileUri) {
            $.mainJarFileUri = mainJarFileUri;
            return this;
        }

        /**
         * @param mainJarFileUri Optional. The HCFS URI of the jar file that contains the main class.
         * 
         * @return builder
         * 
         */
        public Builder mainJarFileUri(String mainJarFileUri) {
            return mainJarFileUri(Output.of(mainJarFileUri));
        }

        public SparkBatchArgs build() {
            return $;
        }
    }

}
