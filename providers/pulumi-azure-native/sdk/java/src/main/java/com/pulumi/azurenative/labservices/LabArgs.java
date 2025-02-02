// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices;

import com.pulumi.azurenative.labservices.enums.LabUserAccessMode;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LabArgs extends com.pulumi.resources.ResourceArgs {

    public static final LabArgs Empty = new LabArgs();

    /**
     * The name of the lab Account.
     * 
     */
    @Import(name="labAccountName", required=true)
    private Output<String> labAccountName;

    /**
     * @return The name of the lab Account.
     * 
     */
    public Output<String> labAccountName() {
        return this.labAccountName;
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName")
    private @Nullable Output<String> labName;

    /**
     * @return The name of the lab.
     * 
     */
    public Optional<Output<String>> labName() {
        return Optional.ofNullable(this.labName);
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Maximum number of users allowed in the lab.
     * 
     */
    @Import(name="maxUsersInLab")
    private @Nullable Output<Integer> maxUsersInLab;

    /**
     * @return Maximum number of users allowed in the lab.
     * 
     */
    public Optional<Output<Integer>> maxUsersInLab() {
        return Optional.ofNullable(this.maxUsersInLab);
    }

    /**
     * The provisioning status of the resource.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Optional<Output<String>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @Import(name="uniqueIdentifier")
    private @Nullable Output<String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Optional<Output<String>> uniqueIdentifier() {
        return Optional.ofNullable(this.uniqueIdentifier);
    }

    /**
     * Maximum duration a user can use an environment for in the lab.
     * 
     */
    @Import(name="usageQuota")
    private @Nullable Output<String> usageQuota;

    /**
     * @return Maximum duration a user can use an environment for in the lab.
     * 
     */
    public Optional<Output<String>> usageQuota() {
        return Optional.ofNullable(this.usageQuota);
    }

    /**
     * Lab user access mode (open to all vs. restricted to those listed on the lab).
     * 
     */
    @Import(name="userAccessMode")
    private @Nullable Output<Either<String,LabUserAccessMode>> userAccessMode;

    /**
     * @return Lab user access mode (open to all vs. restricted to those listed on the lab).
     * 
     */
    public Optional<Output<Either<String,LabUserAccessMode>>> userAccessMode() {
        return Optional.ofNullable(this.userAccessMode);
    }

    private LabArgs() {}

    private LabArgs(LabArgs $) {
        this.labAccountName = $.labAccountName;
        this.labName = $.labName;
        this.location = $.location;
        this.maxUsersInLab = $.maxUsersInLab;
        this.provisioningState = $.provisioningState;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.uniqueIdentifier = $.uniqueIdentifier;
        this.usageQuota = $.usageQuota;
        this.userAccessMode = $.userAccessMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabArgs $;

        public Builder() {
            $ = new LabArgs();
        }

        public Builder(LabArgs defaults) {
            $ = new LabArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labAccountName The name of the lab Account.
         * 
         * @return builder
         * 
         */
        public Builder labAccountName(Output<String> labAccountName) {
            $.labAccountName = labAccountName;
            return this;
        }

        /**
         * @param labAccountName The name of the lab Account.
         * 
         * @return builder
         * 
         */
        public Builder labAccountName(String labAccountName) {
            return labAccountName(Output.of(labAccountName));
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(@Nullable Output<String> labName) {
            $.labName = labName;
            return this;
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(String labName) {
            return labName(Output.of(labName));
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maxUsersInLab Maximum number of users allowed in the lab.
         * 
         * @return builder
         * 
         */
        public Builder maxUsersInLab(@Nullable Output<Integer> maxUsersInLab) {
            $.maxUsersInLab = maxUsersInLab;
            return this;
        }

        /**
         * @param maxUsersInLab Maximum number of users allowed in the lab.
         * 
         * @return builder
         * 
         */
        public Builder maxUsersInLab(Integer maxUsersInLab) {
            return maxUsersInLab(Output.of(maxUsersInLab));
        }

        /**
         * @param provisioningState The provisioning status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState The provisioning status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param uniqueIdentifier The unique immutable identifier of a resource (Guid).
         * 
         * @return builder
         * 
         */
        public Builder uniqueIdentifier(@Nullable Output<String> uniqueIdentifier) {
            $.uniqueIdentifier = uniqueIdentifier;
            return this;
        }

        /**
         * @param uniqueIdentifier The unique immutable identifier of a resource (Guid).
         * 
         * @return builder
         * 
         */
        public Builder uniqueIdentifier(String uniqueIdentifier) {
            return uniqueIdentifier(Output.of(uniqueIdentifier));
        }

        /**
         * @param usageQuota Maximum duration a user can use an environment for in the lab.
         * 
         * @return builder
         * 
         */
        public Builder usageQuota(@Nullable Output<String> usageQuota) {
            $.usageQuota = usageQuota;
            return this;
        }

        /**
         * @param usageQuota Maximum duration a user can use an environment for in the lab.
         * 
         * @return builder
         * 
         */
        public Builder usageQuota(String usageQuota) {
            return usageQuota(Output.of(usageQuota));
        }

        /**
         * @param userAccessMode Lab user access mode (open to all vs. restricted to those listed on the lab).
         * 
         * @return builder
         * 
         */
        public Builder userAccessMode(@Nullable Output<Either<String,LabUserAccessMode>> userAccessMode) {
            $.userAccessMode = userAccessMode;
            return this;
        }

        /**
         * @param userAccessMode Lab user access mode (open to all vs. restricted to those listed on the lab).
         * 
         * @return builder
         * 
         */
        public Builder userAccessMode(Either<String,LabUserAccessMode> userAccessMode) {
            return userAccessMode(Output.of(userAccessMode));
        }

        /**
         * @param userAccessMode Lab user access mode (open to all vs. restricted to those listed on the lab).
         * 
         * @return builder
         * 
         */
        public Builder userAccessMode(String userAccessMode) {
            return userAccessMode(Either.ofLeft(userAccessMode));
        }

        /**
         * @param userAccessMode Lab user access mode (open to all vs. restricted to those listed on the lab).
         * 
         * @return builder
         * 
         */
        public Builder userAccessMode(LabUserAccessMode userAccessMode) {
            return userAccessMode(Either.ofRight(userAccessMode));
        }

        public LabArgs build() {
            $.labAccountName = Objects.requireNonNull($.labAccountName, "expected parameter 'labAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
