// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubscriptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionArgs Empty = new GetSubscriptionArgs();

    @Import(name="developerId", required=true)
      private final String developerId;

    public String developerId() {
        return this.developerId;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    @Import(name="subscriptionId", required=true)
      private final String subscriptionId;

    public String subscriptionId() {
        return this.subscriptionId;
    }

    public GetSubscriptionArgs(
        String developerId,
        String organizationId,
        String subscriptionId) {
        this.developerId = Objects.requireNonNull(developerId, "expected parameter 'developerId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private GetSubscriptionArgs() {
        this.developerId = null;
        this.organizationId = null;
        this.subscriptionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String developerId;
        private String organizationId;
        private String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.developerId = defaults.developerId;
    	      this.organizationId = defaults.organizationId;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder developerId(String developerId) {
            this.developerId = Objects.requireNonNull(developerId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }        public GetSubscriptionArgs build() {
            return new GetSubscriptionArgs(developerId, organizationId, subscriptionId);
        }
    }
}
