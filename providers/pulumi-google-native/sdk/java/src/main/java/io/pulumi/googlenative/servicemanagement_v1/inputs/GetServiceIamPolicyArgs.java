// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServiceIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceIamPolicyArgs Empty = new GetServiceIamPolicyArgs();

    @InputImport(name="serviceId", required=true)
      private final String serviceId;

    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceIamPolicyArgs(String serviceId) {
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private GetServiceIamPolicyArgs() {
        this.serviceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceId = defaults.serviceId;
        }

        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public GetServiceIamPolicyArgs build() {
            return new GetServiceIamPolicyArgs(serviceId);
        }
    }
}
