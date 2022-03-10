// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1.inputs.LoggingConfigResponse;
import io.pulumi.googlenative.dataproc_v1.inputs.QueryListResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A Dataproc job for running Presto (https://prestosql.io/) queries. IMPORTANT: The Dataproc Presto Optional Component (https://cloud.google.com/dataproc/docs/concepts/components/presto) must be enabled when the cluster is created to submit a Presto job to the cluster.
 * 
 */
public final class PrestoJobResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrestoJobResponse Empty = new PrestoJobResponse();

    /**
     * Optional. Presto client tags to attach to this query
     * 
     */
    @InputImport(name="clientTags", required=true)
      private final List<String> clientTags;

    public List<String> getClientTags() {
        return this.clientTags;
    }

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    @InputImport(name="continueOnFailure", required=true)
      private final Boolean continueOnFailure;

    public Boolean getContinueOnFailure() {
        return this.continueOnFailure;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @InputImport(name="loggingConfig", required=true)
      private final LoggingConfigResponse loggingConfig;

    public LoggingConfigResponse getLoggingConfig() {
        return this.loggingConfig;
    }

    /**
     * Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
     * 
     */
    @InputImport(name="outputFormat", required=true)
      private final String outputFormat;

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * Optional. A mapping of property names to values. Used to set Presto session properties (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to using the --session flag in the Presto CLI
     * 
     */
    @InputImport(name="properties", required=true)
      private final Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties;
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @InputImport(name="queryFileUri", required=true)
      private final String queryFileUri;

    public String getQueryFileUri() {
        return this.queryFileUri;
    }

    /**
     * A list of queries.
     * 
     */
    @InputImport(name="queryList", required=true)
      private final QueryListResponse queryList;

    public QueryListResponse getQueryList() {
        return this.queryList;
    }

    public PrestoJobResponse(
        List<String> clientTags,
        Boolean continueOnFailure,
        LoggingConfigResponse loggingConfig,
        String outputFormat,
        Map<String,String> properties,
        String queryFileUri,
        QueryListResponse queryList) {
        this.clientTags = Objects.requireNonNull(clientTags, "expected parameter 'clientTags' to be non-null");
        this.continueOnFailure = Objects.requireNonNull(continueOnFailure, "expected parameter 'continueOnFailure' to be non-null");
        this.loggingConfig = Objects.requireNonNull(loggingConfig, "expected parameter 'loggingConfig' to be non-null");
        this.outputFormat = Objects.requireNonNull(outputFormat, "expected parameter 'outputFormat' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.queryFileUri = Objects.requireNonNull(queryFileUri, "expected parameter 'queryFileUri' to be non-null");
        this.queryList = Objects.requireNonNull(queryList, "expected parameter 'queryList' to be non-null");
    }

    private PrestoJobResponse() {
        this.clientTags = List.of();
        this.continueOnFailure = null;
        this.loggingConfig = null;
        this.outputFormat = null;
        this.properties = Map.of();
        this.queryFileUri = null;
        this.queryList = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrestoJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> clientTags;
        private Boolean continueOnFailure;
        private LoggingConfigResponse loggingConfig;
        private String outputFormat;
        private Map<String,String> properties;
        private String queryFileUri;
        private QueryListResponse queryList;

        public Builder() {
    	      // Empty
        }

        public Builder(PrestoJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTags = defaults.clientTags;
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.outputFormat = defaults.outputFormat;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
        }

        public Builder clientTags(List<String> clientTags) {
            this.clientTags = Objects.requireNonNull(clientTags);
            return this;
        }

        public Builder continueOnFailure(Boolean continueOnFailure) {
            this.continueOnFailure = Objects.requireNonNull(continueOnFailure);
            return this;
        }

        public Builder loggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }

        public Builder outputFormat(String outputFormat) {
            this.outputFormat = Objects.requireNonNull(outputFormat);
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder queryFileUri(String queryFileUri) {
            this.queryFileUri = Objects.requireNonNull(queryFileUri);
            return this;
        }

        public Builder queryList(QueryListResponse queryList) {
            this.queryList = Objects.requireNonNull(queryList);
            return this;
        }
        public PrestoJobResponse build() {
            return new PrestoJobResponse(clientTags, continueOnFailure, loggingConfig, outputFormat, properties, queryFileUri, queryList);
        }
    }
}
