// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The role based access control (RBAC) authorization type integration runtime.
 * 
 */
public final class LinkedIntegrationRuntimeRbacAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkedIntegrationRuntimeRbacAuthorizationArgs Empty = new LinkedIntegrationRuntimeRbacAuthorizationArgs();

    /**
     * The authorization type for integration runtime sharing.
     * Expected value is &#39;RBAC&#39;.
     * 
     */
    @Import(name="authorizationType", required=true)
    private Output<String> authorizationType;

    public Output<String> authorizationType() {
        return this.authorizationType;
    }

    /**
     * The resource identifier of the integration runtime to be shared.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    private LinkedIntegrationRuntimeRbacAuthorizationArgs() {}

    private LinkedIntegrationRuntimeRbacAuthorizationArgs(LinkedIntegrationRuntimeRbacAuthorizationArgs $) {
        this.authorizationType = $.authorizationType;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedIntegrationRuntimeRbacAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedIntegrationRuntimeRbacAuthorizationArgs $;

        public Builder() {
            $ = new LinkedIntegrationRuntimeRbacAuthorizationArgs();
        }

        public Builder(LinkedIntegrationRuntimeRbacAuthorizationArgs defaults) {
            $ = new LinkedIntegrationRuntimeRbacAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizationType(Output<String> authorizationType) {
            $.authorizationType = authorizationType;
            return this;
        }

        public Builder authorizationType(String authorizationType) {
            return authorizationType(Output.of(authorizationType));
        }

        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public LinkedIntegrationRuntimeRbacAuthorizationArgs build() {
            $.authorizationType = Codegen.stringProp("authorizationType").output().arg($.authorizationType).require();
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
