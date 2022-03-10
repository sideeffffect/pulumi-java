// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class OrganizationAdminAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationAdminAccountArgs Empty = new OrganizationAdminAccountArgs();

    /**
     * AWS account identifier to designate as a delegated administrator for GuardDuty.
     * 
     */
    @InputImport(name="adminAccountId", required=true)
      private final Input<String> adminAccountId;

    public Input<String> getAdminAccountId() {
        return this.adminAccountId;
    }

    public OrganizationAdminAccountArgs(Input<String> adminAccountId) {
        this.adminAccountId = Objects.requireNonNull(adminAccountId, "expected parameter 'adminAccountId' to be non-null");
    }

    private OrganizationAdminAccountArgs() {
        this.adminAccountId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationAdminAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> adminAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationAdminAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminAccountId = defaults.adminAccountId;
        }

        public Builder adminAccountId(Input<String> adminAccountId) {
            this.adminAccountId = Objects.requireNonNull(adminAccountId);
            return this;
        }

        public Builder adminAccountId(String adminAccountId) {
            this.adminAccountId = Input.of(Objects.requireNonNull(adminAccountId));
            return this;
        }
        public OrganizationAdminAccountArgs build() {
            return new OrganizationAdminAccountArgs(adminAccountId);
        }
    }
}
