// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.LoggingConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Apache PySpark (https://spark.apache.org/docs/0.9.0/python-programming-guide.html) applications on YARN.
 * 
 */
public final class PySparkJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final PySparkJobArgs Empty = new PySparkJobArgs();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris")
    private @Nullable Output<List<String>> archiveUris;

    public Optional<Output<List<String>>> archiveUris() {
        return Optional.ofNullable(this.archiveUris);
    }

    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    @Import(name="fileUris")
    private @Nullable Output<List<String>> fileUris;

    public Optional<Output<List<String>>> fileUris() {
        return Optional.ofNullable(this.fileUris);
    }

    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
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
     * The HCFS URI of the main Python file to use as the driver. Must be a .py file.
     * 
     */
    @Import(name="mainPythonFileUri", required=true)
    private Output<String> mainPythonFileUri;

    public Output<String> mainPythonFileUri() {
        return this.mainPythonFileUri;
    }

    /**
     * Optional. A mapping of property names to values, used to configure PySpark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    @Import(name="pythonFileUris")
    private @Nullable Output<List<String>> pythonFileUris;

    public Optional<Output<List<String>>> pythonFileUris() {
        return Optional.ofNullable(this.pythonFileUris);
    }

    private PySparkJobArgs() {}

    private PySparkJobArgs(PySparkJobArgs $) {
        this.archiveUris = $.archiveUris;
        this.args = $.args;
        this.fileUris = $.fileUris;
        this.jarFileUris = $.jarFileUris;
        this.loggingConfig = $.loggingConfig;
        this.mainPythonFileUri = $.mainPythonFileUri;
        this.properties = $.properties;
        this.pythonFileUris = $.pythonFileUris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PySparkJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PySparkJobArgs $;

        public Builder() {
            $ = new PySparkJobArgs();
        }

        public Builder(PySparkJobArgs defaults) {
            $ = new PySparkJobArgs(Objects.requireNonNull(defaults));
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

        public Builder mainPythonFileUri(Output<String> mainPythonFileUri) {
            $.mainPythonFileUri = mainPythonFileUri;
            return this;
        }

        public Builder mainPythonFileUri(String mainPythonFileUri) {
            return mainPythonFileUri(Output.of(mainPythonFileUri));
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public Builder pythonFileUris(@Nullable Output<List<String>> pythonFileUris) {
            $.pythonFileUris = pythonFileUris;
            return this;
        }

        public Builder pythonFileUris(List<String> pythonFileUris) {
            return pythonFileUris(Output.of(pythonFileUris));
        }

        public Builder pythonFileUris(String... pythonFileUris) {
            return pythonFileUris(List.of(pythonFileUris));
        }

        public PySparkJobArgs build() {
            $.mainPythonFileUri = Objects.requireNonNull($.mainPythonFileUri, "expected parameter 'mainPythonFileUri' to be non-null");
            return $;
        }
    }

}
