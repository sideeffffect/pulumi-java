// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc_v1beta2.outputs.LoggingConfigResponse;
import com.pulumi.googlenative.dataproc_v1beta2.outputs.QueryListResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class PigJobResponse {
    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    private final Boolean continueOnFailure;
    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
     * 
     */
    private final List<String> jarFileUris;
    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    private final LoggingConfigResponse loggingConfig;
    /**
     * Optional. A mapping of property names to values, used to configure Pig. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
     * 
     */
    private final Map<String,String> properties;
    /**
     * The HCFS URI of the script that contains the Pig queries.
     * 
     */
    private final String queryFileUri;
    /**
     * A list of queries.
     * 
     */
    private final QueryListResponse queryList;
    /**
     * Optional. Mapping of query variable names to values (equivalent to the Pig command: name=[value]).
     * 
     */
    private final Map<String,String> scriptVariables;

    @CustomType.Constructor
    private PigJobResponse(
        @CustomType.Parameter("continueOnFailure") Boolean continueOnFailure,
        @CustomType.Parameter("jarFileUris") List<String> jarFileUris,
        @CustomType.Parameter("loggingConfig") LoggingConfigResponse loggingConfig,
        @CustomType.Parameter("properties") Map<String,String> properties,
        @CustomType.Parameter("queryFileUri") String queryFileUri,
        @CustomType.Parameter("queryList") QueryListResponse queryList,
        @CustomType.Parameter("scriptVariables") Map<String,String> scriptVariables) {
        this.continueOnFailure = continueOnFailure;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryList = queryList;
        this.scriptVariables = scriptVariables;
    }

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
    */
    public Boolean continueOnFailure() {
        return this.continueOnFailure;
    }
    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
     * 
    */
    public List<String> jarFileUris() {
        return this.jarFileUris;
    }
    /**
     * Optional. The runtime log config for job execution.
     * 
    */
    public LoggingConfigResponse loggingConfig() {
        return this.loggingConfig;
    }
    /**
     * Optional. A mapping of property names to values, used to configure Pig. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
     * 
    */
    public Map<String,String> properties() {
        return this.properties;
    }
    /**
     * The HCFS URI of the script that contains the Pig queries.
     * 
    */
    public String queryFileUri() {
        return this.queryFileUri;
    }
    /**
     * A list of queries.
     * 
    */
    public QueryListResponse queryList() {
        return this.queryList;
    }
    /**
     * Optional. Mapping of query variable names to values (equivalent to the Pig command: name=[value]).
     * 
    */
    public Map<String,String> scriptVariables() {
        return this.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PigJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean continueOnFailure;
        private List<String> jarFileUris;
        private LoggingConfigResponse loggingConfig;
        private Map<String,String> properties;
        private String queryFileUri;
        private QueryListResponse queryList;
        private Map<String,String> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(PigJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder continueOnFailure(Boolean continueOnFailure) {
            this.continueOnFailure = Objects.requireNonNull(continueOnFailure);
            return this;
        }
        public Builder jarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        public Builder loggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
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
        public Builder scriptVariables(Map<String,String> scriptVariables) {
            this.scriptVariables = Objects.requireNonNull(scriptVariables);
            return this;
        }        public PigJobResponse build() {
            return new PigJobResponse(continueOnFailure, jarFileUris, loggingConfig, properties, queryFileUri, queryList, scriptVariables);
        }
    }
}
