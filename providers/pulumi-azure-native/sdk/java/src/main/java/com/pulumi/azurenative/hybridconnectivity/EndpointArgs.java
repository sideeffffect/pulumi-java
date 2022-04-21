// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridconnectivity;

import com.pulumi.azurenative.hybridconnectivity.enums.CreatedByType;
import com.pulumi.azurenative.hybridconnectivity.enums.Type;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The identity that created the resource.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The type of identity that created the resource.
     * 
     */
    @Import(name="createdByType")
    private @Nullable Output<Either<String,CreatedByType>> createdByType;

    public Optional<Output<Either<String,CreatedByType>>> createdByType() {
        return Optional.ofNullable(this.createdByType);
    }

    /**
     * The endpoint name.
     * 
     */
    @Import(name="endpointName")
    private @Nullable Output<String> endpointName;

    public Optional<Output<String>> endpointName() {
        return Optional.ofNullable(this.endpointName);
    }

    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    @Import(name="lastModifiedAt")
    private @Nullable Output<String> lastModifiedAt;

    public Optional<Output<String>> lastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }

    /**
     * The identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedBy")
    private @Nullable Output<String> lastModifiedBy;

    public Optional<Output<String>> lastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }

    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedByType")
    private @Nullable Output<Either<String,CreatedByType>> lastModifiedByType;

    public Optional<Output<Either<String,CreatedByType>>> lastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }

    /**
     * The resource Id of the connectivity endpoint (optional).
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The fully qualified Azure Resource manager identifier of the resource to be connected.
     * 
     */
    @Import(name="resourceUri", required=true)
    private Output<String> resourceUri;

    public Output<String> resourceUri() {
        return this.resourceUri;
    }

    /**
     * The type of endpoint.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,Type>> type;

    public Output<Either<String,Type>> type() {
        return this.type;
    }

    private EndpointArgs() {}

    private EndpointArgs(EndpointArgs $) {
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.createdByType = $.createdByType;
        this.endpointName = $.endpointName;
        this.lastModifiedAt = $.lastModifiedAt;
        this.lastModifiedBy = $.lastModifiedBy;
        this.lastModifiedByType = $.lastModifiedByType;
        this.resourceId = $.resourceId;
        this.resourceUri = $.resourceUri;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointArgs $;

        public Builder() {
            $ = new EndpointArgs();
        }

        public Builder(EndpointArgs defaults) {
            $ = new EndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        public Builder createdByType(@Nullable Output<Either<String,CreatedByType>> createdByType) {
            $.createdByType = createdByType;
            return this;
        }

        public Builder createdByType(Either<String,CreatedByType> createdByType) {
            return createdByType(Output.of(createdByType));
        }

        public Builder endpointName(@Nullable Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        public Builder lastModifiedAt(@Nullable Output<String> lastModifiedAt) {
            $.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder lastModifiedAt(String lastModifiedAt) {
            return lastModifiedAt(Output.of(lastModifiedAt));
        }

        public Builder lastModifiedBy(@Nullable Output<String> lastModifiedBy) {
            $.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder lastModifiedBy(String lastModifiedBy) {
            return lastModifiedBy(Output.of(lastModifiedBy));
        }

        public Builder lastModifiedByType(@Nullable Output<Either<String,CreatedByType>> lastModifiedByType) {
            $.lastModifiedByType = lastModifiedByType;
            return this;
        }

        public Builder lastModifiedByType(Either<String,CreatedByType> lastModifiedByType) {
            return lastModifiedByType(Output.of(lastModifiedByType));
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public Builder resourceUri(Output<String> resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        public Builder resourceUri(String resourceUri) {
            return resourceUri(Output.of(resourceUri));
        }

        public Builder type(Output<Either<String,Type>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,Type> type) {
            return type(Output.of(type));
        }

        public EndpointArgs build() {
            $.resourceUri = Objects.requireNonNull($.resourceUri, "expected parameter 'resourceUri' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
