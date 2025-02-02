// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestackhci;

import com.pulumi.azurenative.azurestackhci.enums.CreatedByType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ArcSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ArcSettingArgs Empty = new ArcSettingArgs();

    /**
     * The name of the proxy resource holding details of HCI ArcSetting information.
     * 
     */
    @Import(name="arcSettingName")
    private @Nullable Output<String> arcSettingName;

    /**
     * @return The name of the proxy resource holding details of HCI ArcSetting information.
     * 
     */
    public Optional<Output<String>> arcSettingName() {
        return Optional.ofNullable(this.arcSettingName);
    }

    /**
     * The name of the cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The identity that created the resource.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return The identity that created the resource.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The type of identity that created the resource.
     * 
     */
    @Import(name="createdByType")
    private @Nullable Output<Either<String,CreatedByType>> createdByType;

    /**
     * @return The type of identity that created the resource.
     * 
     */
    public Optional<Output<Either<String,CreatedByType>>> createdByType() {
        return Optional.ofNullable(this.createdByType);
    }

    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    @Import(name="lastModifiedAt")
    private @Nullable Output<String> lastModifiedAt;

    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    public Optional<Output<String>> lastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }

    /**
     * The identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedBy")
    private @Nullable Output<String> lastModifiedBy;

    /**
     * @return The identity that last modified the resource.
     * 
     */
    public Optional<Output<String>> lastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }

    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedByType")
    private @Nullable Output<Either<String,CreatedByType>> lastModifiedByType;

    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    public Optional<Output<Either<String,CreatedByType>>> lastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ArcSettingArgs() {}

    private ArcSettingArgs(ArcSettingArgs $) {
        this.arcSettingName = $.arcSettingName;
        this.clusterName = $.clusterName;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.createdByType = $.createdByType;
        this.lastModifiedAt = $.lastModifiedAt;
        this.lastModifiedBy = $.lastModifiedBy;
        this.lastModifiedByType = $.lastModifiedByType;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArcSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArcSettingArgs $;

        public Builder() {
            $ = new ArcSettingArgs();
        }

        public Builder(ArcSettingArgs defaults) {
            $ = new ArcSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arcSettingName The name of the proxy resource holding details of HCI ArcSetting information.
         * 
         * @return builder
         * 
         */
        public Builder arcSettingName(@Nullable Output<String> arcSettingName) {
            $.arcSettingName = arcSettingName;
            return this;
        }

        /**
         * @param arcSettingName The name of the proxy resource holding details of HCI ArcSetting information.
         * 
         * @return builder
         * 
         */
        public Builder arcSettingName(String arcSettingName) {
            return arcSettingName(Output.of(arcSettingName));
        }

        /**
         * @param clusterName The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param createdAt The timestamp of resource creation (UTC).
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The timestamp of resource creation (UTC).
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param createdBy The identity that created the resource.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy The identity that created the resource.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param createdByType The type of identity that created the resource.
         * 
         * @return builder
         * 
         */
        public Builder createdByType(@Nullable Output<Either<String,CreatedByType>> createdByType) {
            $.createdByType = createdByType;
            return this;
        }

        /**
         * @param createdByType The type of identity that created the resource.
         * 
         * @return builder
         * 
         */
        public Builder createdByType(Either<String,CreatedByType> createdByType) {
            return createdByType(Output.of(createdByType));
        }

        /**
         * @param createdByType The type of identity that created the resource.
         * 
         * @return builder
         * 
         */
        public Builder createdByType(String createdByType) {
            return createdByType(Either.ofLeft(createdByType));
        }

        /**
         * @param createdByType The type of identity that created the resource.
         * 
         * @return builder
         * 
         */
        public Builder createdByType(CreatedByType createdByType) {
            return createdByType(Either.ofRight(createdByType));
        }

        /**
         * @param lastModifiedAt The timestamp of resource last modification (UTC)
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedAt(@Nullable Output<String> lastModifiedAt) {
            $.lastModifiedAt = lastModifiedAt;
            return this;
        }

        /**
         * @param lastModifiedAt The timestamp of resource last modification (UTC)
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedAt(String lastModifiedAt) {
            return lastModifiedAt(Output.of(lastModifiedAt));
        }

        /**
         * @param lastModifiedBy The identity that last modified the resource.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedBy(@Nullable Output<String> lastModifiedBy) {
            $.lastModifiedBy = lastModifiedBy;
            return this;
        }

        /**
         * @param lastModifiedBy The identity that last modified the resource.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedBy(String lastModifiedBy) {
            return lastModifiedBy(Output.of(lastModifiedBy));
        }

        /**
         * @param lastModifiedByType The type of identity that last modified the resource.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedByType(@Nullable Output<Either<String,CreatedByType>> lastModifiedByType) {
            $.lastModifiedByType = lastModifiedByType;
            return this;
        }

        /**
         * @param lastModifiedByType The type of identity that last modified the resource.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedByType(Either<String,CreatedByType> lastModifiedByType) {
            return lastModifiedByType(Output.of(lastModifiedByType));
        }

        /**
         * @param lastModifiedByType The type of identity that last modified the resource.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedByType(String lastModifiedByType) {
            return lastModifiedByType(Either.ofLeft(lastModifiedByType));
        }

        /**
         * @param lastModifiedByType The type of identity that last modified the resource.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedByType(CreatedByType lastModifiedByType) {
            return lastModifiedByType(Either.ofRight(lastModifiedByType));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ArcSettingArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
