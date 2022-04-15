// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobHiveConfig {
    /**
     * Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries. Defaults to false.
     * 
     */
    private final @Nullable Boolean continueOnFailure;
    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    private final @Nullable List<String> jarFileUris;
    /**
     * A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * The HCFS URI of the script that contains SQL queries.
     * Conflicts with `query_list`
     * 
     */
    private final @Nullable String queryFileUri;
    /**
     * The list of SQL queries or statements to execute as part of the job.
     * Conflicts with `query_file_uri`
     * 
     */
    private final @Nullable List<String> queryLists;
    /**
     * Mapping of query variable names to values (equivalent to the Spark SQL command: `SET name="value";`).
     * 
     */
    private final @Nullable Map<String,String> scriptVariables;

    @CustomType.Constructor
    private JobHiveConfig(
        @CustomType.Parameter("continueOnFailure") @Nullable Boolean continueOnFailure,
        @CustomType.Parameter("jarFileUris") @Nullable List<String> jarFileUris,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("queryFileUri") @Nullable String queryFileUri,
        @CustomType.Parameter("queryLists") @Nullable List<String> queryLists,
        @CustomType.Parameter("scriptVariables") @Nullable Map<String,String> scriptVariables) {
        this.continueOnFailure = continueOnFailure;
        this.jarFileUris = jarFileUris;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryLists = queryLists;
        this.scriptVariables = scriptVariables;
    }

    /**
     * Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries. Defaults to false.
     * 
    */
    public Optional<Boolean> continueOnFailure() {
        return Optional.ofNullable(this.continueOnFailure);
    }
    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
    */
    public List<String> jarFileUris() {
        return this.jarFileUris == null ? List.of() : this.jarFileUris;
    }
    /**
     * A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
    */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * The HCFS URI of the script that contains SQL queries.
     * Conflicts with `query_list`
     * 
    */
    public Optional<String> queryFileUri() {
        return Optional.ofNullable(this.queryFileUri);
    }
    /**
     * The list of SQL queries or statements to execute as part of the job.
     * Conflicts with `query_file_uri`
     * 
    */
    public List<String> queryLists() {
        return this.queryLists == null ? List.of() : this.queryLists;
    }
    /**
     * Mapping of query variable names to values (equivalent to the Spark SQL command: `SET name="value";`).
     * 
    */
    public Map<String,String> scriptVariables() {
        return this.scriptVariables == null ? Map.of() : this.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobHiveConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean continueOnFailure;
        private @Nullable List<String> jarFileUris;
        private @Nullable Map<String,String> properties;
        private @Nullable String queryFileUri;
        private @Nullable List<String> queryLists;
        private @Nullable Map<String,String> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(JobHiveConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryLists = defaults.queryLists;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder continueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }
        public Builder jarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder queryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }
        public Builder queryLists(@Nullable List<String> queryLists) {
            this.queryLists = queryLists;
            return this;
        }
        public Builder queryLists(String... queryLists) {
            return queryLists(List.of(queryLists));
        }
        public Builder scriptVariables(@Nullable Map<String,String> scriptVariables) {
            this.scriptVariables = scriptVariables;
            return this;
        }        public JobHiveConfig build() {
            return new JobHiveConfig(continueOnFailure, jarFileUris, properties, queryFileUri, queryLists, scriptVariables);
        }
    }
}
