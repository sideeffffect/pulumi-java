// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SparkSqlBatchResponse {
    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    private final List<String> jarFileUris;
    /**
     * The HCFS URI of the script that contains Spark SQL queries to execute.
     * 
     */
    private final String queryFileUri;
    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";).
     * 
     */
    private final Map<String,String> queryVariables;

    @OutputCustomType.Constructor({"jarFileUris","queryFileUri","queryVariables"})
    private SparkSqlBatchResponse(
        List<String> jarFileUris,
        String queryFileUri,
        Map<String,String> queryVariables) {
        this.jarFileUris = jarFileUris;
        this.queryFileUri = queryFileUri;
        this.queryVariables = queryVariables;
    }

    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
    */
    public List<String> getJarFileUris() {
        return this.jarFileUris;
    }
    /**
     * The HCFS URI of the script that contains Spark SQL queries to execute.
     * 
    */
    public String getQueryFileUri() {
        return this.queryFileUri;
    }
    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";).
     * 
    */
    public Map<String,String> getQueryVariables() {
        return this.queryVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkSqlBatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> jarFileUris;
        private String queryFileUri;
        private Map<String,String> queryVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkSqlBatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryVariables = defaults.queryVariables;
        }

        public Builder setJarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }

        public Builder setQueryFileUri(String queryFileUri) {
            this.queryFileUri = Objects.requireNonNull(queryFileUri);
            return this;
        }

        public Builder setQueryVariables(Map<String,String> queryVariables) {
            this.queryVariables = Objects.requireNonNull(queryVariables);
            return this;
        }
        public SparkSqlBatchResponse build() {
            return new SparkSqlBatchResponse(jarFileUris, queryFileUri, queryVariables);
        }
    }
}
