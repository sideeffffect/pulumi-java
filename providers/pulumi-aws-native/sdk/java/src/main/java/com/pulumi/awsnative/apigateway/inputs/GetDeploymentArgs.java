// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetDeploymentArgs extends InvokeArgs {

    public static final GetDeploymentArgs Empty = new GetDeploymentArgs();

    /**
     * Primary Id for this resource
     * 
     */
    @Import(name="deploymentId", required=true)
    private String deploymentId;

    /**
     * @return Primary Id for this resource
     * 
     */
    public String deploymentId() {
        return this.deploymentId;
    }

    /**
     * The ID of the RestApi resource to deploy.
     * 
     */
    @Import(name="restApiId", required=true)
    private String restApiId;

    /**
     * @return The ID of the RestApi resource to deploy.
     * 
     */
    public String restApiId() {
        return this.restApiId;
    }

    private GetDeploymentArgs() {}

    private GetDeploymentArgs(GetDeploymentArgs $) {
        this.deploymentId = $.deploymentId;
        this.restApiId = $.restApiId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentArgs $;

        public Builder() {
            $ = new GetDeploymentArgs();
        }

        public Builder(GetDeploymentArgs defaults) {
            $ = new GetDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentId Primary Id for this resource
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(String deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        /**
         * @param restApiId The ID of the RestApi resource to deploy.
         * 
         * @return builder
         * 
         */
        public Builder restApiId(String restApiId) {
            $.restApiId = restApiId;
            return this;
        }

        public GetDeploymentArgs build() {
            $.deploymentId = Objects.requireNonNull($.deploymentId, "expected parameter 'deploymentId' to be non-null");
            $.restApiId = Objects.requireNonNull($.restApiId, "expected parameter 'restApiId' to be non-null");
            return $;
        }
    }

}
