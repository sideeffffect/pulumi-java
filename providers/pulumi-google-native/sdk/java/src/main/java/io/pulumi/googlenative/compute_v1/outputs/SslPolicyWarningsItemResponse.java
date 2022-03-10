// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.SslPolicyWarningsItemDataItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SslPolicyWarningsItemResponse {
    /**
     * A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
     */
    private final String code;
    /**
     * Metadata about this warning in key: value format. For example: "data": [ { "key": "scope", "value": "zones/us-east1-d" }
     * 
     */
    private final List<SslPolicyWarningsItemDataItemResponse> data;
    /**
     * A human-readable description of the warning code.
     * 
     */
    private final String message;

    @OutputCustomType.Constructor
    private SslPolicyWarningsItemResponse(
        @OutputCustomType.Parameter("code") String code,
        @OutputCustomType.Parameter("data") List<SslPolicyWarningsItemDataItemResponse> data,
        @OutputCustomType.Parameter("message") String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    /**
     * A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * Metadata about this warning in key: value format. For example: "data": [ { "key": "scope", "value": "zones/us-east1-d" }
     * 
    */
    public List<SslPolicyWarningsItemDataItemResponse> getData() {
        return this.data;
    }
    /**
     * A human-readable description of the warning code.
     * 
    */
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslPolicyWarningsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private List<SslPolicyWarningsItemDataItemResponse> data;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(SslPolicyWarningsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.data = defaults.data;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder data(List<SslPolicyWarningsItemDataItemResponse> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public SslPolicyWarningsItemResponse build() {
            return new SslPolicyWarningsItemResponse(code, data, message);
        }
    }
}
