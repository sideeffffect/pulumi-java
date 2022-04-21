// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeploymentAtScopeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentAtScopeArgs Empty = new GetDeploymentAtScopeArgs();

    /**
     * The name of the deployment.
     * 
     */
    @Import(name="deploymentName", required=true)
    private String deploymentName;

    public String deploymentName() {
        return this.deploymentName;
    }

    /**
     * The resource scope.
     * 
     */
    @Import(name="scope", required=true)
    private String scope;

    public String scope() {
        return this.scope;
    }

    private GetDeploymentAtScopeArgs() {}

    private GetDeploymentAtScopeArgs(GetDeploymentAtScopeArgs $) {
        this.deploymentName = $.deploymentName;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentAtScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentAtScopeArgs $;

        public Builder() {
            $ = new GetDeploymentAtScopeArgs();
        }

        public Builder(GetDeploymentAtScopeArgs defaults) {
            $ = new GetDeploymentAtScopeArgs(Objects.requireNonNull(defaults));
        }

        public Builder deploymentName(String deploymentName) {
            $.deploymentName = deploymentName;
            return this;
        }

        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        public GetDeploymentAtScopeArgs build() {
            $.deploymentName = Objects.requireNonNull($.deploymentName, "expected parameter 'deploymentName' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
