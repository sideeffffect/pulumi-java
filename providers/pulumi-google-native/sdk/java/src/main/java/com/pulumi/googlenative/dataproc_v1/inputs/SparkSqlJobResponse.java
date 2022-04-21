// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.inputs.LoggingConfigResponse;
import com.pulumi.googlenative.dataproc_v1.inputs.QueryListResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A Dataproc job for running Apache Spark SQL (https://spark.apache.org/sql/) queries.
 * 
 */
public final class SparkSqlJobResponse extends com.pulumi.resources.InvokeArgs {

    public static final SparkSqlJobResponse Empty = new SparkSqlJobResponse();

    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @Import(name="jarFileUris", required=true)
    private List<String> jarFileUris;

    public List<String> jarFileUris() {
        return this.jarFileUris;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig", required=true)
    private LoggingConfigResponse loggingConfig;

    public LoggingConfigResponse loggingConfig() {
        return this.loggingConfig;
    }

    /**
     * Optional. A mapping of property names to values, used to configure Spark SQL&#39;s SparkConf. Properties that conflict with values set by the Dataproc API may be overwritten.
     * 
     */
    @Import(name="properties", required=true)
    private Map<String,String> properties;

    public Map<String,String> properties() {
        return this.properties;
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @Import(name="queryFileUri", required=true)
    private String queryFileUri;

    public String queryFileUri() {
        return this.queryFileUri;
    }

    /**
     * A list of queries.
     * 
     */
    @Import(name="queryList", required=true)
    private QueryListResponse queryList;

    public QueryListResponse queryList() {
        return this.queryList;
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name=&#34;value&#34;;).
     * 
     */
    @Import(name="scriptVariables", required=true)
    private Map<String,String> scriptVariables;

    public Map<String,String> scriptVariables() {
        return this.scriptVariables;
    }

    private SparkSqlJobResponse() {}

    private SparkSqlJobResponse(SparkSqlJobResponse $) {
        this.jarFileUris = $.jarFileUris;
        this.loggingConfig = $.loggingConfig;
        this.properties = $.properties;
        this.queryFileUri = $.queryFileUri;
        this.queryList = $.queryList;
        this.scriptVariables = $.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkSqlJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkSqlJobResponse $;

        public Builder() {
            $ = new SparkSqlJobResponse();
        }

        public Builder(SparkSqlJobResponse defaults) {
            $ = new SparkSqlJobResponse(Objects.requireNonNull(defaults));
        }

        public Builder jarFileUris(List<String> jarFileUris) {
            $.jarFileUris = jarFileUris;
            return this;
        }

        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }

        public Builder loggingConfig(LoggingConfigResponse loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            $.properties = properties;
            return this;
        }

        public Builder queryFileUri(String queryFileUri) {
            $.queryFileUri = queryFileUri;
            return this;
        }

        public Builder queryList(QueryListResponse queryList) {
            $.queryList = queryList;
            return this;
        }

        public Builder scriptVariables(Map<String,String> scriptVariables) {
            $.scriptVariables = scriptVariables;
            return this;
        }

        public SparkSqlJobResponse build() {
            $.jarFileUris = Objects.requireNonNull($.jarFileUris, "expected parameter 'jarFileUris' to be non-null");
            $.loggingConfig = Objects.requireNonNull($.loggingConfig, "expected parameter 'loggingConfig' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.queryFileUri = Objects.requireNonNull($.queryFileUri, "expected parameter 'queryFileUri' to be non-null");
            $.queryList = Objects.requireNonNull($.queryList, "expected parameter 'queryList' to be non-null");
            $.scriptVariables = Objects.requireNonNull($.scriptVariables, "expected parameter 'scriptVariables' to be non-null");
            return $;
        }
    }

}
