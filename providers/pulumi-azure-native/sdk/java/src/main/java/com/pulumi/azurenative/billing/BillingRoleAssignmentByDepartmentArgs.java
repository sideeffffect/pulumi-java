// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.billing;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BillingRoleAssignmentByDepartmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final BillingRoleAssignmentByDepartmentArgs Empty = new BillingRoleAssignmentByDepartmentArgs();

    /**
     * The ID that uniquely identifies a billing account.
     * 
     */
    @Import(name="billingAccountName", required=true)
    private Output<String> billingAccountName;

    public Output<String> billingAccountName() {
        return this.billingAccountName;
    }

    /**
     * The ID that uniquely identifies a role assignment.
     * 
     */
    @Import(name="billingRoleAssignmentName")
    private @Nullable Output<String> billingRoleAssignmentName;

    public Optional<Output<String>> billingRoleAssignmentName() {
        return Optional.ofNullable(this.billingRoleAssignmentName);
    }

    /**
     * The ID that uniquely identifies a department.
     * 
     */
    @Import(name="departmentName", required=true)
    private Output<String> departmentName;

    public Output<String> departmentName() {
        return this.departmentName;
    }

    /**
     * The principal id of the user to whom the role was assigned.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The principal tenant id of the user to whom the role was assigned.
     * 
     */
    @Import(name="principalTenantId")
    private @Nullable Output<String> principalTenantId;

    public Optional<Output<String>> principalTenantId() {
        return Optional.ofNullable(this.principalTenantId);
    }

    /**
     * The ID of the role definition.
     * 
     */
    @Import(name="roleDefinitionId")
    private @Nullable Output<String> roleDefinitionId;

    public Optional<Output<String>> roleDefinitionId() {
        return Optional.ofNullable(this.roleDefinitionId);
    }

    /**
     * The authentication type of the user, whether Organization or MSA, of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @Import(name="userAuthenticationType")
    private @Nullable Output<String> userAuthenticationType;

    public Optional<Output<String>> userAuthenticationType() {
        return Optional.ofNullable(this.userAuthenticationType);
    }

    /**
     * The email address of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @Import(name="userEmailAddress")
    private @Nullable Output<String> userEmailAddress;

    public Optional<Output<String>> userEmailAddress() {
        return Optional.ofNullable(this.userEmailAddress);
    }

    private BillingRoleAssignmentByDepartmentArgs() {}

    private BillingRoleAssignmentByDepartmentArgs(BillingRoleAssignmentByDepartmentArgs $) {
        this.billingAccountName = $.billingAccountName;
        this.billingRoleAssignmentName = $.billingRoleAssignmentName;
        this.departmentName = $.departmentName;
        this.principalId = $.principalId;
        this.principalTenantId = $.principalTenantId;
        this.roleDefinitionId = $.roleDefinitionId;
        this.userAuthenticationType = $.userAuthenticationType;
        this.userEmailAddress = $.userEmailAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BillingRoleAssignmentByDepartmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BillingRoleAssignmentByDepartmentArgs $;

        public Builder() {
            $ = new BillingRoleAssignmentByDepartmentArgs();
        }

        public Builder(BillingRoleAssignmentByDepartmentArgs defaults) {
            $ = new BillingRoleAssignmentByDepartmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder billingAccountName(Output<String> billingAccountName) {
            $.billingAccountName = billingAccountName;
            return this;
        }

        public Builder billingAccountName(String billingAccountName) {
            return billingAccountName(Output.of(billingAccountName));
        }

        public Builder billingRoleAssignmentName(@Nullable Output<String> billingRoleAssignmentName) {
            $.billingRoleAssignmentName = billingRoleAssignmentName;
            return this;
        }

        public Builder billingRoleAssignmentName(String billingRoleAssignmentName) {
            return billingRoleAssignmentName(Output.of(billingRoleAssignmentName));
        }

        public Builder departmentName(Output<String> departmentName) {
            $.departmentName = departmentName;
            return this;
        }

        public Builder departmentName(String departmentName) {
            return departmentName(Output.of(departmentName));
        }

        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        public Builder principalTenantId(@Nullable Output<String> principalTenantId) {
            $.principalTenantId = principalTenantId;
            return this;
        }

        public Builder principalTenantId(String principalTenantId) {
            return principalTenantId(Output.of(principalTenantId));
        }

        public Builder roleDefinitionId(@Nullable Output<String> roleDefinitionId) {
            $.roleDefinitionId = roleDefinitionId;
            return this;
        }

        public Builder roleDefinitionId(String roleDefinitionId) {
            return roleDefinitionId(Output.of(roleDefinitionId));
        }

        public Builder userAuthenticationType(@Nullable Output<String> userAuthenticationType) {
            $.userAuthenticationType = userAuthenticationType;
            return this;
        }

        public Builder userAuthenticationType(String userAuthenticationType) {
            return userAuthenticationType(Output.of(userAuthenticationType));
        }

        public Builder userEmailAddress(@Nullable Output<String> userEmailAddress) {
            $.userEmailAddress = userEmailAddress;
            return this;
        }

        public Builder userEmailAddress(String userEmailAddress) {
            return userEmailAddress(Output.of(userEmailAddress));
        }

        public BillingRoleAssignmentByDepartmentArgs build() {
            $.billingAccountName = Objects.requireNonNull($.billingAccountName, "expected parameter 'billingAccountName' to be non-null");
            $.departmentName = Objects.requireNonNull($.departmentName, "expected parameter 'departmentName' to be non-null");
            return $;
        }
    }

}
