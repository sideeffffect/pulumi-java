// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkerSettingsResponse {
    /**
     * @return The base URL for accessing Google Cloud APIs. When workers access Google Cloud APIs, they logically do so via relative URLs. If this field is specified, it supplies the base URL to use for resolving these relative URLs. The normative algorithm used is defined by RFC 1808, &#34;Relative Uniform Resource Locators&#34;. If not specified, the default value is &#34;http://www.googleapis.com/&#34;
     * 
     */
    private final String baseUrl;
    /**
     * @return Whether to send work progress updates to the service.
     * 
     */
    private final Boolean reportingEnabled;
    /**
     * @return The Cloud Dataflow service path relative to the root URL, for example, &#34;dataflow/v1b3/projects&#34;.
     * 
     */
    private final String servicePath;
    /**
     * @return The Shuffle service path relative to the root URL, for example, &#34;shuffle/v1beta1&#34;.
     * 
     */
    private final String shuffleServicePath;
    /**
     * @return The prefix of the resources the system should use for temporary storage. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    private final String tempStoragePrefix;
    /**
     * @return The ID of the worker running this pipeline.
     * 
     */
    private final String workerId;

    @CustomType.Constructor
    private WorkerSettingsResponse(
        @CustomType.Parameter("baseUrl") String baseUrl,
        @CustomType.Parameter("reportingEnabled") Boolean reportingEnabled,
        @CustomType.Parameter("servicePath") String servicePath,
        @CustomType.Parameter("shuffleServicePath") String shuffleServicePath,
        @CustomType.Parameter("tempStoragePrefix") String tempStoragePrefix,
        @CustomType.Parameter("workerId") String workerId) {
        this.baseUrl = baseUrl;
        this.reportingEnabled = reportingEnabled;
        this.servicePath = servicePath;
        this.shuffleServicePath = shuffleServicePath;
        this.tempStoragePrefix = tempStoragePrefix;
        this.workerId = workerId;
    }

    /**
     * @return The base URL for accessing Google Cloud APIs. When workers access Google Cloud APIs, they logically do so via relative URLs. If this field is specified, it supplies the base URL to use for resolving these relative URLs. The normative algorithm used is defined by RFC 1808, &#34;Relative Uniform Resource Locators&#34;. If not specified, the default value is &#34;http://www.googleapis.com/&#34;
     * 
     */
    public String baseUrl() {
        return this.baseUrl;
    }
    /**
     * @return Whether to send work progress updates to the service.
     * 
     */
    public Boolean reportingEnabled() {
        return this.reportingEnabled;
    }
    /**
     * @return The Cloud Dataflow service path relative to the root URL, for example, &#34;dataflow/v1b3/projects&#34;.
     * 
     */
    public String servicePath() {
        return this.servicePath;
    }
    /**
     * @return The Shuffle service path relative to the root URL, for example, &#34;shuffle/v1beta1&#34;.
     * 
     */
    public String shuffleServicePath() {
        return this.shuffleServicePath;
    }
    /**
     * @return The prefix of the resources the system should use for temporary storage. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    public String tempStoragePrefix() {
        return this.tempStoragePrefix;
    }
    /**
     * @return The ID of the worker running this pipeline.
     * 
     */
    public String workerId() {
        return this.workerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseUrl;
        private Boolean reportingEnabled;
        private String servicePath;
        private String shuffleServicePath;
        private String tempStoragePrefix;
        private String workerId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.reportingEnabled = defaults.reportingEnabled;
    	      this.servicePath = defaults.servicePath;
    	      this.shuffleServicePath = defaults.shuffleServicePath;
    	      this.tempStoragePrefix = defaults.tempStoragePrefix;
    	      this.workerId = defaults.workerId;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }
        public Builder reportingEnabled(Boolean reportingEnabled) {
            this.reportingEnabled = Objects.requireNonNull(reportingEnabled);
            return this;
        }
        public Builder servicePath(String servicePath) {
            this.servicePath = Objects.requireNonNull(servicePath);
            return this;
        }
        public Builder shuffleServicePath(String shuffleServicePath) {
            this.shuffleServicePath = Objects.requireNonNull(shuffleServicePath);
            return this;
        }
        public Builder tempStoragePrefix(String tempStoragePrefix) {
            this.tempStoragePrefix = Objects.requireNonNull(tempStoragePrefix);
            return this;
        }
        public Builder workerId(String workerId) {
            this.workerId = Objects.requireNonNull(workerId);
            return this;
        }        public WorkerSettingsResponse build() {
            return new WorkerSettingsResponse(baseUrl, reportingEnabled, servicePath, shuffleServicePath, tempStoragePrefix, workerId);
        }
    }
}
