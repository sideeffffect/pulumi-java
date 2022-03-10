// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.JobPysparkConfigLoggingConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobPysparkConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobPysparkConfigGetArgs Empty = new JobPysparkConfigGetArgs();

    /**
     * HCFS URIs of archives to be extracted in the working directory of .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @InputImport(name="archiveUris")
      private final @Nullable Input<List<String>> archiveUris;

    public Input<List<String>> getArchiveUris() {
        return this.archiveUris == null ? Input.empty() : this.archiveUris;
    }

    /**
     * The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @InputImport(name="args")
      private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    /**
     * HCFS URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for naively parallel tasks.
     * 
     */
    @InputImport(name="fileUris")
      private final @Nullable Input<List<String>> fileUris;

    public Input<List<String>> getFileUris() {
        return this.fileUris == null ? Input.empty() : this.fileUris;
    }

    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @InputImport(name="jarFileUris")
      private final @Nullable Input<List<String>> jarFileUris;

    public Input<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Input.empty() : this.jarFileUris;
    }

    @InputImport(name="loggingConfig")
      private final @Nullable Input<JobPysparkConfigLoggingConfigGetArgs> loggingConfig;

    public Input<JobPysparkConfigLoggingConfigGetArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Input.empty() : this.loggingConfig;
    }

    /**
     * The HCFS URI of the main Python file to use as the driver. Must be a .py file.
     * 
     */
    @InputImport(name="mainPythonFileUri", required=true)
      private final Input<String> mainPythonFileUri;

    public Input<String> getMainPythonFileUri() {
        return this.mainPythonFileUri;
    }

    /**
     * A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    @InputImport(name="pythonFileUris")
      private final @Nullable Input<List<String>> pythonFileUris;

    public Input<List<String>> getPythonFileUris() {
        return this.pythonFileUris == null ? Input.empty() : this.pythonFileUris;
    }

    public JobPysparkConfigGetArgs(
        @Nullable Input<List<String>> archiveUris,
        @Nullable Input<List<String>> args,
        @Nullable Input<List<String>> fileUris,
        @Nullable Input<List<String>> jarFileUris,
        @Nullable Input<JobPysparkConfigLoggingConfigGetArgs> loggingConfig,
        Input<String> mainPythonFileUri,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<List<String>> pythonFileUris) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri, "expected parameter 'mainPythonFileUri' to be non-null");
        this.properties = properties;
        this.pythonFileUris = pythonFileUris;
    }

    private JobPysparkConfigGetArgs() {
        this.archiveUris = Input.empty();
        this.args = Input.empty();
        this.fileUris = Input.empty();
        this.jarFileUris = Input.empty();
        this.loggingConfig = Input.empty();
        this.mainPythonFileUri = Input.empty();
        this.properties = Input.empty();
        this.pythonFileUris = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPysparkConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> archiveUris;
        private @Nullable Input<List<String>> args;
        private @Nullable Input<List<String>> fileUris;
        private @Nullable Input<List<String>> jarFileUris;
        private @Nullable Input<JobPysparkConfigLoggingConfigGetArgs> loggingConfig;
        private Input<String> mainPythonFileUri;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<List<String>> pythonFileUris;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPysparkConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainPythonFileUri = defaults.mainPythonFileUri;
    	      this.properties = defaults.properties;
    	      this.pythonFileUris = defaults.pythonFileUris;
        }

        public Builder archiveUris(@Nullable Input<List<String>> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }

        public Builder archiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = Input.ofNullable(archiveUris);
            return this;
        }

        public Builder args(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder fileUris(@Nullable Input<List<String>> fileUris) {
            this.fileUris = fileUris;
            return this;
        }

        public Builder fileUris(@Nullable List<String> fileUris) {
            this.fileUris = Input.ofNullable(fileUris);
            return this;
        }

        public Builder jarFileUris(@Nullable Input<List<String>> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }

        public Builder jarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = Input.ofNullable(jarFileUris);
            return this;
        }

        public Builder loggingConfig(@Nullable Input<JobPysparkConfigLoggingConfigGetArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder loggingConfig(@Nullable JobPysparkConfigLoggingConfigGetArgs loggingConfig) {
            this.loggingConfig = Input.ofNullable(loggingConfig);
            return this;
        }

        public Builder mainPythonFileUri(Input<String> mainPythonFileUri) {
            this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri);
            return this;
        }

        public Builder mainPythonFileUri(String mainPythonFileUri) {
            this.mainPythonFileUri = Input.of(Objects.requireNonNull(mainPythonFileUri));
            return this;
        }

        public Builder properties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder pythonFileUris(@Nullable Input<List<String>> pythonFileUris) {
            this.pythonFileUris = pythonFileUris;
            return this;
        }

        public Builder pythonFileUris(@Nullable List<String> pythonFileUris) {
            this.pythonFileUris = Input.ofNullable(pythonFileUris);
            return this;
        }
        public JobPysparkConfigGetArgs build() {
            return new JobPysparkConfigGetArgs(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainPythonFileUri, properties, pythonFileUris);
        }
    }
}
