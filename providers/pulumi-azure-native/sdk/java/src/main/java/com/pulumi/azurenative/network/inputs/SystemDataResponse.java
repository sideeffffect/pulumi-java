// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata pertaining to creation and last modification of the resource.
 * 
 */
public final class SystemDataResponse extends com.pulumi.resources.InvokeArgs {

    public static final SystemDataResponse Empty = new SystemDataResponse();

    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @Import(name="createdAt")
    private @Nullable String createdAt;

    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The identity that created the resource.
     * 
     */
    @Import(name="createdBy")
    private @Nullable String createdBy;

    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The type of identity that created the resource.
     * 
     */
    @Import(name="createdByType")
    private @Nullable String createdByType;

    public Optional<String> createdByType() {
        return Optional.ofNullable(this.createdByType);
    }

    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedAt")
    private @Nullable String lastModifiedAt;

    public Optional<String> lastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }

    /**
     * The identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedBy")
    private @Nullable String lastModifiedBy;

    public Optional<String> lastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }

    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedByType")
    private @Nullable String lastModifiedByType;

    public Optional<String> lastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }

    private SystemDataResponse() {}

    private SystemDataResponse(SystemDataResponse $) {
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.createdByType = $.createdByType;
        this.lastModifiedAt = $.lastModifiedAt;
        this.lastModifiedBy = $.lastModifiedBy;
        this.lastModifiedByType = $.lastModifiedByType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemDataResponse $;

        public Builder() {
            $ = new SystemDataResponse();
        }

        public Builder(SystemDataResponse defaults) {
            $ = new SystemDataResponse(Objects.requireNonNull(defaults));
        }

        public Builder createdAt(@Nullable String createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdBy(@Nullable String createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        public Builder createdByType(@Nullable String createdByType) {
            $.createdByType = createdByType;
            return this;
        }

        public Builder lastModifiedAt(@Nullable String lastModifiedAt) {
            $.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder lastModifiedBy(@Nullable String lastModifiedBy) {
            $.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder lastModifiedByType(@Nullable String lastModifiedByType) {
            $.lastModifiedByType = lastModifiedByType;
            return this;
        }

        public SystemDataResponse build() {
            return $;
        }
    }

}
