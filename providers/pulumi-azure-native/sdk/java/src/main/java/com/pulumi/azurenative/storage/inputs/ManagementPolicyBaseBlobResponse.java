// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.DateAfterModificationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Management policy action for base blob.
 * 
 */
public final class ManagementPolicyBaseBlobResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagementPolicyBaseBlobResponse Empty = new ManagementPolicyBaseBlobResponse();

    /**
     * The function to delete the blob
     * 
     */
    @Import(name="delete")
    private @Nullable DateAfterModificationResponse delete;

    public Optional<DateAfterModificationResponse> delete() {
        return Optional.ofNullable(this.delete);
    }

    /**
     * This property enables auto tiering of a blob from cool to hot on a blob access. This property requires tierToCool.daysAfterLastAccessTimeGreaterThan.
     * 
     */
    @Import(name="enableAutoTierToHotFromCool")
    private @Nullable Boolean enableAutoTierToHotFromCool;

    public Optional<Boolean> enableAutoTierToHotFromCool() {
        return Optional.ofNullable(this.enableAutoTierToHotFromCool);
    }

    /**
     * The function to tier blobs to archive storage. Support blobs currently at Hot or Cool tier
     * 
     */
    @Import(name="tierToArchive")
    private @Nullable DateAfterModificationResponse tierToArchive;

    public Optional<DateAfterModificationResponse> tierToArchive() {
        return Optional.ofNullable(this.tierToArchive);
    }

    /**
     * The function to tier blobs to cool storage. Support blobs currently at Hot tier
     * 
     */
    @Import(name="tierToCool")
    private @Nullable DateAfterModificationResponse tierToCool;

    public Optional<DateAfterModificationResponse> tierToCool() {
        return Optional.ofNullable(this.tierToCool);
    }

    private ManagementPolicyBaseBlobResponse() {}

    private ManagementPolicyBaseBlobResponse(ManagementPolicyBaseBlobResponse $) {
        this.delete = $.delete;
        this.enableAutoTierToHotFromCool = $.enableAutoTierToHotFromCool;
        this.tierToArchive = $.tierToArchive;
        this.tierToCool = $.tierToCool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementPolicyBaseBlobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementPolicyBaseBlobResponse $;

        public Builder() {
            $ = new ManagementPolicyBaseBlobResponse();
        }

        public Builder(ManagementPolicyBaseBlobResponse defaults) {
            $ = new ManagementPolicyBaseBlobResponse(Objects.requireNonNull(defaults));
        }

        public Builder delete(@Nullable DateAfterModificationResponse delete) {
            $.delete = delete;
            return this;
        }

        public Builder enableAutoTierToHotFromCool(@Nullable Boolean enableAutoTierToHotFromCool) {
            $.enableAutoTierToHotFromCool = enableAutoTierToHotFromCool;
            return this;
        }

        public Builder tierToArchive(@Nullable DateAfterModificationResponse tierToArchive) {
            $.tierToArchive = tierToArchive;
            return this;
        }

        public Builder tierToCool(@Nullable DateAfterModificationResponse tierToCool) {
            $.tierToCool = tierToCool;
            return this;
        }

        public ManagementPolicyBaseBlobResponse build() {
            return $;
        }
    }

}
