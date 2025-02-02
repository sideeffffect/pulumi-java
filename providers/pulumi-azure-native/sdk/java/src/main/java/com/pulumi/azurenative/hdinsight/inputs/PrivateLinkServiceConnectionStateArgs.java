// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.azurenative.hdinsight.enums.PrivateLinkServiceConnectionStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The private link service connection state.
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * Whether there is further actions.
     * 
     */
    @Import(name="actionsRequired")
    private @Nullable Output<String> actionsRequired;

    /**
     * @return Whether there is further actions.
     * 
     */
    public Optional<Output<String>> actionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }

    /**
     * The optional description of the status.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The optional description of the status.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The concrete private link service connection.
     * 
     */
    @Import(name="status", required=true)
    private Output<Either<String,PrivateLinkServiceConnectionStatus>> status;

    /**
     * @return The concrete private link service connection.
     * 
     */
    public Output<Either<String,PrivateLinkServiceConnectionStatus>> status() {
        return this.status;
    }

    private PrivateLinkServiceConnectionStateArgs() {}

    private PrivateLinkServiceConnectionStateArgs(PrivateLinkServiceConnectionStateArgs $) {
        this.actionsRequired = $.actionsRequired;
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceConnectionStateArgs $;

        public Builder() {
            $ = new PrivateLinkServiceConnectionStateArgs();
        }

        public Builder(PrivateLinkServiceConnectionStateArgs defaults) {
            $ = new PrivateLinkServiceConnectionStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionsRequired Whether there is further actions.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(@Nullable Output<String> actionsRequired) {
            $.actionsRequired = actionsRequired;
            return this;
        }

        /**
         * @param actionsRequired Whether there is further actions.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(String actionsRequired) {
            return actionsRequired(Output.of(actionsRequired));
        }

        /**
         * @param description The optional description of the status.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The optional description of the status.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param status The concrete private link service connection.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<Either<String,PrivateLinkServiceConnectionStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The concrete private link service connection.
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,PrivateLinkServiceConnectionStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status The concrete private link service connection.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status The concrete private link service connection.
         * 
         * @return builder
         * 
         */
        public Builder status(PrivateLinkServiceConnectionStatus status) {
            return status(Either.ofRight(status));
        }

        public PrivateLinkServiceConnectionStateArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
