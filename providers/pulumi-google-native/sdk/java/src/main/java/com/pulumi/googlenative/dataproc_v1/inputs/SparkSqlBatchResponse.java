// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A configuration for running Apache Spark SQL (https://spark.apache.org/sql/) queries as a batch workload.
 * 
 */
public final class SparkSqlBatchResponse extends com.pulumi.resources.InvokeArgs {

    public static final SparkSqlBatchResponse Empty = new SparkSqlBatchResponse();

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
     * The HCFS URI of the script that contains Spark SQL queries to execute.
     * 
     */
    @Import(name="queryFileUri", required=true)
    private String queryFileUri;

    public String queryFileUri() {
        return this.queryFileUri;
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name=&#34;value&#34;;).
     * 
     */
    @Import(name="queryVariables", required=true)
    private Map<String,String> queryVariables;

    public Map<String,String> queryVariables() {
        return this.queryVariables;
    }

    private SparkSqlBatchResponse() {}

    private SparkSqlBatchResponse(SparkSqlBatchResponse $) {
        this.jarFileUris = $.jarFileUris;
        this.queryFileUri = $.queryFileUri;
        this.queryVariables = $.queryVariables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkSqlBatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkSqlBatchResponse $;

        public Builder() {
            $ = new SparkSqlBatchResponse();
        }

        public Builder(SparkSqlBatchResponse defaults) {
            $ = new SparkSqlBatchResponse(Objects.requireNonNull(defaults));
        }

        public Builder jarFileUris(List<String> jarFileUris) {
            $.jarFileUris = jarFileUris;
            return this;
        }

        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }

        public Builder queryFileUri(String queryFileUri) {
            $.queryFileUri = queryFileUri;
            return this;
        }

        public Builder queryVariables(Map<String,String> queryVariables) {
            $.queryVariables = queryVariables;
            return this;
        }

        public SparkSqlBatchResponse build() {
            $.jarFileUris = Objects.requireNonNull($.jarFileUris, "expected parameter 'jarFileUris' to be non-null");
            $.queryFileUri = Objects.requireNonNull($.queryFileUri, "expected parameter 'queryFileUri' to be non-null");
            $.queryVariables = Objects.requireNonNull($.queryVariables, "expected parameter 'queryVariables' to be non-null");
            return $;
        }
    }

}
