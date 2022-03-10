// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ClusterAuthenticatorGroupsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterAuthenticatorGroupsConfigArgs Empty = new ClusterAuthenticatorGroupsConfigArgs();

    /**
     * The name of the RBAC security group for use with Google security groups in Kubernetes RBAC. Group name must be in format `gke-security-groups@yourdomain.com`.
     * 
     */
    @InputImport(name="securityGroup", required=true)
      private final Input<String> securityGroup;

    public Input<String> getSecurityGroup() {
        return this.securityGroup;
    }

    public ClusterAuthenticatorGroupsConfigArgs(Input<String> securityGroup) {
        this.securityGroup = Objects.requireNonNull(securityGroup, "expected parameter 'securityGroup' to be non-null");
    }

    private ClusterAuthenticatorGroupsConfigArgs() {
        this.securityGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAuthenticatorGroupsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> securityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAuthenticatorGroupsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroup = defaults.securityGroup;
        }

        public Builder securityGroup(Input<String> securityGroup) {
            this.securityGroup = Objects.requireNonNull(securityGroup);
            return this;
        }

        public Builder securityGroup(String securityGroup) {
            this.securityGroup = Input.of(Objects.requireNonNull(securityGroup));
            return this;
        }
        public ClusterAuthenticatorGroupsConfigArgs build() {
            return new ClusterAuthenticatorGroupsConfigArgs(securityGroup);
        }
    }
}
