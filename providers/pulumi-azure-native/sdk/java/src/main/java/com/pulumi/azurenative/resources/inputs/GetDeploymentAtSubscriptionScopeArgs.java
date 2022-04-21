// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeploymentAtSubscriptionScopeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentAtSubscriptionScopeArgs Empty = new GetDeploymentAtSubscriptionScopeArgs();

    /**
     * The name of the deployment.
     * 
     */
    @Import(name="deploymentName", required=true)
    private String deploymentName;

    public String deploymentName() {
        return this.deploymentName;
    }

    private GetDeploymentAtSubscriptionScopeArgs() {}

    private GetDeploymentAtSubscriptionScopeArgs(GetDeploymentAtSubscriptionScopeArgs $) {
        this.deploymentName = $.deploymentName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentAtSubscriptionScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentAtSubscriptionScopeArgs $;

        public Builder() {
            $ = new GetDeploymentAtSubscriptionScopeArgs();
        }

        public Builder(GetDeploymentAtSubscriptionScopeArgs defaults) {
            $ = new GetDeploymentAtSubscriptionScopeArgs(Objects.requireNonNull(defaults));
        }

        public Builder deploymentName(String deploymentName) {
            $.deploymentName = deploymentName;
            return this;
        }

        public GetDeploymentAtSubscriptionScopeArgs build() {
            $.deploymentName = Objects.requireNonNull($.deploymentName, "expected parameter 'deploymentName' to be non-null");
            return $;
        }
    }

}
