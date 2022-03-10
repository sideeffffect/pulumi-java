// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetGatewayResult {
    /**
     * Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}
     * 
     */
    private final String apiConfig;
    /**
     * Created time.
     * 
     */
    private final String createTime;
    /**
     * The default API Gateway host name of the form `{gateway_id}-{hash}.{region_code}.gateway.dev`.
     * 
     */
    private final String defaultHostname;
    /**
     * Optional. Display name.
     * 
     */
    private final String displayName;
    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    private final Map<String,String> labels;
    /**
     * Resource name of the Gateway. Format: projects/{project}/locations/{location}/gateways/{gateway}
     * 
     */
    private final String name;
    /**
     * The current state of the Gateway.
     * 
     */
    private final String state;
    /**
     * Updated time.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor
    private GetGatewayResult(
        @OutputCustomType.Parameter("apiConfig") String apiConfig,
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("defaultHostname") String defaultHostname,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("updateTime") String updateTime) {
        this.apiConfig = apiConfig;
        this.createTime = createTime;
        this.defaultHostname = defaultHostname;
        this.displayName = displayName;
        this.labels = labels;
        this.name = name;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}
     * 
    */
    public String getApiConfig() {
        return this.apiConfig;
    }
    /**
     * Created time.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The default API Gateway host name of the form `{gateway_id}-{hash}.{region_code}.gateway.dev`.
     * 
    */
    public String getDefaultHostname() {
        return this.defaultHostname;
    }
    /**
     * Optional. Display name.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Resource name of the Gateway. Format: projects/{project}/locations/{location}/gateways/{gateway}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The current state of the Gateway.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Updated time.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiConfig;
        private String createTime;
        private String defaultHostname;
        private String displayName;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiConfig = defaults.apiConfig;
    	      this.createTime = defaults.createTime;
    	      this.defaultHostname = defaults.defaultHostname;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder apiConfig(String apiConfig) {
            this.apiConfig = Objects.requireNonNull(apiConfig);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder defaultHostname(String defaultHostname) {
            this.defaultHostname = Objects.requireNonNull(defaultHostname);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetGatewayResult build() {
            return new GetGatewayResult(apiConfig, createTime, defaultHostname, displayName, labels, name, state, updateTime);
        }
    }
}
