// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.LoggingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SparkJobResponse {
    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    private final List<String> archiveUris;
    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    private final List<String> args;
    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    private final List<String> fileUris;
    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Spark driver and tasks.
     * 
     */
    private final List<String> jarFileUris;
    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    private final LoggingConfigResponse loggingConfig;
    /**
     * The name of the driver's main class. The jar file that contains the class must be in the default CLASSPATH or specified in jar_file_uris.
     * 
     */
    private final String mainClass;
    /**
     * The HCFS URI of the jar file that contains the main class.
     * 
     */
    private final String mainJarFileUri;
    /**
     * Optional. A mapping of property names to values, used to configure Spark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    private final Map<String,String> properties;

    @OutputCustomType.Constructor
    private SparkJobResponse(
        @OutputCustomType.Parameter("archiveUris") List<String> archiveUris,
        @OutputCustomType.Parameter("args") List<String> args,
        @OutputCustomType.Parameter("fileUris") List<String> fileUris,
        @OutputCustomType.Parameter("jarFileUris") List<String> jarFileUris,
        @OutputCustomType.Parameter("loggingConfig") LoggingConfigResponse loggingConfig,
        @OutputCustomType.Parameter("mainClass") String mainClass,
        @OutputCustomType.Parameter("mainJarFileUri") String mainJarFileUri,
        @OutputCustomType.Parameter("properties") Map<String,String> properties) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.mainClass = mainClass;
        this.mainJarFileUri = mainJarFileUri;
        this.properties = properties;
    }

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
    */
    public List<String> getArchiveUris() {
        return this.archiveUris;
    }
    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
    */
    public List<String> getArgs() {
        return this.args;
    }
    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
    */
    public List<String> getFileUris() {
        return this.fileUris;
    }
    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Spark driver and tasks.
     * 
    */
    public List<String> getJarFileUris() {
        return this.jarFileUris;
    }
    /**
     * Optional. The runtime log config for job execution.
     * 
    */
    public LoggingConfigResponse getLoggingConfig() {
        return this.loggingConfig;
    }
    /**
     * The name of the driver's main class. The jar file that contains the class must be in the default CLASSPATH or specified in jar_file_uris.
     * 
    */
    public String getMainClass() {
        return this.mainClass;
    }
    /**
     * The HCFS URI of the jar file that contains the main class.
     * 
    */
    public String getMainJarFileUri() {
        return this.mainJarFileUri;
    }
    /**
     * Optional. A mapping of property names to values, used to configure Spark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> archiveUris;
        private List<String> args;
        private List<String> fileUris;
        private List<String> jarFileUris;
        private LoggingConfigResponse loggingConfig;
        private String mainClass;
        private String mainJarFileUri;
        private Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainClass = defaults.mainClass;
    	      this.mainJarFileUri = defaults.mainJarFileUri;
    	      this.properties = defaults.properties;
        }

        public Builder archiveUris(List<String> archiveUris) {
            this.archiveUris = Objects.requireNonNull(archiveUris);
            return this;
        }

        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder fileUris(List<String> fileUris) {
            this.fileUris = Objects.requireNonNull(fileUris);
            return this;
        }

        public Builder jarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }

        public Builder loggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }

        public Builder mainClass(String mainClass) {
            this.mainClass = Objects.requireNonNull(mainClass);
            return this;
        }

        public Builder mainJarFileUri(String mainJarFileUri) {
            this.mainJarFileUri = Objects.requireNonNull(mainJarFileUri);
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public SparkJobResponse build() {
            return new SparkJobResponse(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainClass, mainJarFileUri, properties);
        }
    }
}
