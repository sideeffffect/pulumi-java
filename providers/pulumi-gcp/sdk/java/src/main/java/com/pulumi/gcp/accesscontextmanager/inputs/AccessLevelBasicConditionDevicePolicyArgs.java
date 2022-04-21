// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyOsConstraintArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessLevelBasicConditionDevicePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessLevelBasicConditionDevicePolicyArgs Empty = new AccessLevelBasicConditionDevicePolicyArgs();

    /**
     * A list of allowed device management levels.
     * An empty list allows all management levels.
     * Each value may be one of `MANAGEMENT_UNSPECIFIED`, `NONE`, `BASIC`, and `COMPLETE`.
     * 
     */
    @Import(name="allowedDeviceManagementLevels")
    private @Nullable Output<List<String>> allowedDeviceManagementLevels;

    public Optional<Output<List<String>>> allowedDeviceManagementLevels() {
        return Optional.ofNullable(this.allowedDeviceManagementLevels);
    }

    /**
     * A list of allowed encryptions statuses.
     * An empty list allows all statuses.
     * Each value may be one of `ENCRYPTION_UNSPECIFIED`, `ENCRYPTION_UNSUPPORTED`, `UNENCRYPTED`, and `ENCRYPTED`.
     * 
     */
    @Import(name="allowedEncryptionStatuses")
    private @Nullable Output<List<String>> allowedEncryptionStatuses;

    public Optional<Output<List<String>>> allowedEncryptionStatuses() {
        return Optional.ofNullable(this.allowedEncryptionStatuses);
    }

    /**
     * A list of allowed OS versions.
     * An empty list allows all types and all versions.
     * Structure is documented below.
     * 
     */
    @Import(name="osConstraints")
    private @Nullable Output<List<AccessLevelBasicConditionDevicePolicyOsConstraintArgs>> osConstraints;

    public Optional<Output<List<AccessLevelBasicConditionDevicePolicyOsConstraintArgs>>> osConstraints() {
        return Optional.ofNullable(this.osConstraints);
    }

    /**
     * Whether the device needs to be approved by the customer admin.
     * 
     */
    @Import(name="requireAdminApproval")
    private @Nullable Output<Boolean> requireAdminApproval;

    public Optional<Output<Boolean>> requireAdminApproval() {
        return Optional.ofNullable(this.requireAdminApproval);
    }

    /**
     * Whether the device needs to be corp owned.
     * 
     */
    @Import(name="requireCorpOwned")
    private @Nullable Output<Boolean> requireCorpOwned;

    public Optional<Output<Boolean>> requireCorpOwned() {
        return Optional.ofNullable(this.requireCorpOwned);
    }

    /**
     * Whether or not screenlock is required for the DevicePolicy
     * to be true. Defaults to false.
     * 
     */
    @Import(name="requireScreenLock")
    private @Nullable Output<Boolean> requireScreenLock;

    public Optional<Output<Boolean>> requireScreenLock() {
        return Optional.ofNullable(this.requireScreenLock);
    }

    private AccessLevelBasicConditionDevicePolicyArgs() {}

    private AccessLevelBasicConditionDevicePolicyArgs(AccessLevelBasicConditionDevicePolicyArgs $) {
        this.allowedDeviceManagementLevels = $.allowedDeviceManagementLevels;
        this.allowedEncryptionStatuses = $.allowedEncryptionStatuses;
        this.osConstraints = $.osConstraints;
        this.requireAdminApproval = $.requireAdminApproval;
        this.requireCorpOwned = $.requireCorpOwned;
        this.requireScreenLock = $.requireScreenLock;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessLevelBasicConditionDevicePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessLevelBasicConditionDevicePolicyArgs $;

        public Builder() {
            $ = new AccessLevelBasicConditionDevicePolicyArgs();
        }

        public Builder(AccessLevelBasicConditionDevicePolicyArgs defaults) {
            $ = new AccessLevelBasicConditionDevicePolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedDeviceManagementLevels(@Nullable Output<List<String>> allowedDeviceManagementLevels) {
            $.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
            return this;
        }

        public Builder allowedDeviceManagementLevels(List<String> allowedDeviceManagementLevels) {
            return allowedDeviceManagementLevels(Output.of(allowedDeviceManagementLevels));
        }

        public Builder allowedDeviceManagementLevels(String... allowedDeviceManagementLevels) {
            return allowedDeviceManagementLevels(List.of(allowedDeviceManagementLevels));
        }

        public Builder allowedEncryptionStatuses(@Nullable Output<List<String>> allowedEncryptionStatuses) {
            $.allowedEncryptionStatuses = allowedEncryptionStatuses;
            return this;
        }

        public Builder allowedEncryptionStatuses(List<String> allowedEncryptionStatuses) {
            return allowedEncryptionStatuses(Output.of(allowedEncryptionStatuses));
        }

        public Builder allowedEncryptionStatuses(String... allowedEncryptionStatuses) {
            return allowedEncryptionStatuses(List.of(allowedEncryptionStatuses));
        }

        public Builder osConstraints(@Nullable Output<List<AccessLevelBasicConditionDevicePolicyOsConstraintArgs>> osConstraints) {
            $.osConstraints = osConstraints;
            return this;
        }

        public Builder osConstraints(List<AccessLevelBasicConditionDevicePolicyOsConstraintArgs> osConstraints) {
            return osConstraints(Output.of(osConstraints));
        }

        public Builder osConstraints(AccessLevelBasicConditionDevicePolicyOsConstraintArgs... osConstraints) {
            return osConstraints(List.of(osConstraints));
        }

        public Builder requireAdminApproval(@Nullable Output<Boolean> requireAdminApproval) {
            $.requireAdminApproval = requireAdminApproval;
            return this;
        }

        public Builder requireAdminApproval(Boolean requireAdminApproval) {
            return requireAdminApproval(Output.of(requireAdminApproval));
        }

        public Builder requireCorpOwned(@Nullable Output<Boolean> requireCorpOwned) {
            $.requireCorpOwned = requireCorpOwned;
            return this;
        }

        public Builder requireCorpOwned(Boolean requireCorpOwned) {
            return requireCorpOwned(Output.of(requireCorpOwned));
        }

        public Builder requireScreenLock(@Nullable Output<Boolean> requireScreenLock) {
            $.requireScreenLock = requireScreenLock;
            return this;
        }

        public Builder requireScreenLock(Boolean requireScreenLock) {
            return requireScreenLock(Output.of(requireScreenLock));
        }

        public AccessLevelBasicConditionDevicePolicyArgs build() {
            return $;
        }
    }

}
