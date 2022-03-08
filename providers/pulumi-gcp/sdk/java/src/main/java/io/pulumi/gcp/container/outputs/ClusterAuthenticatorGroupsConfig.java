// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterAuthenticatorGroupsConfig {
    /**
     * The name of the RBAC security group for use with Google security groups in Kubernetes RBAC. Group name must be in format `gke-security-groups@yourdomain.com`.
     * 
     */
    private final String securityGroup;

    @OutputCustomType.Constructor({"securityGroup"})
    private ClusterAuthenticatorGroupsConfig(String securityGroup) {
        this.securityGroup = securityGroup;
    }

    /**
     * The name of the RBAC security group for use with Google security groups in Kubernetes RBAC. Group name must be in format `gke-security-groups@yourdomain.com`.
     * 
    */
    public String getSecurityGroup() {
        return this.securityGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAuthenticatorGroupsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String securityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAuthenticatorGroupsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroup = defaults.securityGroup;
        }

        public Builder setSecurityGroup(String securityGroup) {
            this.securityGroup = Objects.requireNonNull(securityGroup);
            return this;
        }
        public ClusterAuthenticatorGroupsConfig build() {
            return new ClusterAuthenticatorGroupsConfig(securityGroup);
        }
    }
}
